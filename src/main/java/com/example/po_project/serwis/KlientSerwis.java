package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;

/**
 * KlientSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface KlientSerwis {
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param id Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @return KlientDto jeżeli wyszukano obiekt w bazie danych, null w
     * przeciwnym wypadku
     */
    KlientDto getKlientById(Long id);
}
