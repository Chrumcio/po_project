package com.example.po_project.serwis;

import com.example.po_project.model.Uzytkownik;
import com.example.po_project.repozytorium.UzytkownikRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class UzytkownikSerwisImpl implements UzytkownikSerwis{

    private UzytkownikRepozytorium uzytkownikRepozytorium;

    public UzytkownikSerwisImpl(UzytkownikRepozytorium uzytkownikRepozytorium) {
        this.uzytkownikRepozytorium = uzytkownikRepozytorium;
    }

    public Uzytkownik findUzytkownikByKontoId(Long id){
        return this.uzytkownikRepozytorium.findUzytkownikByKontoid(id);
    }
}
