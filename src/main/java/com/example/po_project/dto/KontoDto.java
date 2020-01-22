package com.example.po_project.dto;

/**
 * Klasa KontoDto jest klasą, która upraszcza klasę Konto.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class KontoDto {

    private Long id;
    private String login;
    private String haslo;
    private TypKontaDto typ_kontaid;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego konta
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
     * Metoda umożliwiająca uzyskanie wartości w polu login
     * @return String Metoda zwraca login danego konta
     */
    public String getLogin() {
        return login;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param login Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu haslo
     * @return String Metoda zwraca haslo danego konta
     */
    public String getHaslo() {
        return haslo;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param haslo Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu typ_kontaid
     * @return TypKontaDto Metoda zwraca reprezentacje obiektu TypKontaDto danego konta
     */
    public TypKontaDto getTyp_kontaid() {
        return typ_kontaid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param typ_kontaid Jedyny argument przekazywany do tej metody, jest typu TypKontaDto
     */

    public void setTyp_kontaid(TypKontaDto typ_kontaid) {
        this.typ_kontaid = typ_kontaid;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "KontoDto{" +
                "login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", typ_kontaid=" + typ_kontaid +
                '}';
    }
}
