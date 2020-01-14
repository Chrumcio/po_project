import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-generate-faktura',
  templateUrl: './generate-faktura.component.html',
  styleUrls: ['./generate-faktura.component.css']
})
export class GenerateFakturaComponent implements OnInit {

  companyName:string;
  companyAddress: string;
  companyNIP: string;
  packageNumber: string;

  companyNameList: Array<string> = ["Company1","Company2"];

  @ViewChild("generowanieFaktury",{static: false}) form: NgForm;

  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  generujFaktura(){
    if(this.form.valid){
      this.companyName = this.form.controls.nazwaFirmy.value;
      this.companyAddress = this.form.controls.adresFirmy.value;
      this.companyNIP = this.form.controls.nip.value;
      this.packageNumber = this.form.controls.numerPaczki.value;
      let name = this.companyNameList.find(item => {
        return this.companyName === item;
      });
      if(name != null){
        this.router.navigate(['../wyniki'],{relativeTo: this.route});
      }else{
        this.router.navigate(['../error'],{relativeTo: this.route, state: {errorMessage: "Wprowadzono błędne dane do faktury",errorPath:"../faktura"}});
      }
    }
  }

}
