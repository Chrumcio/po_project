package com.example.po_project.serwis;

import com.example.po_project.dto.MiejsceMagazynoweDto;

import java.util.List;

/**
 * MiejsceMagazynoweSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface MiejsceMagazynoweSerwis {
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekty w bazie danych
     * @return List<MiejsceMagazynoweDto> jeżeli wyszukano obiekt w bazie danych,
     * null w przeciwnym wypadku
     */
    List<MiejsceMagazynoweDto> getAllMiejsceMagazynowe();
}
