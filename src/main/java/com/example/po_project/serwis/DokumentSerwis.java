package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;

/**
 * DokumentSerwis jest to interfejs, który zawiera logikę
 * niezbędną do działania programu. Jest implementowany przez
 * przez klase serwisu. Stworzony został by wykorzystać wzorzec
 * projektowy transaction script
 */
public interface DokumentSerwis {
    /**
     * Deklaracja metody, która ma za zadanie dodać obiekt do bazy danych
     * @param dokumentDto Obiekt, który ma zostać dodany do bazy danych
     * @return DokumentDto jeśli dodano, null w przeciwnym wypadku
     */
    DokumentDto addDokument(DokumentDto dokumentDto);

    /**
     * Deklaracja metody, która ma za zadanie wyszukać obiekt w bazie danych
     * @param id Argument, po którym będzie odbywać się wyszukiwanie
     *           obiektu w bazie danych
     * @return DokumentDto jeżeli wyszukano obiekt w bazie danych, null w
     * przeciwnym wypadku
     */
    DokumentDto getDokumentById(Long id);
}
