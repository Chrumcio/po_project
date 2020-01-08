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
  private czyZalogowano: Boolean;
  private subskrypcja: Subscription;
  
  constructor(private konto: KontoSerwis) { }

  ngOnInit() {
    this.subskrypcja = this.konto.subject.subscribe(czyZalogowano => {
      this.czyZalogowano = czyZalogowano;
    });
  }

}
