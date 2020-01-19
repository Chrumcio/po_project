package com.example.po_project.serwis;

import com.example.po_project.dto.TypDokumentuDto;

/**
 * TypDokumentuSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface TypDokumentuSerwis {
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param nazwa Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @return TypDokumentuDto jeżeli wyszukano obiekt w bazie danych, null w
     * przeciwnym wypadku
     */
    TypDokumentuDto getTypDokumentuByNazwa(String nazwa);
}
