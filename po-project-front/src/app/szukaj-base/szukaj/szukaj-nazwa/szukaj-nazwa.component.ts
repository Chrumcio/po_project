import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms';
import { Paczka } from '../../../model/paczka';
import { PaczkaService } from 'src/app/serwis/paczka.service';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-szukaj-nazwa',
  templateUrl: './szukaj-nazwa.component.html',
  styleUrls: ['./szukaj-nazwa.component.css']
})
export class SzukajNazwaComponent implements OnInit {

  nazwa: string;
  paczka: Paczka[];
  listName: Array<string> = ["Laptop","Smartfon"];

  @ViewChild("szukanieNazwaForm",{static: false}) formularz: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private paczkaSerwis: PaczkaService, private _location: Location, private konto: KontoSerwis) { }

  ngOnInit() {
    this.paczka = [];
  }

  szukaj() {
    if(this.formularz.valid){
      this.nazwa = this.formularz.controls.nazwa.value;
        let name = this.listName.find(item => {
          return this.nazwa === item;
        });
        if(name != null){
          this.paczkaSerwis.getPaczkaByName(this.nazwa).pipe(map(el => {
            if(el != null){
              for(let e of el){
                e.kod_kreskowy = e.kod_kreskowy % 1000;
              }
              return el;
            }
          })).subscribe(data =>{
            this.paczka = data;
            this.paczkaSerwis.listPaczka = data;
            if(this.paczka != null){
              this.router.navigate(['../wyniki'],{relativeTo: this.route})
            }else{
              this.router.navigate(['../error'],{relativeTo: this.route, state: {errorMessage: "Brak podanej paczki w magazynie", errorPath: "/home"}});// adres do alertu o braku paczki w magazynie
            }
          });
        }else{
          this.router.navigate(['../error'],{relativeTo: this.route, state: {errorMessage: "Wprowadzono błędną nazwę paczki", errorPath: "../nazwa"}});//adres do alertu o braku takiej nazwy paczki
        }
      }
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }

}
