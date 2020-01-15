package com.example.po_project.model;

import javax.persistence.*;

@Table(name = "miejscemagazynowe")
@Entity
public class MiejsceMagazynowe {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "blok")
    private String blok;

    @Column(name = "numer_polki")
    private String numer_polki;

    @Column(name = "aleja")
    private String aleja;

    @Column(name = "magazynid")
    private Long magazynid;

    public MiejsceMagazynowe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getNumer_polki() {
        return numer_polki;
    }

    public void setNumer_polki(String numer_polki) {
        this.numer_polki = numer_polki;
    }

    public String getAleja() {
        return aleja;
    }

    public void setAleja(String aleja) {
        this.aleja = aleja;
    }

    public Long getMagazynid() {
        return magazynid;
    }

    public void setMagazynid(Long magazynid) {
        this.magazynid = magazynid;
    }

    @Override
    public String toString() {
        return "MiejsceMagazynowe{" +
                "id=" + id +
                ", blok='" + blok + '\'' +
                ", numer_polki='" + numer_polki + '\'' +
                ", aleja='" + aleja + '\'' +
                ", magazynid=" + magazynid +
                '}';
    }
}
