package com.example.po_project.serwis;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.repozytorium.TypDokumentuRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * TypDokumentuSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class TypDokumentuSerwisImpl implements TypDokumentuSerwis {

    private TypDokumentuRepozytorium typDokumentuRepozytorium;
    private ModelMapper modelMapper;

    public TypDokumentuSerwisImpl(TypDokumentuRepozytorium typDokumentuRepozytorium,ModelMapper modelMapper) {
        this.typDokumentuRepozytorium = typDokumentuRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda getTypDokumentuByNazwa.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param nazwa Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return TypDokumentuDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    @Override
    public TypDokumentuDto getTypDokumentuByNazwa(String nazwa) {
        TypDokumentu typDokumentu = typDokumentuRepozytorium.getTypDokumentuByNazwa(nazwa);
        if(typDokumentu != null){
            TypDokumentuDto typDokumentuDto = modelMapper.map(typDokumentu,TypDokumentuDto.class);
            return typDokumentuDto;
        }
        return null;
    }
}
