package com.example.po_project.model;

import javax.persistence.*;

/**
 * Klasa MiejsceMagazynowe jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "miejscemagazynowe")
@Entity
public class MiejsceMagazynowe {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blok")
    private String blok;

    @Column(name = "numer_polki")
    private String numer_polki;

    @Column(name = "aleja")
    private String aleja;

    @Column(name = "magazynid")
    private Long magazynid;

    public MiejsceMagazynowe() {
    }

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
     * @return String Metoda zwraca aleja danego miejsca magazynowego
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
     * Metoda umożliwiająca uzyskanie wartości w polu magazynid
     * @return Long Metoda zwraca magazynid danego miejsca magazynowego
     */
    public Long getMagazynid() {
        return magazynid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param magazynid Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setMagazynid(Long magazynid) {
        this.magazynid = magazynid;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "MiejsceMagazynowe{" +
                "id=" + id +
                ", blok='" + blok + '\'' +
                ", numer_polki='" + numer_polki + '\'' +
                ", aleja='" + aleja + '\'' +
                ", magazynid=" + magazynid +
                '}';
    }
}
