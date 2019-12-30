import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-szukaj',
  templateUrl: './szukaj.component.html',
  styleUrls: ['./szukaj.component.css']
})
export class SzukajComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  fun(){
    console.log("It works!");
  }

  szukajNazwa(){
    this.router.navigate(['/','szukajNazwa']);
  }

  szukajKategoria(){
    console.log("Szukanie po kategorii");
  }

}
