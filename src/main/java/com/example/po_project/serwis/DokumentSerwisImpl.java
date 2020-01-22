package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.model.Dokument;
import com.example.po_project.repozytorium.DokumentRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * DokumentSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class DokumentSerwisImpl implements DokumentSerwis {

    private DokumentRepozytorium dokumentRepozytorium;
    private ModelMapper modelMapper;

    public DokumentSerwisImpl(DokumentRepozytorium dokumentRepozytorium, ModelMapper modelMapper) {
        this.dokumentRepozytorium = dokumentRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest dodanie obiektu do bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda save.
     * Wystepuje również mapowanie z Dto na model odpowiadający
     * encjom w bazie danych
     * @param dokumentDto Jest to obiekt, który ma zostać dodany
     *                    do bazy danych
     * @return DokumentDto Jeżeli operacja dodania się udała zostaje
     * zwrócony dodany obiekt, w przeciwnym wypadku zwracany jest null
     */
    @Override
    public DokumentDto addDokument(DokumentDto dokumentDto) {
        if(dokumentDto != null) {
            Dokument dokument = modelMapper.map(dokumentDto, Dokument.class);
            dokumentRepozytorium.save(dokument);
            return dokumentDto;
        }else{
            return null;
        }
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findById.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param id Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return DokumentDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    public DokumentDto getDokumentById(Long id){
        Dokument dokument;
        try {
            dokument = dokumentRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        DokumentDto dokumentDto = modelMapper.map(dokument, DokumentDto.class);
        return dokumentDto;
    }
}
