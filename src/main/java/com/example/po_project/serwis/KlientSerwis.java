package com.example.po_project.serwis;

import com.example.po_project.model.Klient;

public interface KlientSerwis {
    Klient getKlientByKontoId(Long id);
}
