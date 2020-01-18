package com.example.po_project.dto;

public class UzytkownikDto {
    private Long id;
    private String imie;
    private String nazwisko;
    private KontoDto kontoid;

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

    @Override
    public String toString() {
        return "UzytkownikDto{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kontoid=" + kontoid +
                '}';
    }
}
