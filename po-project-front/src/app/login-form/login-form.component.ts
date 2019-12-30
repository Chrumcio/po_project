import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Konto } from '../model/konto';
import { NgForm } from '@angular/forms';
import { Location } from '@angular/common';

@Component({
  selector: 'app-login-form',
  template: `
    <app-zalogowano [childMessage]="konto"></app-zalogowano>
  `,
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})

export class LoginFormComponent implements OnInit {

  public minDate: Date = new Date ("01/01/1980");
  public maxDate: Date = new Date ("12/31/2080");
  public value: Date = new Date ();

  konto: Konto;
  login: string;
  haslo: string;
  alert: string;
  
  @ViewChild("logowanieForm",{static: false}) formularz: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private kontoSerwis: KontoSerwis, private _location: Location) { }

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
          this.router.navigate(['/','loginHome']);
        }else{
          this.formularz.controls.login.setValue("");
          this.formularz.controls.haslo.setValue("");
          this.alert = "Podano błędne dane logowania!";
        }
      });
    }
  }

}
