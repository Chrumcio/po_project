package com.example.po_project.serwis;

import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KontoSerwis {

    private KontoRepozytorium kontoRepozytorium;

    public KontoSerwis(KontoRepozytorium kontoRepozytorium) {
        this.kontoRepozytorium = kontoRepozytorium;
    }

    public Konto getKontoByLogin(String login,String password){
        Konto konto = kontoRepozytorium.findByLogin(login);
        if(konto == null){
            return null;
        }else{
            String haslo = konto.getHaslo();
            if(haslo.equals(password)){
                return konto;
            }
            return null;
        }
    }
}
