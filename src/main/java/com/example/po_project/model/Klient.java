package com.example.po_project.model;

import javax.persistence.*;
import java.util.List;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNumer_dowodu() {
        return numer_dowodu;
    }

    public void setNumer_dowodu(String numer_dowodu) {
        this.numer_dowodu = numer_dowodu;
    }

    public boolean isCzy_staly() {
        return czy_staly;
    }

    public void setCzy_staly(boolean czy_staly) {
        this.czy_staly = czy_staly;
    }

    public Konto getKontoid() {
        return kontoid;
    }

    public void setKontoid(Konto kontoid) {
        this.kontoid = kontoid;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public List<Dokument> getDokumentList() {
        return dokumentList;
    }

    public void setDokumentList(List<Dokument> dokumentList) {
        this.dokumentList = dokumentList;
    }

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
