package com.example.po_project.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Klasa TypDokumentu jest opatrzona adnotacjami: @Table, @Entity
 * świadczy to o tym, że reprezentuje ona rzeczywistą strukturę
 * encji z bazy danych, w której są przechowywane dane. Każde z pól
 * opatrzone jest adnotacją @Column bądź @JoinColumn jeżeli jest to
 * klucz obcy z innej tabeli.
 */
@Table(name = "typdokumentu")
@Entity
public class TypDokumentu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nazwa")
    private String nazwa;

    @OneToOne(mappedBy = "typdokumentuid")
    private Dokument dokument;

    public TypDokumentu() {
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danego typu dokumentu
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
     * @return String Metoda zwraca nazwe danego typu dokumentu
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
     * Metoda zwracająca typ boolean w zależności od tego czy obiekty są równe czy nie
     * @param o Obiekt który jest używany do porównania z obiektem klasy TypDokumentu
     * @return boolean Jeśli obiekty są równe True w przeciwnym wypadku False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypDokumentu that = (TypDokumentu) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nazwa, that.nazwa);
    }

    /**
     * Metoda zwracająca wartość całkowitą przez algorytm mieszający
     * @return int wartość całkowita zwracana przez algorytm mieszający
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nazwa);
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "TypDokumentu{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
