import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Klient } from '../model/klient';
import { KlientService } from '../serwis/klient.service';
import { UzytkownikService } from '../serwis/uzytkownik.service';
import { Uzytkownik } from '../model/uzytkownik';
import { TypKonta } from '../model/typkonta';
import { TypkontaService } from '../serwis/typkonta.service';

@Component({
  selector: 'app-szukaj-base',
  templateUrl: './szukaj-base.component.html',
  styleUrls: ['./szukaj-base.component.css']
})
export class SzukajBaseComponent implements OnInit {

  klient: Klient;
  uzytkownik: Uzytkownik;
  typKonta: TypKonta;

  constructor(private router: Router,private konto:KontoSerwis, private klientSerwis: KlientService, private uzytkownikSerwis: UzytkownikService, private typKontaSerwis: TypkontaService) { }

  ngOnInit() {
    this.klient = new Klient();
    this.typKonta = new TypKonta();
    if (this.konto.konto.typ_kontaid.id == 2) {
      this.klientSerwis.getKlientByKontoId(this.konto.konto.id).subscribe(item => {
        this.klient = item;
      });
    } else if (this.konto.konto.typ_kontaid.id == 1) {
      this.uzytkownikSerwis.getUzytkownikByKontoId(1).subscribe(elem => {
        this.uzytkownik = elem;
        this.klient.imie = this.uzytkownik.imie;
        this.klient.nazwisko = this.uzytkownik.nazwisko;
      });
    }
    this.typKontaSerwis.getTypKontaById(this.konto.konto.typ_kontaid.id).subscribe(data => {
      this.typKonta = data;
    });
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
    this.router.navigate(['/','home']);
  }
}
