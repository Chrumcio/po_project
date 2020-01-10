import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';

@Component({
  selector: 'app-szukaj-base',
  templateUrl: './szukaj-base.component.html',
  styleUrls: ['./szukaj-base.component.css']
})
export class SzukajBaseComponent implements OnInit {

  constructor(private router: Router,private konto:KontoSerwis) { }

  ngOnInit() {
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }
}
