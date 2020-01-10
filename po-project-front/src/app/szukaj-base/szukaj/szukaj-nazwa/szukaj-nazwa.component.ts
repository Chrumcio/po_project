import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms';
import { Paczka } from '../../../model/paczka';
import { ListaPaczekComponent } from '../../../lista-paczek/lista-paczek.component';
import { PaczkaService } from 'src/app/serwis/paczka.service';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';

@Component({
  selector: 'app-szukaj-nazwa',
  templateUrl: './szukaj-nazwa.component.html',
  styleUrls: ['./szukaj-nazwa.component.css']
})
export class SzukajNazwaComponent implements OnInit {

  nazwa: string;
  paczka: Paczka;
  list: Array<string> = ["Laptop","Smartfon"];

  @ViewChild("szukanieNazwaForm",{static: false}) formularz: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private paczkaSerwis: PaczkaService, private _location: Location, private konto: KontoSerwis) { }

  ngOnInit() {
  }

  szukaj() {
    if(this.formularz.valid){
      this.nazwa = this.formularz.controls.nazwa.value;
      for(let paczkaList of this.list){
        if(this.nazwa == paczkaList){
          this.paczkaSerwis.getPaczkaByName(this.nazwa).subscribe(data =>{
            this.paczka = data;
            if(this.paczka != null){
              this.router.navigate(['../wyniki'],{relativeTo: this.route})
            }else{
              this.router.navigate(['','']);// adres do alertu o braku paczki w magazynie
            }
          });
        }else{
          this.router.navigate(['','']);//adres do alertu o braku takiej nazwy paczki
        }
      }
    }
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }

}
