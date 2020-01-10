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
import { SzukajComponent } from './szukaj/szukaj.component';
import { SzukajNazwaComponent } from './szukaj-nazwa/szukaj-nazwa.component';
import { SzukajKategoriaComponent } from './szukaj-kategoria/szukaj-kategoria.component';
import { ListaPaczekComponent } from './lista-paczek/lista-paczek.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { UzytkownikService } from './serwis/uzytkownik.service';
import { PaczkaService } from './serwis/paczka.service';
import { StartPageComponent } from './start-page/start-page.component';


const appRoutes: Routes = [
  {path:'',component: StartPageComponent,},
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
    HomeComponent,
    HeaderComponent,
    StartPageComponent
  ],
  imports: [
    BrowserModule,
    CalendarModule,
    FormsModule,
    HttpClientModule,
    CarouselModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    ),
  ],
  providers: [KontoSerwis,PaczkaService,UzytkownikService],
  bootstrap: [AppComponent]
})
export class AppModule { }
