package com.example.po_project.model;

import javax.persistence.*;

@Table(name = "typkonta")
@Entity
public class TypKonta {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nazwa")
    private String nazwa;


    public TypKonta() {
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
    public String toString() {
        return "TypKonta{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
