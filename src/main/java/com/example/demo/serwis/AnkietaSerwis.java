package com.example.demo.serwis;

import com.example.demo.model.Ankieta;
import com.example.demo.repozytorium.AnkietaRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnkietaSerwis {

    @Autowired
    private AnkietaRepozytorium ankietaRepozytorium;

    public List<Ankieta> findAll(){
        return (List<Ankieta>)ankietaRepozytorium.findAll();
    }
}
