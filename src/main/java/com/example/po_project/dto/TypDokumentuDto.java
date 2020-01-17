package com.example.po_project.dto;

public class TypDokumentuDto {

    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "TypDokumentuDto{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
