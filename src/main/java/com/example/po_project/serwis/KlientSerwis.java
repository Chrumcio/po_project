package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;

public interface KlientSerwis {
    KlientDto getKlientByKontoId(Long id);
}
