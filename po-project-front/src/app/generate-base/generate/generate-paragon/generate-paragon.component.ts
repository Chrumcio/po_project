import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-generate-paragon',
  templateUrl: './generate-paragon.component.html',
  styleUrls: ['./generate-paragon.component.css']
})
export class GenerateParagonComponent implements OnInit {

  // paragon = {
  //   imie: '',
  //   nazwisko: '',
  //   pesel: '',
  //   dataUrodzenia: '',
  //   nrPaczki: '',
  //   oplata: 0.0
  // }

  name: string;
  surname: string;
  pesel: string;
  dataOfBirth: Date;
  packageNumber: string;

  customerNameList: Array<string> = ["Customer1","Customer2"];
  
  @ViewChild("generowanieParagonu",{static: false}) form: NgForm;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  generujParagon(){
    if(this.form.valid){
      this.name = this.form.controls.imie.value;
      this.surname = this.form.controls.nazwisko.value;
      this.pesel = this.form.controls.pesel.value;
      this.dataOfBirth = this.form.controls.dataUrodzenia.value;
      this.packageNumber = this.form.controls.nrPaczki.value;
      let name = this.customerNameList.find(item => {
        return this.name === item;
      });
      if(name != null){
        this.router.navigate(['../wyniki'],{relativeTo: this.route});
      }else{
        this.router.navigate(['../error'],{relativeTo: this.route, state: {errorMessage: "Wprowadzono błędne dane do paragonu",errorPath:"../paragon"}});
      }
    }

  }

}
