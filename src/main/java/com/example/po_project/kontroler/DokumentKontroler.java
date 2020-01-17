package com.example.po_project.kontroler;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.model.Dokument;
import com.example.po_project.serwis.DokumentSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dokument")
@CrossOrigin
public class DokumentKontroler {

    private DokumentSerwisImpl dokumentSerwis;
    private ModelMapper modelMapper;

    public DokumentKontroler(DokumentSerwisImpl dokumentSerwis, ModelMapper modelMapper) {
        this.dokumentSerwis = dokumentSerwis;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/dodaj")
    public ResponseEntity<DokumentDto> addDokument(@RequestBody DokumentDto dokumentDto){
        dokumentSerwis.addDokument(convertFromDto(dokumentDto));
        return ResponseEntity.ok().body(dokumentDto);
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Dokument getDokument(@PathVariable(value = "id")Long id){
        return dokumentSerwis.getDokument(id);
    }

    private Dokument convertFromDto(DokumentDto dokumentDto){
        return modelMapper.map(dokumentDto,Dokument.class);
    }
}
