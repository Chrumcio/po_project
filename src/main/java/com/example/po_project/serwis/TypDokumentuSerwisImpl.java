package com.example.po_project.serwis;

import com.example.po_project.model.TypDokumentu;
import com.example.po_project.repozytorium.TypDokumentuRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class TypDokumentuSerwisImpl implements TypDokumentuSerwis {

    private TypDokumentuRepozytorium typDokumentuRepozytorium;

    public TypDokumentuSerwisImpl(TypDokumentuRepozytorium typDokumentuRepozytorium) {
        this.typDokumentuRepozytorium = typDokumentuRepozytorium;
    }

    @Override
    public TypDokumentu getTypDokumentuByNazwa(String nazwa) {
        return typDokumentuRepozytorium.getTypDokumentuByNazwa(nazwa);
    }

    public TypDokumentu add(TypDokumentu dokumentu){
        return typDokumentuRepozytorium.save(dokumentu);
    }
}
