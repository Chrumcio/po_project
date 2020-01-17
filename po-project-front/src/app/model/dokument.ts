import { Uzytkownik } from './uzytkownik';
import { Klient } from './klient';
import { TypDokumentu } from './typDokumentu';

export class Dokument {
    data_wystawienia: number;
    typdokumentuid: TypDokumentu;
    uzytkownikid: Uzytkownik;
    klientid: Klient;
}