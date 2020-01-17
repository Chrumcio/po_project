package com.example.po_project.dto;

import com.example.po_project.model.Klient;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.model.Uzytkownik;

public class DokumentDto {

    private Long data_wystawienia;
    private TypDokumentu typdokumentuid;
    private Uzytkownik uzytkownikid;
    private Klient klientid;

    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public TypDokumentu getTyp_dokumentuid() {
        return typdokumentuid;
    }

    public void setTyp_dokumentuid(TypDokumentu typ_dokumentuid) {
        this.typdokumentuid = typ_dokumentuid;
    }

    public Uzytkownik getUzytkownikid() {
        return uzytkownikid;
    }

    public void setUzytkownikid(Uzytkownik uzytkownikid) {
        this.uzytkownikid = uzytkownikid;
    }

    public Klient getKlientid() {
        return klientid;
    }

    public void setKlientid(Klient klientid) {
        this.klientid = klientid;
    }

    @Override
    public String toString() {
        return "DokumentDto{" +
                "data_wystawienia=" + data_wystawienia +
                ", typ_dokumentuid=" + typdokumentuid +
                ", uzytkownikid=" + uzytkownikid +
                ", klientid=" + klientid +
                '}';
    }
}
