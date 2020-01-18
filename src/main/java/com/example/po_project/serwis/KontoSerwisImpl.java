package com.example.po_project.serwis;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KontoSerwisImpl implements KontoSerwis{

    private KontoRepozytorium kontoRepozytorium;
    private ModelMapper modelMapper;

    public KontoSerwisImpl(KontoRepozytorium kontoRepozytorium,ModelMapper modelMapper) {
        this.kontoRepozytorium = kontoRepozytorium;
        this.modelMapper = modelMapper;
    }

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
