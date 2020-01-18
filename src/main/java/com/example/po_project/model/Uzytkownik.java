package com.example.po_project.model;

import javax.persistence.*;
import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public Long getData_rejestracji() {
        return data_rejestracji;
    }

    public void setData_rejestracji(Long data_rejestracji) {
        this.data_rejestracji = data_rejestracji;
    }

    public Konto getKontoid() {
        return kontoid;
    }

    public void setKontoid(Konto kontoid) {
        this.kontoid = kontoid;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Dokument> getDokumentList() {
        return dokumentList;
    }

    public void setDokumentList(List<Dokument> dokumentList) {
        this.dokumentList = dokumentList;
    }

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
