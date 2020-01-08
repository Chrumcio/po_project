import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { HttpClientModule } from '@angular/common/http'; 
import { KontoSerwis } from './serwis/konto.serwis';
import { ZalogowanoComponent } from './zalogowano/zalogowano.component';
import { CalendarModule } from '@syncfusion/ej2-angular-calendars';
import { SzukajComponent } from './szukaj/szukaj.component';
import { SzukajNazwaComponent } from './szukaj-nazwa/szukaj-nazwa.component';
import { SzukajKategoriaComponent } from './szukaj-kategoria/szukaj-kategoria.component';
import { ListaPaczekComponent } from './lista-paczek/lista-paczek.component';
import { HomeComponent } from './home/home.component';


const appRoutes: Routes = [
  {path:'home',component: HomeComponent,},
  {path:'szukaj',component:SzukajComponent,},
  {path:'szukajNazwa',component:SzukajNazwaComponent,},
  {path:'szukajKategoria',component:SzukajKategoriaComponent,},
  {path:'listaPaczek',component:ListaPaczekComponent,}
]
@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    ZalogowanoComponent,
    SzukajComponent,
    SzukajNazwaComponent,
    SzukajKategoriaComponent,
    ListaPaczekComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    CalendarModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
  ],
  providers: [KontoSerwis],
  bootstrap: [AppComponent]
})
export class AppModule { }
