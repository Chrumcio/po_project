import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-szukaj-nazwa',
  templateUrl: './szukaj-nazwa.component.html',
  styleUrls: ['./szukaj-nazwa.component.css']
})
export class SzukajNazwaComponent implements OnInit {

  nazwa: string;

  @ViewChild("szukanieNazwaForm",{static: false}) formularz: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private kontoSerwis: KontoSerwis, private _location: Location) { }

  ngOnInit() {
  }

  szukaj() {
    if(this.formularz.valid){
      this.nazwa = this.formularz.controls.nazwa.value;
      console.log(this.nazwa);
    }
  }

}
