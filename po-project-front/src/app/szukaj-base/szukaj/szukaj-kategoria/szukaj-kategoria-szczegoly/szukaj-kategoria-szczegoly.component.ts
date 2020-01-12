import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PaczkaService } from 'src/app/serwis/paczka.service';
import { map } from 'rxjs/operators';
import { Paczka } from 'src/app/model/paczka';

@Component({
  selector: 'app-szukaj-kategoria-szczegoly',
  templateUrl: './szukaj-kategoria-szczegoly.component.html',
  styleUrls: ['./szukaj-kategoria-szczegoly.component.css']
})
export class SzukajKategoriaSzczegolyComponent implements OnInit {

  kategoria: string;
  podkategoria: Map<string,string[]>;

  constructor(private route: ActivatedRoute, private paczkaSerwis: PaczkaService, private router: Router) { }

  ngOnInit() {
    this.kategoria = decodeURIComponent(this.route.snapshot.queryParams.kategoria);
    this.podkategoria = new Map();
    this.podkategoria.set("Elektronika",["Laptop","Komputery stacjonarne","Aparaty fotograficzne","Telefony komórkowe","Lodówki","Pralki","Konsole","Ładowarki","Klawiatury"]);
  }

  setListPaczka(item: string){
    this.paczkaSerwis.getPaczkaByKategoria(item).pipe(map((items: Paczka[]) => {
      for(let i of items){
        i.kod_kreskowy %= 1000;
      }
      return items;
    })).subscribe(data => {
      this.paczkaSerwis.listPaczka = data;
      this.router.navigate(["../wyniki"],{relativeTo: this.route});
    });
  }

}
