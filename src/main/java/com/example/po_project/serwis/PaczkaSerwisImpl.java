package com.example.po_project.serwis;

import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaczkaSerwisImpl implements PaczkaSerwis{

    private PaczkaRepozytorium paczkaRepozytorium;

    public PaczkaSerwisImpl(PaczkaRepozytorium paczkaRepozytorium) {
        this.paczkaRepozytorium = paczkaRepozytorium;
    }

    public List<Paczka> getPaczkaByName(String name) {
        List<Paczka> paczkaList = paczkaRepozytorium.findByNazwa(name);
        return paczkaList;
    }

    public List<Paczka> getPaczkaByKategoria(String kategoria){
        List<Paczka> paczkaList = paczkaRepozytorium.findByKategoria(kategoria);
        return paczkaList;
    }
}
