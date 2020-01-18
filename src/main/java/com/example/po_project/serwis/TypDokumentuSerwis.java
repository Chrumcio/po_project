package com.example.po_project.serwis;

import com.example.po_project.dto.TypDokumentuDto;

public interface TypDokumentuSerwis {
    TypDokumentuDto getTypDokumentuByNazwa(String nazwa);
}
