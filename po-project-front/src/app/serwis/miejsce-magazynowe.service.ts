import { Injectable } from '@angular/core';
import { MiejsceMagazynowe } from '../model/miejsceMagazynowe';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MiejsceMagazynoweService {

  private url: string;
  private listMiejsceMagazynowe: MiejsceMagazynowe[];

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/miejsceMagazynowe"
   }

  getAllMiejsceMagazynowe():Observable<MiejsceMagazynowe[]>{
    return this.http.get<MiejsceMagazynowe[]>(`${this.url}/all`);
  }
}
