import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Klient } from '../model/klient';
import { KlientService } from '../serwis/klient.service';
import { UzytkownikService } from '../serwis/uzytkownik.service';
import { Uzytkownik } from '../model/uzytkownik';

@Component({
  selector: 'app-szukaj-base',
  templateUrl: './szukaj-base.component.html',
  styleUrls: ['./szukaj-base.component.css']
})
export class SzukajBaseComponent implements OnInit {

  klient: Klient;
  uzytkownik: Uzytkownik;

  constructor(private router: Router,private konto:KontoSerwis, private klientSerwis: KlientService, private uzytkownikSerwis: UzytkownikService) { }

  ngOnInit() {
    this.klient = new Klient();
    if(this.konto.konto.id == 1){
      this.klientSerwis.getKlientByKontoId(this.konto.konto.id).subscribe(item => {   
        debugger;
        this.klient = item;
      });
    } else if(this.konto.konto.id == 2){
        this.uzytkownikSerwis.getUzytkownikByKontoId(this.konto.konto.id).subscribe(elem => {
          this.uzytkownik = elem;
          this.klient.imie = this.uzytkownik.imie;
          this.klient.nazwisko = this.uzytkownik.nazwisko;
        });
    }
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }
}
