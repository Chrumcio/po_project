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
  podkategoria: Map<string, string[]>;

  constructor(private route: ActivatedRoute, private paczkaSerwis: PaczkaService, private router: Router) { }

  ngOnInit() {
    this.kategoria = decodeURIComponent(this.route.snapshot.queryParams.kategoria);
    this.podkategoria = new Map();
    this.podkategoria.set("Elektronika", ["Laptop", "Komputery stacjonarne", "Aparaty fotograficzne", "Telefony komórkowe", "Lodówki", "Pralki", "Konsole", "Ładowarki", "Klawiatury"]);
    this.podkategoria.set("Moda", ["Bluzy damskie", "Bluzy męskie", "Spodnie damskie", "Spodnie męskie", "Buty", "Koszule damskie", "Koszule męskie", "Okulary", "Paski"]);
    this.podkategoria.set("Dom i ogród", ["Salon", "Kuchnia", "Łazienka", "Sypialnia", "Przedpokój", "Pracownia", "Pokój biurowy", "Ogrzewanie", "Ściany"]);
    this.podkategoria.set("Uroda", ["Perfumy damskie", "Perfumy męskie", "Testery", "Dezodoranty damskie", "Dezodoranty męskie", "Balsamy do ciała", "Szampony", "Golenie", "Kremy"]);
    this.podkategoria.set("Zdrowie", ["Suplementy diety", "Dermokosmetyki", "Higiena jamy ustnej", "Korekcja wzroku", "Urządzenia medyczne", "Leki", "Masaż", "Sprzęt rehabilitacyjny", "Wyposażenie gabinetów"]);
    this.podkategoria.set("Kultura", ["Suplementy diety", "Dermokosmetyki", "Higiena jamy ustnej", "Korekcja wzroku", "Urządzenia medyczne", "Leki", "Masaż", "Sprzęt rehabilitacyjny", "Wyposażenie gabinetów"]);
    this.podkategoria.set("Sport", ["Koszulki Sportowe", "Halówki", "Korki", "Torfy", "Spodenki", "Bieganie", "Sporty zimowe", "Sprzęt rehabilitacyjny", "Wyposażenie gabinetów"]);
    this.podkategoria.set("Motoryzacja", ["Suplementy diety", "Dermokosmetyki", "Higiena jamy ustnej", "Korekcja wzroku", "Urządzenia medyczne", "Leki", "Masaż", "Sprzęt rehabilitacyjny", "Wyposażenie gabinetów"]);
    this.podkategoria.set("Sztuka", ["Suplementy diety", "Dermokosmetyki", "Higiena jamy ustnej", "Korekcja wzroku", "Urządzenia medyczne", "Leki", "Masaż", "Sprzęt rehabilitacyjny", "Wyposażenie gabinetów"]);
  }

  setListPaczka(item: string) {
    this.paczkaSerwis.getPaczkaByKategoria(item).pipe(map((items: Paczka[]) => {
      debugger;
      if (items.length != 0) {
        for (let i of items) {
          i.kod_kreskowy %= 1000;
        }
        return items;
      } else {
        this.router.navigate(["../error"], { relativeTo: this.route, state: { errorMessage: "Brak danej kategorii paczek w magazynie", errorPath: "/home" } });
      }
    })).subscribe(data => {
      this.paczkaSerwis.listPaczka = data;
      if (data != null) {
        this.router.navigate(["../wyniki"], { relativeTo: this.route });
      }
    });
  }

}
