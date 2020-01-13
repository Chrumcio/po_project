import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CarouselModule } from 'ngx-bootstrap';
import { FontAwesomeModule, FaIconLibrary } from '@fortawesome/angular-fontawesome';
import { fas } from '@fortawesome/free-solid-svg-icons';
import { far } from '@fortawesome/free-regular-svg-icons';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http'; 
import { KontoSerwis } from './serwis/konto.serwis';
import { ZalogowanoComponent } from './home/zalogowano/zalogowano.component';
import { CalendarModule } from '@syncfusion/ej2-angular-calendars';
import { SzukajComponent } from './szukaj-base/szukaj/szukaj.component';
import { SzukajNazwaComponent } from "./szukaj-base/szukaj/szukaj-nazwa/szukaj-nazwa.component";
import { ListaPaczekComponent } from './szukaj-base/szukaj/szukaj-nazwa/lista-paczek/lista-paczek.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { UzytkownikService } from './serwis/uzytkownik.service';
import { PaczkaService } from './serwis/paczka.service';
import { StartPageComponent } from './start-page/start-page.component';
import { SzukajBaseComponent } from './szukaj-base/szukaj-base.component';
import { SzukajKategoriaComponent } from './szukaj-base/szukaj/szukaj-kategoria/szukaj-kategoria.component';
import { LoginFormComponent } from './home/login-form/login-form.component';
import { SzukajErrorComponent } from './szukaj-base/szukaj/szukaj-nazwa/szukaj-error/szukaj-error.component';
import { SzukajKategoriaSzczegolyComponent } from './szukaj-base/szukaj/szukaj-kategoria/szukaj-kategoria-szczegoly/szukaj-kategoria-szczegoly.component';
import { GenerateBaseComponent } from './generate-base/generate-base.component';


const appRoutes: Routes = [
  {path:'',component: StartPageComponent,},
  {path:'home',component: HomeComponent,},
  {path:'szukaj',component:SzukajBaseComponent,children:[
    {path:'',component:SzukajComponent},
    {path:'nazwa',component:SzukajNazwaComponent},
    {path:'kategoria',component:SzukajKategoriaComponent},
    {path:'kategoriaSzczegoly',component: SzukajKategoriaSzczegolyComponent},
    {path:'wyniki',component:ListaPaczekComponent},
    {path:'error',component:SzukajErrorComponent}
  ]},
  {path:'generuj',component:GenerateBaseComponent,children:[

  ]},
];
@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    ZalogowanoComponent,
    SzukajComponent,
    SzukajNazwaComponent,
    SzukajKategoriaComponent,
    ListaPaczekComponent,
    HomeComponent,
    HeaderComponent,
    StartPageComponent,
    SzukajBaseComponent,
    SzukajErrorComponent,
    SzukajKategoriaSzczegolyComponent,
    GenerateBaseComponent
  ],
  imports: [
    BrowserModule,
    CalendarModule,
    FormsModule,
    HttpClientModule,
    CarouselModule,
    FontAwesomeModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: false }
    ),
  ],
  providers: [KontoSerwis,PaczkaService,UzytkownikService],
  bootstrap: [AppComponent]
})
export class AppModule { 
  constructor(library: FaIconLibrary) {
    library.addIconPacks(far,fas);
  }
}
