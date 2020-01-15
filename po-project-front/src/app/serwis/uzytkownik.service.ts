import { Injectable } from '@angular/core';
import { Uzytkownik } from '../model/uzytkownik';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UzytkownikService {

  private url: string;
  uzytkownik: Uzytkownik;

  constructor(private http: HttpClient) { 
    this.url = "http://localhost:8080/uzytkownik";
  }

  getUzytkownikByKontoId(id: number):Observable<Uzytkownik>{
    return this.http.get<Uzytkownik>(`${this.url}/kontoid/${id}`);
  }
}
