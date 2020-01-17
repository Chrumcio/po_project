import { Injectable } from '@angular/core';
import { Dokument } from '../model/dokument';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class DokumentyService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      'Authorization': 'my-auth-token'
    })
  };

  private url: string;
  address: string;
  dokument: Dokument;

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/dokument";
   }

  addDokoment(dokument:Dokument):Observable<any>{
     return this.http.post<any>(`${this.url}/dodaj`,JSON.stringify(this.dokument));
   }
}
