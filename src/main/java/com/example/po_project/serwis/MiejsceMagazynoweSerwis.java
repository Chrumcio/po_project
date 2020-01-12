package com.example.po_project.serwis;

import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.repozytorium.MiejsceMagazynoweRepozytorium;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiejsceMagazynoweSerwis {

    private MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium;

    public MiejsceMagazynoweSerwis(MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium) {
        this.miejsceMagazynoweRepozytorium = miejsceMagazynoweRepozytorium;
    }

    public List<MiejsceMagazynowe> getAllMiejsceMagazynowe(){
        return miejsceMagazynoweRepozytorium.findAll();
    }
}
