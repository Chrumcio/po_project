import { Component, OnInit } from '@angular/core';
import { PaczkaService } from 'src/app/serwis/paczka.service';
import { KontoSerwis } from 'src/app/serwis/konto.serwis';
import { Paczka } from 'src/app/model/paczka';
import { MiejsceMagazynoweService } from 'src/app/serwis/miejsce-magazynowe.service';
import { MiejsceMagazynowe } from 'src/app/model/miejsceMagazynowe';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-lista-paczek',
  templateUrl: './lista-paczek.component.html',
  styleUrls: ['./lista-paczek.component.css']
})
export class ListaPaczekComponent implements OnInit {

  listPaczka: Paczka[];
  private listMiejsceMagazynowe: MiejsceMagazynowe[];
  private isSorted: boolean;

  constructor(private route: ActivatedRoute, private paczkaSerwis: PaczkaService, private konto: KontoSerwis, private miejsceMagazynoweSerwis: MiejsceMagazynoweService) { }

  ngOnInit() {
    this.listPaczka = this.paczkaSerwis.listPaczka;
    this.isSorted = false;
    this.listMiejsceMagazynowe = [];
    this.miejsceMagazynoweSerwis.getAllMiejsceMagazynowe().subscribe(data =>{
      this.listMiejsceMagazynowe = data;
    });
  }

  private compare(a: Paczka,b: Paczka){
    return a.kod_kreskowy - b.kod_kreskowy;
  }

  sortTable(){
    if(!this.isSorted){
      this.listPaczka.sort(this.compare);
    }else{
      this.listPaczka.sort((a,b) => this.compare(b,a));
    }
    this.isSorted = !this.isSorted;
  }
}
