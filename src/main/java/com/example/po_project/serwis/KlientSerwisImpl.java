package com.example.po_project.serwis;

import com.example.po_project.model.Klient;
import com.example.po_project.repozytorium.KlientRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class KlientSerwisImpl {

    private KlientRepozytorium klientRepozytorium;

    public KlientSerwisImpl(KlientRepozytorium klientRepozytorium) {
        this.klientRepozytorium = klientRepozytorium;
    }

    public Klient getKlientByKontoId(Long id){
        return klientRepozytorium.findKlientByKontoid(id);
    }
}
