import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KontoSerwis } from '../serwis/konto.serwis';
import { KlientService } from '../serwis/klient.service';
import { UzytkownikService } from '../serwis/uzytkownik.service';
import { TypkontaService } from '../serwis/typkonta.service';
import { Klient } from '../model/klient';
import { Uzytkownik } from '../model/uzytkownik';
import { TypKonta } from '../model/typkonta';

@Component({
  selector: 'app-generate-base',
  templateUrl: './generate-base.component.html',
  styleUrls: ['./generate-base.component.css']
})
export class GenerateBaseComponent implements OnInit {

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
