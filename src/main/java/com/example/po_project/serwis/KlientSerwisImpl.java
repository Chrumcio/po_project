package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.model.Klient;
import com.example.po_project.repozytorium.KlientRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * KlientSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class KlientSerwisImpl implements KlientSerwis{

    private KlientRepozytorium klientRepozytorium;

    private ModelMapper modelMapper;

    public KlientSerwisImpl(KlientRepozytorium klientRepozytorium, ModelMapper modelMapper) {
        this.klientRepozytorium = klientRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findById.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param id Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return KlientDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    public KlientDto getKlientById(Long id){
        Klient klient;
        try {
            klient = klientRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        KlientDto klientDto = modelMapper.map(klient,KlientDto.class);
        return klientDto;
    }
}
