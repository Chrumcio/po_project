import { MiejsceMagazynowe } from './miejsceMagazynowe';

export class Paczka{
    id:number;
    kategoria: string;
    miejsce_magazynowe_id: MiejsceMagazynowe;
    nazwa:string;
    kod_kreskowy: number;
}