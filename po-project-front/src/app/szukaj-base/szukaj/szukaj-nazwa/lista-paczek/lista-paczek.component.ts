import { Component, OnInit } from '@angular/core';
import { PaczkaService } from 'src/app/serwis/paczka.service';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';
import { Paczka } from 'src/app/model/paczka';

@Component({
  selector: 'app-lista-paczek',
  templateUrl: './lista-paczek.component.html',
  styleUrls: ['./lista-paczek.component.css']
})
export class ListaPaczekComponent implements OnInit {

  private listPaczka: Paczka[];

  constructor(private paczkaSerwis: PaczkaService, private konto: KontoSerwis) { }

  ngOnInit() {
    this.listPaczka = this.paczkaSerwis.listPaczka;
  }


}
