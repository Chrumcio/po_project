package com.example.po_project.serwis;

import com.example.po_project.model.TypKonta;
import com.example.po_project.repozytorium.TypKontaRepozytorium;
import org.springframework.stereotype.Service;

@Service
public class TypKontaSerwisImpl implements TypKontaSerwis{

    private TypKontaRepozytorium typKontaRepozytorium;

    public TypKontaSerwisImpl(TypKontaRepozytorium typKontaRepozytorium) {
        this.typKontaRepozytorium = typKontaRepozytorium;
    }

    public TypKonta getTypKontaById(Long id){
        return this.typKontaRepozytorium.findById(id).get();
    }
}
