package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.model.Klient;
import com.example.po_project.repozytorium.KlientRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class KlientSerwisImpl implements KlientSerwis{

    private KlientRepozytorium klientRepozytorium;

    private ModelMapper modelMapper;

    public KlientSerwisImpl(KlientRepozytorium klientRepozytorium, ModelMapper modelMapper) {
        this.klientRepozytorium = klientRepozytorium;
        this.modelMapper = modelMapper;
    }

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
