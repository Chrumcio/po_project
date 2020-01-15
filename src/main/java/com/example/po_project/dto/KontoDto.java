package com.example.po_project.dto;

public class KontoDto {

    private Long id;
    private String login;
    private String haslo;
    private Long typ_kontaid;

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
        return "KontoDto{" +
                "login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", typ_kontaid=" + typ_kontaid +
                '}';
    }
}
