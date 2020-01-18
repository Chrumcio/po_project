package com.example.po_project.dto;

public class KlientDto {

    private Long id;
    private String imie;
    private String nazwisko;
    private KontoDto kontoid;
    private String pesel;
    private String nip;

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

    public KontoDto getKontoid() {
        return kontoid;
    }

    public void setKontoid(KontoDto kontoid) {
        this.kontoid = kontoid;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "KlientDto{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kontoid=" + kontoid +
                '}';
    }
}
