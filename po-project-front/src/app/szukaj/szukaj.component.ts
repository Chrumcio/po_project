import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';

@Component({
  selector: 'app-szukaj',
  templateUrl: './szukaj.component.html',
  styleUrls: ['./szukaj.component.css']
})
export class SzukajComponent implements OnInit {

  constructor(private router: Router,private konto:KontoSerwis) { }

  ngOnInit() {
  }

  szukajNazwa(){
    this.router.navigate(['/','szukajNazwa']);
  }

  szukajKategoria(){
    this.router.navigate(['/','szukajKategoria']);
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }

}
