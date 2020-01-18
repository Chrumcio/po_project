import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { LoginFormComponent } from '../login-form/login-form.component';
import { Konto } from '../../model/konto';
import { KontoSerwis } from '../../serwis/konto.serwis';
import { KlientService } from 'src/app/serwis/klient.service';
import { Klient } from 'src/app/model/klient';
import { UzytkownikService } from 'src/app/serwis/uzytkownik.service';
import { Uzytkownik } from 'src/app/model/uzytkownik';
import { TypkontaService } from 'src/app/serwis/typkonta.service';
import { TypKonta } from 'src/app/model/typkonta';

@Component({
  selector: 'app-zalogowano',
  templateUrl: './zalogowano.component.html',
  styleUrls: ['./zalogowano.component.css']
})
export class ZalogowanoComponent implements OnInit {

  klient: Klient;
  uzytkownik: Uzytkownik;
  typKonta: TypKonta;

  constructor(private konto: KontoSerwis, private klientSerwis: KlientService, private uzytkownikSerwis: UzytkownikService, private typKontaSerwis: TypkontaService) { }

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

  logoutUser() {
    this.konto.setczyZalogowany(false);
  }

}
