package com.example.po_project.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Klasa Dokument jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "dokument")
@Entity
public class Dokument {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_wystawienia")
    private Long data_wystawienia;

    @OneToOne
    @JoinColumn(name = "typdokumentuid",referencedColumnName = "id",nullable = false)
    private TypDokumentu typdokumentuid;

    @ManyToOne
    @JoinColumn(name = "klientid", referencedColumnName = "id")
    private Klient klientid;

    @ManyToOne
    @JoinColumn(name = "uzytkownikid", referencedColumnName = "id")
    private Uzytkownik uzytkownikid;

    public Dokument() {
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego dokumentu
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
     * Metoda umożliwiająca uzyskanie wartości w polu data_wystawienia
     * @return Long Metoda zwraca id danego dokumentu
     */
    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param data_wystawienia Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu typdokumentuid
     * @return TypDokumentu Metoda zwraca id danego dokumentu
     */
    public TypDokumentu getTypDokumentu() {
        return typdokumentuid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param typDokumentu Jedyny argument przekazywany do tej metody, jest typu TypDokumentu
     */
    public void setTypDokumentu(TypDokumentu typDokumentu) {
        this.typdokumentuid = typDokumentu;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu klientid
     * @return Klient Metoda zwraca obiekt Klient danego dokumentu
     */
    public Klient getKlientid() {
        return klientid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param klientid Jedyny argument przekazywany do tej metody, jest typu Klient
     */
    public void setKlientid(Klient klientid) {
        this.klientid = klientid;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu uzytkownikid
     * @return Uzytkownik Metoda zwraca obiekt Uzytkownika danego dokumentu
     */
    public Uzytkownik getUzytkownikid() {
        return uzytkownikid;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param uzytkownikid Jedyny argument przekazywany do tej metody, jest typu Uzytkownik
     */
    public void setUzytkownikid(Uzytkownik uzytkownikid) {
        this.uzytkownikid = uzytkownikid;
    }

    /**
     * Metoda zwracająca typ boolean w zależności od tego czy obiekty są równe czy nie
     * @param o Obiekt który jest używany do porównania z obiektem klasy Dokument
     * @return boolean Jeśli obiekty są równe True w przeciwnym wypadku False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dokument dokument = (Dokument) o;
        return id.equals(dokument.id);
    }

    /**
     * Metoda zwracająca wartość całkowitą przez algorytm mieszający
     * @return int wartość całkowita zwracana przez algorytm mieszający
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "Dokument{" +
                "id=" + id +
                ", data_wystawienia=" + data_wystawienia +
                ", typDokumentu=" + typdokumentuid +
                ", klientid=" + klientid +
                ", uzytkownikid=" + uzytkownikid +
                '}';
    }
}
