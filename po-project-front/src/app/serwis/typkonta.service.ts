import { Injectable } from '@angular/core';
import { TypKonta } from '../model/typkonta';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TypkontaService {

  private url: string;
  typKonta: TypKonta;

  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/typkonta";
  }

  getTypKontaById(id:number):Observable<TypKonta>{
    return this.http.get<TypKonta>(`${this.url}/${id}`);
  }
}
