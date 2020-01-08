import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { LoginFormComponent } from '../login-form/login-form.component';
import { Konto } from '../model/konto';
import { KontoSerwis } from '../serwis/konto.serwis';

@Component({
  selector: 'app-zalogowano',
  templateUrl: './zalogowano.component.html',
  styleUrls: ['./zalogowano.component.css']
})
export class ZalogowanoComponent implements OnInit {

  constructor(private konto: KontoSerwis) { }

  ngOnInit() {
  }

  logoutUser(){
    this.konto.setczyZalogowany(false);
  }

}
