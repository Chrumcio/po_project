package com.example.po_project.model;

import javax.persistence.*;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public TypKonta getTyp_kontaid() {
        return typ_kontaid;
    }

    public void setTyp_kontaid(TypKonta typ_kontaid) {
        this.typ_kontaid = typ_kontaid;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

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
