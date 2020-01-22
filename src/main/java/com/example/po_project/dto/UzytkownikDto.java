package com.example.po_project.dto;

/**
 * Klasa UzytkownikDto jest klasą, która upraszcza klasę Uzytkownik.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class UzytkownikDto {
    private Long id;
    private String imie;
    private String nazwisko;
    private KontoDto kontoid;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego uzytkownika
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param id Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu imie
     * @return String Metoda zwraca imie danego uzytkownika
     */
    public String getImie() {
        return imie;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param imie Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu nazwisko
     * @return String Metoda zwraca nazwisko danego uzytkownika
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param nazwisko Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kontoid
     * @return KontoDto Metoda zwraca konto danego uzytkownika
     */
    public KontoDto getKontoid() {
        return kontoid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kontoid Jedyny argument przekazywany do tej metody, jest typu KontoDto
     */
    public void setKontoid(KontoDto kontoid) {
        this.kontoid = kontoid;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "UzytkownikDto{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kontoid=" + kontoid +
                '}';
    }
}
