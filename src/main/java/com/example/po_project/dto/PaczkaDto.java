package com.example.po_project.dto;

public class PaczkaDto {

    private Long id;
    private String kategoria;
    private MiejsceMagazynoweDto miejsce_magazynowe_id;
    private String nazwa;
    private Long kod_kreskowy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public MiejsceMagazynoweDto getMiejsce_magazynowe_id() {
        return miejsce_magazynowe_id;
    }

    public void setMiejsce_magazynowe_id(MiejsceMagazynoweDto miejsce_magazynowe_id) {
        this.miejsce_magazynowe_id = miejsce_magazynowe_id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Long getKod_kreskowy() {
        return kod_kreskowy;
    }

    public void setKod_kreskowy(Long kod_kreskowy) {
        this.kod_kreskowy = kod_kreskowy;
    }

    @Override
    public String toString() {
        return "PaczkaDto{" +
                "id=" + id +
                ", kategoria='" + kategoria + '\'' +
                ", miejsce_magazynowe_id=" + miejsce_magazynowe_id +
                ", nazwa='" + nazwa + '\'' +
                ", kod_kreskowy=" + kod_kreskowy +
                '}';
    }
}
