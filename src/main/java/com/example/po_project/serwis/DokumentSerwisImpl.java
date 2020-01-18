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
    public void addDokument(DokumentDto dokumentDto) {
        Dokument dokument = modelMapper.map(dokumentDto,Dokument.class);
        dokumentRepozytorium.save(dokument);
    }

    public DokumentDto getDokument(Long id){
        Dokument dokument = dokumentRepozytorium.findById(id).get();
        DokumentDto dokumentDto = modelMapper.map(dokument,DokumentDto.class);
        return dokumentDto;
    }
}
