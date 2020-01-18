package com.example.po_project.serwis;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaczkaSerwisImpl implements PaczkaSerwis{

    private PaczkaRepozytorium paczkaRepozytorium;
    private ModelMapper modelMapper;

    public PaczkaSerwisImpl(PaczkaRepozytorium paczkaRepozytorium,ModelMapper modelMapper) {
        this.paczkaRepozytorium = paczkaRepozytorium;
        this.modelMapper = modelMapper;
    }

    public List<PaczkaDto> getPaczkaByName(String name) {
        List<Paczka> paczkaList = paczkaRepozytorium.findByNazwa(name);
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for(Paczka paczka : paczkaList){
            paczkaDtoList.add(modelMapper.map(paczka,PaczkaDto.class));
        }
        return paczkaDtoList;
    }

    public List<PaczkaDto> getPaczkaByKategoria(String kategoria){
        List<Paczka> paczkaList = paczkaRepozytorium.findByKategoria(kategoria);
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for(Paczka paczka : paczkaList){
            paczkaDtoList.add(modelMapper.map(paczka,PaczkaDto.class));
        }
        return paczkaDtoList;
    }
}
