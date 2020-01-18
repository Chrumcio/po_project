package com.example.po_project.serwis;

import com.example.po_project.dto.KontoDto;

public interface KontoSerwis {
    KontoDto getKontoByLogin(String login, String password);
}
