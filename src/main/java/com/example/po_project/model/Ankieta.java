package com.example.po_project.model;

import javax.persistence.*;

@Entity
@Table(name = "ankieta")
public class Ankieta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pytanie;
    private String odpowiedz;
    private Long data_wypelnienia;
    private Long klientId;

    public Ankieta() {
    }

    public Ankieta(Long id, String pytanie, String odpowiedz, Long dataWypelnienia, Long klientId) {
        this.id = id;
        this.pytanie = pytanie;
        this.odpowiedz = odpowiedz;
        this.data_wypelnienia = dataWypelnienia;
        this.klientId = klientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public Long getDataWypelnienia() {
        return data_wypelnienia;
    }

    public void setDataWypelnienia(Long dataWypelnienia) {
        this.data_wypelnienia = dataWypelnienia;
    }

    public Long getKlientId() {
        return klientId;
    }

    public void setKlientId(Long klientId) {
        this.klientId = klientId;
    }

    @Override
    public String toString() {
        return "Ankieta{" +
                "id=" + id +
                ", pytanie='" + pytanie + '\'' +
                ", odpowiedz='" + odpowiedz + '\'' +
                ", dataWypelnienia=" + data_wypelnienia +
                ", klientId=" + klientId +
                '}';
    }
}
