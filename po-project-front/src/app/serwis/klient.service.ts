import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Klient } from '../model/klient';

@Injectable({
  providedIn: 'root'
})
export class KlientService {

  private url: string;
  klient: Klient;

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/klient";
  }

  getKlientByKontoId(id: number):Observable<Klient>{
    return this.http.get<Klient>(`${this.url}/kontoid/${id}`);
  }
}
