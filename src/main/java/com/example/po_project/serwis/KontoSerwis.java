package com.example.po_project.serwis;

import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KontoSerwis {

    @Autowired
    private KontoRepozytorium kontoRepozytorium;
}
