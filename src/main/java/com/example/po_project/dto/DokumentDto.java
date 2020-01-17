package com.example.po_project.dto;

import com.example.po_project.model.Klient;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.model.Uzytkownik;

public class DokumentDto {

    private Long data_wystawienia;
    private TypDokumentuDto typdokumentuid;
    private UzytkownikDto uzytkownikid;
    private KlientDto klientid;

    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public TypDokumentuDto getTyp_dokumentuid() {
        return typdokumentuid;
    }

    public void setTyp_dokumentuid(TypDokumentuDto typ_dokumentuid) {
        this.typdokumentuid = typ_dokumentuid;
    }

    public UzytkownikDto getUzytkownikid() {
        return uzytkownikid;
    }

    public void setUzytkownikid(UzytkownikDto uzytkownikid) {
        this.uzytkownikid = uzytkownikid;
    }

    public KlientDto getKlientid() {
        return klientid;
    }

    public void setKlientid(KlientDto klientid) {
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
