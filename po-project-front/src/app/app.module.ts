import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { HttpClientModule } from '@angular/common/http'; 
import { KontoSerwis } from './serwis/konto.serwis';
import { ZalogowanoComponent } from './zalogowano/zalogowano.component';


const appRoutes: Routes = [
  {
    path:'home',
    component:LoginFormComponent,
  }
]
@NgModule({
  declarations: [
    AppComponent,
    LoginFormComponent,
    ZalogowanoComponent
  ],
  imports: [
    BrowserModule,
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
