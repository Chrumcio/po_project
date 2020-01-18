package com.example.po_project.serwis;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.model.TypKonta;
import com.example.po_project.repozytorium.TypKontaRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TypKontaSerwisImpl implements TypKontaSerwis{

    private TypKontaRepozytorium typKontaRepozytorium;
    private ModelMapper modelMapper;

    public TypKontaSerwisImpl(TypKontaRepozytorium typKontaRepozytorium,ModelMapper modelMapper) {
        this.typKontaRepozytorium = typKontaRepozytorium;
        this.modelMapper = modelMapper;
    }

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
