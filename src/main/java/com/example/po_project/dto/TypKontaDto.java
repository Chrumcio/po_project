package com.example.po_project.dto;

public class TypKontaDto {

    private Long id;
    private String nazwa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "TypKontaDto{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
