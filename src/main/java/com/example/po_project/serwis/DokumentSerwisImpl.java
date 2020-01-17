package com.example.po_project.serwis;

import com.example.po_project.model.Dokument;
import com.example.po_project.repozytorium.DokumentRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class DokumentSerwisImpl implements DokumentSerwis {

    private DokumentRepozytorium dokumentRepozytorium;

    public DokumentSerwisImpl(DokumentRepozytorium dokumentRepozytorium) {
        this.dokumentRepozytorium = dokumentRepozytorium;
    }


    @Override
    public void addDokument(Dokument dokument) {
        dokumentRepozytorium.save(dokument);
    }

    public Dokument getDokument(Long id){
        return dokumentRepozytorium.findById(id).get();
    }
}
