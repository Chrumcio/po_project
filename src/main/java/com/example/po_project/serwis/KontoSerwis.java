package com.example.po_project.serwis;

import com.example.po_project.model.Konto;

public interface KontoSerwis {
    Konto getKontoByLogin(String login, String password);
}
