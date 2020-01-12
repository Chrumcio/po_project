import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Paczka } from '../model/paczka';

@Injectable({
  providedIn: 'root'
})
export class PaczkaService {
  
  private url: string;
  listPaczka: Paczka[] = [];

  constructor(private http: HttpClient){
    this.url = "http://localhost:8080/paczka"
  }

  getPaczkaByName(nazwa):Observable<Paczka[]> {
    return this.http.get<Paczka[]>(`${this.url}/${nazwa}`);
  }

  getPaczkaByKategoria(kategoria):Observable<Paczka[]> {
    return this.http.get<Paczka[]>(`${this.url}/kategoria/${kategoria}`);
  }
}
