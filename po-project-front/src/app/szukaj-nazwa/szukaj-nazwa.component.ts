import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms';
import { PaczkaService } from '../serwis/paczka.service';
import { Paczka } from '../model/paczka';

@Component({
  selector: 'app-szukaj-nazwa',
  templateUrl: './szukaj-nazwa.component.html',
  styleUrls: ['./szukaj-nazwa.component.css']
})
export class SzukajNazwaComponent implements OnInit {

  nazwa: string;
  paczka: Paczka;

  @ViewChild("szukanieNazwaForm",{static: false}) formularz: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private paczkaSerwis: PaczkaService, private _location: Location, private konto: KontoSerwis) { }

  ngOnInit() {
  }

  szukaj() {
    if(this.formularz.valid){
      this.nazwa = this.formularz.controls.nazwa.value;
      this.paczkaSerwis.getPaczkaByName(this.nazwa).subscribe(data => {
        this.paczka = data;
        if(this.paczka != null){
          this.router.navigate(['/','listaPaczek']);
        }else{

        }
      });
    }
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }

}
