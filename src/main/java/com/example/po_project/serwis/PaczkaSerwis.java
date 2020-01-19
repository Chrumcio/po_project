package com.example.po_project.serwis;

import com.example.po_project.dto.PaczkaDto;

import java.util.List;

/**
 * PaczkaSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface PaczkaSerwis {
    List<PaczkaDto> getPaczkaByName(String name);
    List<PaczkaDto> getPaczkaByKategoria(String kategoria);
}
