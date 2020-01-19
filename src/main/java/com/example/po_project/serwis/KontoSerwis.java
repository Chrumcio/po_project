package com.example.po_project.serwis;

import com.example.po_project.dto.KontoDto;

/**
 * KontoSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface KontoSerwis {
    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param login Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @param password Argument, po którym będzie odbywać się wyszukiwanie
     *                 obiektu w bazie danych
     * @return KontoDto jeżeli wyszukano obiekt w bazie danych, null w
     * przeciwnym wypadku
     */
    KontoDto getKontoByLogin(String login, String password);
}
