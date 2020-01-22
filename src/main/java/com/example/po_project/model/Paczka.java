package com.example.po_project.model;

import javax.persistence.*;

/**
 * Klasa Paczka jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Entity
@Table(name = "paczka")
public class Paczka {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "kategoria")
    private String kategoria;

    @ManyToOne
    @JoinColumn(name = "miejsce_magazynowe_id",referencedColumnName = "id")
    private MiejsceMagazynowe miejsce_magazynowe_id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "kod_kreskowy")
    private Long kod_kreskowy;

    @Column(name = "kod_qr")
    private String kog_qr;

    @Column(name = "wartosc")
    private double wartosc;

    @Column(name = "czy_ubezpieczona")
    public boolean czy_ubezpieczona;

    @Column(name = "magazynid")
    private Long magazynid;

    public Paczka() {
    }

    public Paczka(Long id,String nazwa,Long kod_kreskowy,String kog_qr,double wartosc, boolean czy_ubezpieczona, MiejsceMagazynowe miejsceMagazynoweid, Long magazynid){
        this.id = id;
        this.nazwa = nazwa;
        this.kod_kreskowy = kod_kreskowy;
        this.kog_qr = kog_qr;
        this.wartosc = wartosc;
        this.czy_ubezpieczona = czy_ubezpieczona;
        this.miejsce_magazynowe_id = miejsceMagazynoweid;
        this.magazynid = magazynid;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danej paczki
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
     * Metoda umożliwiająca uzyskanie wartości w polu kategoria
     * @return String Metoda zwraca kategorie danej paczki
     */
    public String getKategoria() {
        return kategoria;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kategoria Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu miejsce_magazynowe_id
     * @return MiejsceMagazynowe Metoda zwraca miejsce magazynowe danej paczki
     */
    public MiejsceMagazynowe getMiejsce_magazynowe_id() {
        return miejsce_magazynowe_id;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param miejsce_magazynowe_id Jedyny argument przekazywany do tej metody, jest typu MiejsceMagazynowe
     */
    public void setMiejsce_magazynowe_id(MiejsceMagazynowe miejsce_magazynowe_id) {
        this.miejsce_magazynowe_id = miejsce_magazynowe_id;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu nazwa
     * @return String Metoda zwraca nazwe danej paczki
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
     * Metoda umożliwiająca uzyskanie wartości w polu kod_kreskowy
     * @return Long Metoda zwraca kod kreskowy danej paczki
     */
    public Long getKod_kreskowy() {
        return kod_kreskowy;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kod_kreskowy Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setKod_kreskowy(Long kod_kreskowy) {
        this.kod_kreskowy = kod_kreskowy;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kod_qr
     * @return String    Metoda zwraca kod qr danej paczki
     */
    public String getKog_qr() {
        return kog_qr;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kog_qr Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setKog_qr(String kog_qr) {
        this.kog_qr = kog_qr;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu wartosc
     * @return double Metoda zwraca wartosc danej paczki
     */
    public double getWartosc() {
        return wartosc;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param wartosc Jedyny argument przekazywany do tej metody, jest typu double
     */
    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu czy_ubezpieczona
     * @return boolean Metoda zwraca czy dana paczka jest ubezpieczona
     */
    public boolean isCzy_ubezpieczona() {
        return czy_ubezpieczona;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param czy_ubezpieczona Jedyny argument przekazywany do tej metody, jest typu boolean
     */
    public void setCzy_ubezpieczona(boolean czy_ubezpieczona) {
        this.czy_ubezpieczona = czy_ubezpieczona;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu magazynid
     * @return Long Metoda zwraca magazyn, w którym znajduje się dana paczka
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
        return "Paczka{" +
                "id=" + id +
                ", kategoria='" + kategoria + '\'' +
                ", miejsce_magazynowe_id=" + miejsce_magazynowe_id +
                ", nazwa='" + nazwa + '\'' +
                ", kod_kreskowy=" + kod_kreskowy +
                ", kog_qr='" + kog_qr + '\'' +
                ", wartosc=" + wartosc +
                ", czy_ubezpieczona=" + czy_ubezpieczona +
                ", magazynid=" + magazynid +
                '}';
    }
}
