package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.model.Dokument;
import com.example.po_project.repozytorium.DokumentRepozytorium;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DokumentSerwisImpl implements DokumentSerwis {

    private DokumentRepozytorium dokumentRepozytorium;
    private ModelMapper modelMapper;

    public DokumentSerwisImpl(DokumentRepozytorium dokumentRepozytorium, ModelMapper modelMapper) {
        this.dokumentRepozytorium = dokumentRepozytorium;
        this.modelMapper = modelMapper;
    }

    @Override
    public DokumentDto addDokument(DokumentDto dokumentDto) {
        if(dokumentDto != null) {
            Dokument dokument = modelMapper.map(dokumentDto, Dokument.class);
            dokumentRepozytorium.save(dokument);
            return dokumentDto;
        }else{
            return null;
        }
    }

    public DokumentDto getDokumentById(Long id){
        Dokument dokument;
        try {
            dokument = dokumentRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        DokumentDto dokumentDto = modelMapper.map(dokument, DokumentDto.class);
        return dokumentDto;
    }
}
