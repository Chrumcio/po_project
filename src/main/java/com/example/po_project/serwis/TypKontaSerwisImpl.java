package com.example.po_project.serwis;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.model.TypKonta;
import com.example.po_project.repozytorium.TypKontaRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * TypKontaSerwisImpl jest klasa, która implementuje interfejs,
 * w którym zawarta jest konieczna do zaimplementowania logika
 * aplikacji. Klasa posiada 2 pola prywatne jakimi są ModelMapper
 * wykorzystywany do mapowania obiektów oraz Repozytorium, które
 * zapewnia komunikacje z baza danych
 */
@Service
public class TypKontaSerwisImpl implements TypKontaSerwis{

    private TypKontaRepozytorium typKontaRepozytorium;
    private ModelMapper modelMapper;

    public TypKontaSerwisImpl(TypKontaRepozytorium typKontaRepozytorium,ModelMapper modelMapper) {
        this.typKontaRepozytorium = typKontaRepozytorium;
        this.modelMapper = modelMapper;
    }

    /**
     * Zadaniem metody jest pobranie obiektu z bazy danych.
     * Dlatego wywolywane jest repozytorium i metoda findById.
     * Wystepuje również mapowanie z modelu na Dto, który ukrywa
     * przed uzytkownikiem niepotrzebne dane modelu
     * @param id Jest to argument, który jest używany do wyszukania
     *           obiektu w bazie danych
     * @return TypKontaDto Jeżeli obiekt został znaleziony w bazie
     * danych to zwracamy go, w przeciwnym wypadku zwracany jest null
     */
    public TypKontaDto getTypKontaById(Long id){
        TypKonta typKonta;
        try{
            typKonta = typKontaRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        TypKontaDto typKontaDto = modelMapper.map(typKonta,TypKontaDto.class);
        return typKontaDto;
    }
}
