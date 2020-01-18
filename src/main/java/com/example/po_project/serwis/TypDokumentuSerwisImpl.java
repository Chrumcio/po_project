package com.example.po_project.serwis;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.repozytorium.TypDokumentuRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TypDokumentuSerwisImpl implements TypDokumentuSerwis {

    private TypDokumentuRepozytorium typDokumentuRepozytorium;
    private ModelMapper modelMapper;

    public TypDokumentuSerwisImpl(TypDokumentuRepozytorium typDokumentuRepozytorium,ModelMapper modelMapper) {
        this.typDokumentuRepozytorium = typDokumentuRepozytorium;
        this.modelMapper = modelMapper;
    }

    @Override
    public TypDokumentuDto getTypDokumentuByNazwa(String nazwa) {
        TypDokumentu typDokumentu = typDokumentuRepozytorium.getTypDokumentuByNazwa(nazwa);
        if(typDokumentu != null){
            TypDokumentuDto typDokumentuDto = modelMapper.map(typDokumentu,TypDokumentuDto.class);
            return typDokumentuDto;
        }
        return null;
    }
}
