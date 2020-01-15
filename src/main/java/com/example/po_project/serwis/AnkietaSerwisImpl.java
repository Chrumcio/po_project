package com.example.po_project.serwis;

import com.example.po_project.model.Ankieta;
import com.example.po_project.repozytorium.AnkietaRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnkietaSerwisImpl {

    @Autowired
    private AnkietaRepozytorium ankietaRepozytorium;

    public List<Ankieta> findAll(){
        return (List<Ankieta>)ankietaRepozytorium.findAll();
    }

    public Ankieta findAniketaById(Long id){
        return ankietaRepozytorium.findAnkietaById(id);
    }
}
