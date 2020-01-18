package com.example.po_project.dto;

public class DokumentDto {

    private Long data_wystawienia;
    private TypDokumentuDto typ_dokumentuid;
    private UzytkownikDto uzytkownikid;
    private KlientDto klientid;

    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public TypDokumentuDto getTyp_dokumentuid() {
        return typ_dokumentuid;
    }

    public void setTyp_dokumentuid(TypDokumentuDto typ_dokumentuid) {
        this.typ_dokumentuid = typ_dokumentuid;
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
                ", typ_dokumentuid=" + typ_dokumentuid +
                ", uzytkownikid=" + uzytkownikid +
                ", klientid=" + klientid +
                '}';
    }
}
