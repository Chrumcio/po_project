import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Konto } from '../../model/konto';
import { NgForm } from '@angular/forms';
import { Location } from '@angular/common';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';
import { KlientService } from 'src/app/serwis/klient.service';
import { Klient } from 'src/app/model/klient';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})

export class LoginFormComponent implements OnInit {

  konto: Konto;
  login: string;
  haslo: string;
  alert: string;
  
  @ViewChild("logowanieForm",{static: false}) formularz: NgForm;

  constructor(private kontoSerwis: KontoSerwis, private _location: Location, private klientSerwis: KlientService) { }

  ngOnInit() {
    this.konto = new Konto();
    this.login = null;
    this.haslo = null;
    this.alert = null;
  }

  zaloguj(){
    var l:string;
    var p:string;
    var konto1:Konto
    konto1 = null;
    if(this.formularz.valid){
      l = this.formularz.controls.login.value;
      p = this.formularz.controls.haslo.value;
      this.kontoSerwis.getKontoByLoginPassword(l,p).subscribe(data => {
        konto1 = data;
        if(konto1 != null){
          this.alert = "";
          this.konto = konto1;
          this.kontoSerwis.setczyZalogowany(true);
          this.kontoSerwis.konto = data;
        }else{
          this.formularz.controls.login.setValue("");
          this.formularz.controls.haslo.setValue("");
          this.alert = "Podano błędne dane logowania!";
        }
      });
    }
  }

}
