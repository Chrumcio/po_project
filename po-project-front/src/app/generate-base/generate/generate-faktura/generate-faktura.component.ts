import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { DokumentyService } from 'src/app/serwis/dokumenty.service';
import { KlientService } from 'src/app/serwis/klient.service';
import { TypDokumentuService } from 'src/app/serwis/typ-dokumentu.service';
import { UzytkownikService } from 'src/app/serwis/uzytkownik.service';
import { Klient } from 'src/app/model/klient';
import { Dokument } from 'src/app/model/dokument';
import { TypDokumentu } from 'src/app/model/typDokumentu';
import { Uzytkownik } from 'src/app/model/uzytkownik';

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

  constructor(private route: ActivatedRoute, private router: Router, private documentsService: DokumentyService,private klientSerwis: KlientService, private typDokumentuSerwis: TypDokumentuService,private uzytkownikSerwis: UzytkownikService) { }

  ngOnInit() {
  }

  generujFaktura(){
    if(this.form.valid){
      this.klientSerwis.klient = new Klient();
      this.klientSerwis.klient.imie = this.form .controls.nazwaFirmy.value;
      this.klientSerwis.klient.nip = this.form.controls.nip.value;
      this.klientSerwis.klient.nazwisko = this.form.controls.adresFirmy.value;
      this.typDokumentuSerwis.typDokumentu = new TypDokumentu();
      this.typDokumentuSerwis.typDokumentu.id = 1;
      this.typDokumentuSerwis.typDokumentu.nazwa = "faktura";
      this.documentsService.dokument = new Dokument();
      this.documentsService.dokument.klientid = this.klientSerwis.klient;
      this.documentsService.dokument.typdokumentuid = this.typDokumentuSerwis.typDokumentu;
      // this.documentsService.dokument.uzytkownikid = new Uzytkownik();
      // this.documentsService.dokument.uzytkownikid.id = 1;
      // this.documentsService.dokument.uzytkownikid.imie = "Wojciech";
      // this.documentsService.dokument.uzytkownikid.nazwisko = "Wojtkowski";
      // this.documentsService.dokument.uzytkownikid.kontoid = 2;
      this.documentsService.dokument.data_wystawienia = new Date().getTime();
      let name = this.companyNameList.find(item => {
        return this.klientSerwis.klient.imie === item;
      });
      if(name != null){
        this.documentsService.address = "../../../../assets/images/acer.jpg";
        this.documentsService.addDokoment(this.documentsService.dokument);
        this.router.navigate(['../wyniki'],{relativeTo: this.route});
      }else{
        this.router.navigate(['../error'],{relativeTo: this.route, state: {errorMessage: "Wprowadzono błędne dane do faktury",errorPath:"../faktura"}});
      }
    }
  }

}
