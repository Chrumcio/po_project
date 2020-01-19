package com.example.po_project.model;

import javax.persistence.*;
import java.util.List;

/**
 * Klasa Uzytkownik jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "uzytkownik")
@Entity
public class Uzytkownik {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "numer_telefonu")
    private String numer_telefonu;

    @Column(name = "data_rejestracji")
    private Long data_rejestracji;

    @OneToOne
    @JoinColumn(name = "kontoid",referencedColumnName = "id",nullable = false)
    private Konto kontoid;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @OneToMany(mappedBy = "uzytkownikid")
    private List<Dokument> dokumentList;

    public Uzytkownik() {
    }

    public Uzytkownik(Long id, String email, String numer_telefonu, Long data_rejestracji, Konto kontoid){
        this.id = id;
        this.email = email;
        this.numer_telefonu = numer_telefonu;
        this.data_rejestracji = data_rejestracji;
        this.kontoid = kontoid;
    }

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
     * Metoda umożliwiająca uzyskanie wartości w polu email
     * @return String Metoda zwraca email danego uzytkownika
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param email Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu numer_telefonu
     * @return String Metoda zwraca numer telefonu danego uzytkownika
     */
    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param numer_telefonu Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu data_rejestracji
     * @return Long Metoda zwraca date rejestracji danego uzytkownika
     */
    public Long getData_rejestracji() {
        return data_rejestracji;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param data_rejestracji Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setData_rejestracji(Long data_rejestracji) {
        this.data_rejestracji = data_rejestracji;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kontoid
     * @return Konto Metoda zwraca konto dla danego uzytkownika
     */
    public Konto getKontoid() {
        return kontoid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kontoid Jedyny argument przekazywany do tej metody, jest typu Konto
     */
    public void setKontoid(Konto kontoid) {
        this.kontoid = kontoid;
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
     * Metoda umożliwiająca uzyskanie wartości w polu dokumentList
     * @return List<Dokument> Metoda zwraca liste dokumentów danego uzytkownika
     */
    public List<Dokument> getDokumentList() {
        return dokumentList;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param dokumentList Jedyny argument przekazywany do tej metody, jest typu List<Dokument>
     */
    public void setDokumentList(List<Dokument> dokumentList) {
        this.dokumentList = dokumentList;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "Uzytkownik{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", numer_telefonu='" + numer_telefonu + '\'' +
                ", data_rejestracji=" + data_rejestracji +
                ", kontoid=" + kontoid +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dokumentList=" + dokumentList +
                '}';
    }
}
