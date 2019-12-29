import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Konto } from '../model/konto';

@Injectable({
    providedIn: 'root'
})
export class KontoSerwis {
    private url: string;

    constructor(private http: HttpClient){
        this.url = "http://localhost:8080/konto"
    }

    getKontoByLoginPassword(login,haslo):Observable<Konto> {
        return this.http.get<Konto>(`${this.url}/${login}/${haslo}`);
    }
}
