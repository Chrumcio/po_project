package com.example.po_project.serwis;

import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class PaczkaSerwis {

    private PaczkaRepozytorium paczkaRepozytorium;

    public PaczkaSerwis(PaczkaRepozytorium paczkaRepozytorium) {
        this.paczkaRepozytorium = paczkaRepozytorium;
    }

    public Paczka getPaczkaByNazwa(String name) {
        Paczka paczka = paczkaRepozytorium.findByNazwa(name);
        if(paczka == null){
            return null;
        }else{
            return paczka;
        }
    }
}
