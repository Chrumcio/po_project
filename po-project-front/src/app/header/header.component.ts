import { Component, OnInit, OnDestroy } from '@angular/core';
import { KontoSerwis } from '../serwis/konto.serwis';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit, OnDestroy {

  ngOnDestroy(): void {
    this.subskrypcja.unsubscribe();
  }

  czyZalogowano: Boolean;
  private subskrypcja: Subscription;

  constructor(private konto: KontoSerwis) { }

  ngOnInit() {
    this.subskrypcja = this.konto.subject.subscribe(data => {
      this.czyZalogowano = data;
    });
  }

}
