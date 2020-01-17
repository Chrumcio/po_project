import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TypDokumentu } from '../model/typDokumentu';

@Injectable({
  providedIn: 'root'
})
export class TypDokumentuService {

  private url: string;
  typDokumentu: TypDokumentu;

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/typDokumentu";
   }

  getTypDokumentuByNazwa(nazwa):Observable<TypDokumentu>{
    return this.http.get<TypDokumentu>(`${this.url}/${nazwa}`);
  } 
}
