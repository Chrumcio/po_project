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
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param name Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @return List<PaczkaDto> jeżeli wyszukano obiekt w bazie danych,
     * pusta lista w przeciwnym wypadku
     */
    List<PaczkaDto> getPaczkaByName(String name);
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param kategoria Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @return List<PaczkaDto> jeżeli wyszukano obiekt w bazie danych,
     * pusta lista w przeciwnym wypadku
     */
    List<PaczkaDto> getPaczkaByKategoria(String kategoria);
}
