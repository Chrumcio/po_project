import { Component, OnInit, OnDestroy } from '@angular/core';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy{

  ngOnDestroy(): void {
    this.subskrypcja.unsubscribe();
  }
  czyZalogowano: Boolean;
  private subskrypcja: Subscription;
  public minDate: Date = new Date ("01/01/1980");
  public maxDate: Date = new Date ("12/31/2080");
  public value: Date = new Date ();
  
  constructor(private konto: KontoSerwis) { }

  ngOnInit() {
    this.subskrypcja = this.konto.czyZalogowano.subscribe(czyZalogowano => {
      this.czyZalogowano = czyZalogowano;
    });
  }

}
