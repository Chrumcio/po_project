package com.example.po_project.dto;

/**
 * Klasa MiejsceMagazynoweDto jest klasą, która upraszcza klasę MiejsceMagazynowe.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class MiejsceMagazynoweDto {

    private Long id;
    private String blok;
    private String numer_polki;
    private String aleja;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego miejsca magazynowego
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
     * Metoda umożliwiająca uzyskanie wartości w polu blok
     * @return String Metoda zwraca blok danego miejsca magazynowego
     */
    public String getBlok() {
        return blok;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param blok Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setBlok(String blok) {
        this.blok = blok;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu numer_polki
     * @return String Metoda zwraca numer_polki danego miejsca magazynowego
     */
    public String getNumer_polki() {
        return numer_polki;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param numer_polki Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNumer_polki(String numer_polki) {
        this.numer_polki = numer_polki;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu aleja
     * @return String Metoda zwraca aleje danego miejsca magazynowego
     */
    public String getAleja() {
        return aleja;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param aleja Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setAleja(String aleja) {
        this.aleja = aleja;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "MiejsceMagazynoweDto{" +
                "id=" + id +
                ", blok='" + blok + '\'' +
                ", numer_polki='" + numer_polki + '\'' +
                ", aleja='" + aleja + '\'' +
                '}';
    }
}
