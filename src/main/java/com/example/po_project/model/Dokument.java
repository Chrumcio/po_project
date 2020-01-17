package com.example.po_project.model;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "dokument")
@Entity
public class Dokument {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_wystawienia")
    private Long data_wystawienia;

    @OneToOne
    @JoinColumn(name = "typdokumentuid",referencedColumnName = "id",nullable = false)
    private TypDokumentu typdokumentuid;

    @ManyToOne
    @JoinColumn(name = "klientid", referencedColumnName = "id")
    private Klient klientid;

    @ManyToOne
    @JoinColumn(name = "uzytkownikid", referencedColumnName = "id")
    private Uzytkownik uzytkownikid;

    public Dokument() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Long data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public TypDokumentu getTypDokumentu() {
        return typdokumentuid;
    }

    public void setTypDokumentu(TypDokumentu typDokumentu) {
        this.typdokumentuid = typDokumentu;
    }

    public Klient getKlientid() {
        return klientid;
    }

    public void setKlientid(Klient klientid) {
        this.klientid = klientid;
    }

    public Uzytkownik getUzytkownikid() {
        return uzytkownikid;
    }

    public void setUzytkownikid(Uzytkownik uzytkownikid) {
        this.uzytkownikid = uzytkownikid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dokument dokument = (Dokument) o;
        return id.equals(dokument.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "id=" + id +
                ", data_wystawienia=" + data_wystawienia +
                ", typDokumentu=" + typdokumentuid +
                ", klientid=" + klientid +
                ", uzytkownikid=" + uzytkownikid +
                '}';
    }
}
