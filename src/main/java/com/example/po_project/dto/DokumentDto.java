package com.example.po_project.dto;

/**
 * Klasa DokumentDto jest klasą, która upraszcza klasę Dokument.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class DokumentDto {

    private Long data_wystawienia;
    private TypDokumentuDto typ_dokumentuid;
    private UzytkownikDto uzytkownikid;
    private KlientDto klientid;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu data_wystawienia
     * @return Long Metoda zwraca data_wystawienia danego dokumentu
     */
    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param data_wystawienia Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu typ_dokumentuid
     * @return TypDokumentuDto Metoda zwraca obiekt innej klasy
     */
    public TypDokumentuDto getTyp_dokumentuid() {
        return typ_dokumentuid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param typ_dokumentuid Jedyny argument przekazywany, jest typu TypDokumentuDto
     */
    public void setTyp_dokumentuid(TypDokumentuDto typ_dokumentuid) {
        this.typ_dokumentuid = typ_dokumentuid;
    }

    /**
     * Metoda umożliwia dostęp do danych w polu klasy uzytkownikid
     * @return UzytkownikDto Metoda zwraca obiekt innej klasy
     */
    public UzytkownikDto getUzytkownikid() {
        return uzytkownikid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy uzytkownikid
     * @param uzytkownikid Jedyny argument przekazywany do tej metody typu UzytkownikDto
     */
    public void setUzytkownikid(UzytkownikDto uzytkownikid) {
        this.uzytkownikid = uzytkownikid;
    }

    /**
     * Metoda umożliwia dostęp do danych w polu klasy klientid
     * @return KlientDto Metoda zwraca obiekt innej klasy
     */
    public KlientDto getKlientid() {
        return klientid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy klientid
     * @param klientid Jedyny argument przekazywany do tej metody typu KlientDto
     */
    public void setKlientid(KlientDto klientid) {
        this.klientid = klientid;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "DokumentDto{" +
                "data_wystawienia=" + data_wystawienia +
                ", typ_dokumentuid=" + typ_dokumentuid +
                ", uzytkownikid=" + uzytkownikid +
                ", klientid=" + klientid +
                '}';
    }
}
