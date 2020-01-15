import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-szukaj-kategoria',
  templateUrl: './szukaj-kategoria.component.html',
  styleUrls: ['./szukaj-kategoria.component.css']
})
export class SzukajKategoriaComponent implements OnInit {

  kategoriaList: {name: String, icon_name: String}[];

  constructor() { }

  ngOnInit() {
    this.kategoriaList = [{name:"Elektronika",icon_name:"camera"},
    {name:"Moda",icon_name:"user-secret"},
    {name:"Dom i ogród",icon_name:"home"},
    {name:"Uroda",icon_name:"smile"},
    {name:"Zdrowie",icon_name:"medkit"},
    {name:"Kultura",icon_name:"video"},
    {name:"Sport",icon_name:"futbol"},
    {name:"Motoryzacja",icon_name:"car"},
    {name:"Sztuka",icon_name:"university"}];
  }

  stworzUrl(name: string){
    return encodeURIComponent(name);
  }
}
