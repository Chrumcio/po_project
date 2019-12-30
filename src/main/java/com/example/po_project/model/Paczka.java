package com.example.po_project.model;

import javax.persistence.*;

@Entity
public class Paczka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nazwa;
    private Long kod_kreskowy;
    private String kog_qr;
    private double wartosc;
    public boolean czy_ubezpieczona;
    private Long MiejsceMagazynoweid;
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
        this.MiejsceMagazynoweid = miejsceMagazynoweid;
        this.magazynid = magazynid;
    }

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
        return MiejsceMagazynoweid;
    }

    public void setMiejsceMagazynoweid(Long miejsceMagazynoweid) {
        MiejsceMagazynoweid = miejsceMagazynoweid;
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
                ", nazwa='" + nazwa + '\'' +
                ", kod_kreskowy=" + kod_kreskowy +
                ", kog_qr='" + kog_qr + '\'' +
                ", wartosc=" + wartosc +
                ", czy_ubezpieczona=" + czy_ubezpieczona +
                ", MiejsceMagazynoweid=" + MiejsceMagazynoweid +
                ", magazynid=" + magazynid +
                '}';
    }
}
