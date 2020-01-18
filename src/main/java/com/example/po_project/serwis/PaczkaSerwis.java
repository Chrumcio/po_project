package com.example.po_project.serwis;

import com.example.po_project.dto.PaczkaDto;

import java.util.List;

public interface PaczkaSerwis {
    List<PaczkaDto> getPaczkaByName(String name);
    List<PaczkaDto> getPaczkaByKategoria(String kategoria);
}
