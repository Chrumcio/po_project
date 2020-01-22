package com.example.po_project.dto;

/**
 * Klasa KlientDto jest klasą, która upraszcza klasę Klient.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class KlientDto {

    private Long id;
    private String imie;
    private String nazwisko;
    private KontoDto kontoid;
    private String pesel;
    private String nip;

    /**
     * Metoda umożliwiająca uzyskanie wartości z pola klasy id
     * @return Long zwraca id obiektu KlientDto
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola id obiektu
     * @param id Argument przekazywany do ustawienia id obiektu, jest typu Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości z pola klasy imie
     * @return String zwraca imie obiektu KlientDto
     */
    public String getImie() {
        return imie;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola imie obiektu
     * @param imie Argument przekazywany do ustawienia imienia obiektu, jest typu String
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości z pola klasy nazwisko
     * @return String zwraca nazwisko obiektu KlientDto
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola nazwisko obiektu
     * @param nazwisko Argument przekazywany do ustawienia nazwiska obiektu, jest typu String
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości z pola klasy kontoid
     * @return KontoDto zwraca reprezentację klasy KontoDto dla obiektu KlientDto
     */
    public KontoDto getKontoid() {
        return kontoid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola kontoid obiektu
     * @param kontoid Argument przekazywany do ustawienia konta obiektu, jest typu KontoDto
     */
    public void setKontoid(KontoDto kontoid) {
        this.kontoid = kontoid;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości pesel z pola klasy
     * @return String zwraca pesel obiektu KlientDto
     */
    public String getPesel() {
        return pesel;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola pesel obiektu
     * @param pesel Argument przekazywany do ustawienia peselu obiektu, jest typu String
     */
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości nip z pola klasy
     * @return String zwraca nip obiektu KlientDto
     */
    public String getNip() {
        return nip;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola nip obiektu
     * @param nip Argument przekazywany do ustawienia nipu obiektu, jest typu String
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "KlientDto{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kontoid=" + kontoid +
                '}';
    }
}
