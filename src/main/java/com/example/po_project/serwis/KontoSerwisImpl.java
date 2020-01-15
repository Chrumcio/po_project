package com.example.po_project.serwis;

import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class KontoSerwisImpl {

    private KontoRepozytorium kontoRepozytorium;

    public KontoSerwisImpl(KontoRepozytorium kontoRepozytorium) {
        this.kontoRepozytorium = kontoRepozytorium;
    }

    public Konto getKontoByLogin(String login,String password){
        Konto konto = kontoRepozytorium.findByLogin(login);
        if(konto.getHaslo().equals(password)){
            return konto;
        }else {
            return null;
        }
    }
}
