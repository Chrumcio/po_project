import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { Konto } from '../model/konto';

@Injectable({
    providedIn: 'root'
})
export class KontoSerwis {
    private url: string;
    private czyZalogowany = new BehaviorSubject<Boolean>(false);
    konto: Konto;
    
    constructor(private http: HttpClient){
        this.url = "http://localhost:8080/konto";
    }

    getKontoByLoginPassword(login,haslo):Observable<Konto> {
        return this.http.get<Konto>(`${this.url}/${login}/${haslo}`);
    }

    setczyZalogowany(czyZalogowano: Boolean){
        this.czyZalogowany.next(czyZalogowano);
    }

    get czyZalogowano(){
        return this.czyZalogowany.asObservable();
    }
}
