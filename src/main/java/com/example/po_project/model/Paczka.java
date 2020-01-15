package com.example.po_project.model;

import javax.persistence.*;

@Entity
@Table(name = "paczka")
public class Paczka {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "kategoria")
    private String kategoria;

    @Column(name = "miejsce_magazynowe_id")
    private Long miejsce_magazynowe_id;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "kod_kreskowy")
    private Long kod_kreskowy;

    @Column(name = "kod_qr")
    private String kog_qr;

    @Column(name = "wartosc")
    private double wartosc;

    @Column(name = "czy_ubezpieczona")
    public boolean czy_ubezpieczona;

    @Column(name = "magazynid")
    private Long magazynid;

    public Paczka() {
    }

    public Paczka(Long id,String nazwa,Long kod_kreskowy,String kog_qr,double wartosc, boolean czy_ubezpieczona, Long miejsceMagazynoweid, Long magazynid){
        this.id = id;
        this.nazwa = nazwa;
        this.kod_kreskowy = kod_kreskowy;
        this.kog_qr = kog_qr;
        this.wartosc = wartosc;
        this.czy_ubezpieczona = czy_ubezpieczona;
        this.miejsce_magazynowe_id = miejsceMagazynoweid;
        this.magazynid = magazynid;
    }

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

    public Long getMiejsce_magazynowe_id() {
        return miejsce_magazynowe_id;
    }

    public void setMiejsce_magazynowe_id(Long miejsce_magazynowe_id) {
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

    public String getKog_qr() {
        return kog_qr;
    }

    public void setKog_qr(String kog_qr) {
        this.kog_qr = kog_qr;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public boolean isCzy_ubezpieczona() {
        return czy_ubezpieczona;
    }

    public void setCzy_ubezpieczona(boolean czy_ubezpieczona) {
        this.czy_ubezpieczona = czy_ubezpieczona;
    }

    public Long getMiejsceMagazynoweid() {
        return this.miejsce_magazynowe_id;
    }

    public void setMiejsceMagazynoweid(Long miejsceMagazynoweid) {
        this.miejsce_magazynowe_id = miejsceMagazynoweid;
    }

    public Long getMagazynid() {
        return magazynid;
    }

    public void setMagazynid(Long magazynid) {
        this.magazynid = magazynid;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "id=" + id +
                ", kategoria='" + kategoria + '\'' +
                ", miejsce_magazynowe_id=" + miejsce_magazynowe_id +
                ", nazwa='" + nazwa + '\'' +
                ", kod_kreskowy=" + kod_kreskowy +
                ", kog_qr='" + kog_qr + '\'' +
                ", wartosc=" + wartosc +
                ", czy_ubezpieczona=" + czy_ubezpieczona +
                ", magazynid=" + magazynid +
                '}';
    }
}
