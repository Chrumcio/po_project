import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-szukaj-kategoria-szczegoly',
  templateUrl: './szukaj-kategoria-szczegoly.component.html',
  styleUrls: ['./szukaj-kategoria-szczegoly.component.css']
})
export class SzukajKategoriaSzczegolyComponent implements OnInit {

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
    console.log(decodeURIComponent(this.route.snapshot.queryParams.kategoria));
  }

}
