import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, ReplaySubject } from 'rxjs';
import { Konto } from '../model/konto';

@Injectable({
    providedIn: 'root'
})
export class KontoSerwis {
    private url: string;
    private czyZalogowany: Boolean;
    public subject = new ReplaySubject<Boolean>(1);

    constructor(private http: HttpClient){
        this.url = "http://localhost:8080/konto";
    }

    getKontoByLoginPassword(login,haslo):Observable<Konto> {
        return this.http.get<Konto>(`${this.url}/${login}/${haslo}`);
    }

    setczyZalogowany(czyZalogowano: Boolean){
        this.czyZalogowany = czyZalogowano;
        this.subject.next(czyZalogowano);
    }
}
