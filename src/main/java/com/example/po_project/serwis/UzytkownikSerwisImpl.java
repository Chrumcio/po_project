package com.example.po_project.serwis;

import com.example.po_project.dto.UzytkownikDto;
import com.example.po_project.model.Uzytkownik;
import com.example.po_project.repozytorium.UzytkownikRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * UzytkownikSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class UzytkownikSerwisImpl implements UzytkownikSerwis{

    private UzytkownikRepozytorium uzytkownikRepozytorium;
    private ModelMapper modelMapper;

    public UzytkownikSerwisImpl(UzytkownikRepozytorium uzytkownikRepozytorium,ModelMapper modelMapper) {
        this.uzytkownikRepozytorium = uzytkownikRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findUzytkownikById.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param id Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return UzytkownikDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    public UzytkownikDto findUzytkownikById(Long id){
        Uzytkownik uzytkownik;
        try {
            uzytkownik = uzytkownikRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        UzytkownikDto uzytkownikDto = modelMapper.map(uzytkownik,UzytkownikDto.class);
        return uzytkownikDto;
    }
}
