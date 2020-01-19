package com.example.po_project.serwis;

import com.example.po_project.dto.MiejsceMagazynoweDto;
import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.repozytorium.MiejsceMagazynoweRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * MiejsceMagazynoweSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class MiejsceMagazynoweSerwisImpl implements MiejsceMagazynoweSerwis{

    private MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium;
    private ModelMapper modelMapper;

    public MiejsceMagazynoweSerwisImpl(MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium,ModelMapper modelMapper) {
        this.miejsceMagazynoweRepozytorium = miejsceMagazynoweRepozytorium;
        this.modelMapper = modelMapper;
    }


    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findAll.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @return List<MiejsceMagazynoweDto> Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracana jest pusta lista
     */
    public List<MiejsceMagazynoweDto> getAllMiejsceMagazynowe(){
        List<MiejsceMagazynowe> miejsceMagazynoweList = miejsceMagazynoweRepozytorium.findAll();
        List<MiejsceMagazynoweDto> miejsceMagazynoweDtoList = new ArrayList<>();
        for (int i = 0; i < miejsceMagazynoweList.size(); i++){
            miejsceMagazynoweDtoList.add(modelMapper.map(miejsceMagazynoweList.get(i),MiejsceMagazynoweDto.class));
        }
        return miejsceMagazynoweDtoList;
    }
}
