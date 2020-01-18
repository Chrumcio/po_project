package com.example.po_project.serwis;

import com.example.po_project.dto.MiejsceMagazynoweDto;
import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.repozytorium.MiejsceMagazynoweRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MiejsceMagazynoweSerwisImpl implements MiejsceMagazynoweSerwis{

    private MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium;
    private ModelMapper modelMapper;

    public MiejsceMagazynoweSerwisImpl(MiejsceMagazynoweRepozytorium miejsceMagazynoweRepozytorium,ModelMapper modelMapper) {
        this.miejsceMagazynoweRepozytorium = miejsceMagazynoweRepozytorium;
        this.modelMapper = modelMapper;
    }

    public List<MiejsceMagazynoweDto> getAllMiejsceMagazynowe(){
        List<MiejsceMagazynowe> miejsceMagazynoweList = miejsceMagazynoweRepozytorium.findAll();
        List<MiejsceMagazynoweDto> miejsceMagazynoweDtoList = new ArrayList<>();
        for (int i = 0; i < miejsceMagazynoweList.size(); i++){
            miejsceMagazynoweDtoList.add(modelMapper.map(miejsceMagazynoweList.get(i),MiejsceMagazynoweDto.class));
        }
        return miejsceMagazynoweDtoList;
    }
}
