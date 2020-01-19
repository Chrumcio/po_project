package com.example.po_project.serwis;

import com.example.po_project.dto.UzytkownikDto;

/**
 * UzytkownikSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface UzytkownikSerwis {
    UzytkownikDto findUzytkownikById(Long id);
}
