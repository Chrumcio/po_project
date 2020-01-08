import { Component, OnInit } from '@angular/core';
import { KontoSerwis } from '../serwis/konto.serwis';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  private czyZalogowano: Boolean;

  constructor(private konto: KontoSerwis) { }

  ngOnInit() {
    this.konto.subject.subscribe(data => {
      this.czyZalogowano = data;
    });
  }

}
