package com.example.po_project.serwis;

import com.example.po_project.dto.UzytkownikDto;

public interface UzytkownikSerwis {
    UzytkownikDto findUzytkownikByKontoId(Long id);
}
