package com.example.po_project.serwis;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * PaczkaSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class PaczkaSerwisImpl implements PaczkaSerwis{

    private PaczkaRepozytorium paczkaRepozytorium;
    private ModelMapper modelMapper;

    public PaczkaSerwisImpl(PaczkaRepozytorium paczkaRepozytorium,ModelMapper modelMapper) {
        this.paczkaRepozytorium = paczkaRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findByNazwa.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param name Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return List<PaczkaDto> Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracana jest pusta lista
     */
    public List<PaczkaDto> getPaczkaByName(String name) {
        List<Paczka> paczkaList = paczkaRepozytorium.findByNazwa(name);
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for(Paczka paczka : paczkaList){
            paczkaDtoList.add(modelMapper.map(paczka,PaczkaDto.class));
        }
        return paczkaDtoList;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findByKategoria.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param kategoria Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return List<PaczkaDto> Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracana jest pusta lista
     */
    public List<PaczkaDto> getPaczkaByKategoria(String kategoria){
        List<Paczka> paczkaList = paczkaRepozytorium.findByKategoria(kategoria);
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for(Paczka paczka : paczkaList){
            paczkaDtoList.add(modelMapper.map(paczka,PaczkaDto.class));
        }
        return paczkaDtoList;
    }
}
