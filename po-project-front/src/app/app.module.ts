import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CarouselModule } from 'ngx-bootstrap';

import { AppComponent } from './app.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { HttpClientModule } from '@angular/common/http'; 
import { KontoSerwis } from './serwis/konto.serwis';
import { ZalogowanoComponent } from './zalogowano/zalogowano.component';
import { CalendarModule } from '@syncfusion/ej2-angular-calendars';
import { SzukajComponent } from './szukaj-base/szukaj/szukaj.component';
import { SzukajNazwaComponent } from "./szukaj-base/szukaj/szukaj-nazwa/szukaj-nazwa.component";
import { ListaPaczekComponent } from './lista-paczek/lista-paczek.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { UzytkownikService } from './serwis/uzytkownik.service';
import { PaczkaService } from './serwis/paczka.service';
import { StartPageComponent } from './start-page/start-page.component';
import { SzukajBaseComponent } from './szukaj-base/szukaj-base.component';
import { SzukajKategoriaComponent } from './szukaj-base/szukaj/szukaj-kategoria/szukaj-kategoria.component';


const appRoutes: Routes = [
  {path:'',component: StartPageComponent,},
  {path:'home',component: HomeComponent,},
  {path:'szukaj',component:SzukajBaseComponent,children:[
    {path:'',component:SzukajComponent},
    {path:'nazwa',component:SzukajNazwaComponent},
    {path:'kategoria',component:SzukajKategoriaComponent},
    {path:'wyniki',component:ListaPaczekComponent}
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
    SzukajBaseComponent
  ],
  imports: [
    BrowserModule,
    CalendarModule,
    FormsModule,
    HttpClientModule,
    CarouselModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true }
    ),
  ],
  providers: [KontoSerwis,PaczkaService,UzytkownikService],
  bootstrap: [AppComponent]
})
export class AppModule { }
