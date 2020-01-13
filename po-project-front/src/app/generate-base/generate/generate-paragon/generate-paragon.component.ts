import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-generate-paragon',
  templateUrl: './generate-paragon.component.html',
  styleUrls: ['./generate-paragon.component.css']
})
export class GenerateParagonComponent implements OnInit {

  paragon = {
    imie: '',
    nazwisko: '',
    pesel: '',
    dataUrodzenia: '',
    nrPaczki: '',
    oplata: 0.0
  }

  constructor() { }

  ngOnInit() {
  }

  generujParagon(){

  }

}
