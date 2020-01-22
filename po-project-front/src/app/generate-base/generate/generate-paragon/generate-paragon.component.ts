import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { DokumentyService } from 'src/app/serwis/dokumenty.service';

@Component({
  selector: 'app-generate-paragon',
  templateUrl: './generate-paragon.component.html',
  styleUrls: ['./generate-paragon.component.css']
})
export class GenerateParagonComponent implements OnInit {

  name: string;
  surname: string;
  pesel: string;
  dataOfBirth: Date;
  packageNumber: string;
  customerNameList: Array<string> = ["Customer1", "Customer2"];
  customerSurnameList: Array<string> = ["surname1", "surname2"];

  @ViewChild("generowanieParagonu", { static: false }) form: NgForm;

  constructor(private route: ActivatedRoute, private router: Router, private documentsService: DokumentyService) { }

  ngOnInit() {
  }

  generujParagon() {
    if (this.form.valid) {
      this.name = this.form.controls.imie.value;
      this.surname = this.form.controls.nazwisko.value;
      this.pesel = this.form.controls.pesel.value;
      this.dataOfBirth = this.form.controls.dataUrodzenia.value;
      this.packageNumber = this.form.controls.nrPaczki.value;
      let name = this.customerNameList.find(item => {
        return this.name === item;
      });
      let surname = this.customerSurnameList.find(item => {
        return this.surname === item;
      });
      if (name != null && surname != null) {
        this.documentsService.address = "../../../../assets/images/paragon.png";
        this.router.navigate(['../wyniki'], { relativeTo: this.route });
      } else {
        this.router.navigate(['../error'], { relativeTo: this.route, state: { errorMessage: "Wprowadzono błędne dane do paragonu", errorPath: "../paragon" } });
      }
    }

  }

}
