package com.example.po_project.dto;

/**
 * Klasa TypKontaDto jest klasą, która upraszcza klasę TypKontaDto.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class TypKontaDto {

    private Long id;
    private String nazwa;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego typu konta
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
     * Metoda umożliwiająca uzyskanie wartości w polu nazwa
     * @return Long Metoda zwraca nazwe danego typu konta
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param nazwa Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "TypKontaDto{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
