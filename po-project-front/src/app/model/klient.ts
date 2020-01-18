import { Konto } from './konto';

export class Klient{
    id: number;
    imie: string;
    nazwisko: string;
    kontoid: Konto;
    pesel: string;
    nip: string;
}