import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';

@Component({
  selector: 'app-szukaj',
  templateUrl: './szukaj.component.html',
  styleUrls: ['./szukaj.component.css']
})
export class SzukajComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private router: Router,private konto:KontoSerwis) { }

  ngOnInit() {
  }

  szukajNazwa(){
    this.router.navigate(['nazwa'],{relativeTo: this.activatedRoute});
  }

  szukajKategoria(){
    this.router.navigate(['kategoria'],{relativeTo: this.activatedRoute});
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }

}
