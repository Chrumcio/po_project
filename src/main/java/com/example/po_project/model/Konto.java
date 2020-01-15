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

    @Column(name = "typ_kontaid")
    private Long typ_kontaid;

    public Konto() {
    }

    public Konto(Long id, String login, String haslo, Long typ_kontaid){
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

    public Long getTyp_kontaid() {
        return typ_kontaid;
    }

    public void setTyp_kontaid(Long typ_kontaid) {
        this.typ_kontaid = typ_kontaid;
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
