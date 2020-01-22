package com.example.po_project.serwis;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * KontoSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class KontoSerwisImpl implements KontoSerwis{

    private KontoRepozytorium kontoRepozytorium;
    private ModelMapper modelMapper;

    public KontoSerwisImpl(KontoRepozytorium kontoRepozytorium,ModelMapper modelMapper) {
        this.kontoRepozytorium = kontoRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findById.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param login Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return KontoDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    public KontoDto getKontoByLogin(String login, String password){
        Konto konto = kontoRepozytorium.findByLogin(login);
        if(konto != null) {
            if (konto.getHaslo().equals(password)) {
                KontoDto kontoDto = modelMapper.map(konto, KontoDto.class);
                return kontoDto;
            }
        }
        return null;
    }
}
