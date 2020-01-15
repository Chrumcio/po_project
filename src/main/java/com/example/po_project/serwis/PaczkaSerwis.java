package com.example.po_project.serwis;

import com.example.po_project.model.Paczka;

import java.util.List;

public interface PaczkaSerwis {
    List<Paczka> getPaczkaByName(String name);
    List<Paczka> getPaczkaByKategoria(String kategoria);
}
