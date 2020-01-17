package com.example.po_project.model;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "typdokumentu")
@Entity
public class TypDokumentu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nazwa")
    private String nazwa;

    @OneToOne(mappedBy = "typdokumentuid")
    private Dokument dokument;

    public TypDokumentu() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypDokumentu that = (TypDokumentu) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nazwa, that.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nazwa);
    }

    @Override
    public String toString() {
        return "TypDokumentu{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
