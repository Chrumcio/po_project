package com.example.po_project.model;

import javax.persistence.*;
import java.util.List;

/**
 * Klasa Klient jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "klient")
@Entity
public class Klient {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @Column(name = "pesel")
    private String pesel;

    @Column(name = "numer_dowodu")
    private String numer_dowodu;

    @Column(name = "czy_staly")
    private boolean czy_staly;

    @OneToOne
    @JoinColumn(name = "kontoid",referencedColumnName = "id",nullable = false)
    private Konto kontoid;

    @Column(name = "nip")
    private String nip;

    @OneToMany(mappedBy = "klientid")
    private List<Dokument> dokumentList;

    public Klient() {
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego klienta
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
     * @return String Metoda zwraca imie danego klienta
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
     * @return String Metoda zwraca nazwisko danego klienta
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
     * Metoda umożliwiająca uzyskanie wartości w polu pesel
     * @return String Metoda zwraca pesel danego klienta
     */
    public String getPesel() {
        return pesel;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param pesel Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu numer_dowodu
     * @return String Metoda zwraca numer_dowodu danego klienta
     */
    public String getNumer_dowodu() {
        return numer_dowodu;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param numer_dowodu Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNumer_dowodu(String numer_dowodu) {
        this.numer_dowodu = numer_dowodu;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu czy_staly
     * @return boolean Metoda zwraca czy dany klient jest stały
     */
    public boolean isCzy_staly() {
        return czy_staly;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param czy_staly Jedyny argument przekazywany do tej metody, jest typu boolean
     */
    public void setCzy_staly(boolean czy_staly) {
        this.czy_staly = czy_staly;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kontoid
     * @return Konto Metoda zwraca Konto danego klienta
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
     * Metoda umożliwiająca uzyskanie wartości w polu nip
     * @return String Metoda zwraca nip danego klienta
     */
    public String getNip() {
        return nip;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param nip Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu dokumentList
     * @return List<Dokument> Metoda zwraca liste dokumentów danego klienta
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
        return "Klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", numer_dowodu='" + numer_dowodu + '\'' +
                ", czy_staly=" + czy_staly +
                ", kontoid=" + kontoid +
                ", nip='" + nip + '\'' +
                ", dokumentList=" + dokumentList +
                '}';
    }
}
