import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { LoginFormComponent } from '../login-form/login-form.component';
import { Konto } from '../../model/konto';
import { KontoSerwis } from '../../serwis/konto.serwis';
import { KlientService } from 'src/app/serwis/klient.service';
import { Klient } from 'src/app/model/klient';
import { UzytkownikService } from 'src/app/serwis/uzytkownik.service';
import { Uzytkownik } from 'src/app/model/uzytkownik';

@Component({
  selector: 'app-zalogowano',
  templateUrl: './zalogowano.component.html',
  styleUrls: ['./zalogowano.component.css']
})
export class ZalogowanoComponent implements OnInit {

  klient: Klient;
  uzytkownik: Uzytkownik;

  constructor(private konto: KontoSerwis, private klientSerwis: KlientService, private uzytkownikSerwis: UzytkownikService) { }

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
  }

}
