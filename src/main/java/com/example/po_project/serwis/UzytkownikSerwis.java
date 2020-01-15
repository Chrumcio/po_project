package com.example.po_project.serwis;

import com.example.po_project.model.Uzytkownik;

public interface UzytkownikSerwis {
    Uzytkownik findUzytkownikByKontoId(Long id);
}
