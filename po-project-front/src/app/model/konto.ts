import { TypKonta } from './typkonta';

export class Konto {
    id: number;
    login: string;
    haslo: string;
    typ_kontaid: TypKonta;
    // czyZalogowany: Boolean;
}