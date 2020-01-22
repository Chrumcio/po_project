package com.example.po_project.model;

import javax.persistence.*;

/**
 * Klasa Konto jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "konto")
@Entity
public class Konto {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "haslo")
    private String haslo;

    @ManyToOne
    @JoinColumn(name = "typ_kontaid",referencedColumnName = "id")
    private TypKonta typ_kontaid;

    @OneToOne(mappedBy = "kontoid")
    private Klient klient;

    @OneToOne(mappedBy = "kontoid")
    private Uzytkownik uzytkownik;

    public Konto() {
    }

    public Konto(Long id, String login, String haslo, TypKonta typ_kontaid){
        this.id = id;
        this.login = login;
        this.haslo = haslo;
        this.typ_kontaid = typ_kontaid;
    }

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
     * @return TypKonta Metoda zwraca typ konta danego konta
     */
    public TypKonta getTyp_kontaid() {
        return typ_kontaid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param typ_kontaid Jedyny argument przekazywany do tej metody, jest typu TypKonta
     */
    public void setTyp_kontaid(TypKonta typ_kontaid) {
        this.typ_kontaid = typ_kontaid;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu klient
     * @return Klient Metoda zwraca klienta dla danego konta
     */
    public Klient getKlient() {
        return klient;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param klient Jedyny argument przekazywany do tej metody, jest typu Klient
     */
    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu uzytkownik
     * @return Uzytkownik Metoda zwraca uzytkownika dla danego konta
     */
    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param uzytkownik Jedyny argument przekazywany do tej metody, jest typu Uzytkownik
     */
    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "Konto{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", typ_kontaid=" + typ_kontaid +
                '}';
    }
}
