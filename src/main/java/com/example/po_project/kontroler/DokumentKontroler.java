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

    public DokumentKontroler(DokumentSerwisImpl dokumentSerwis) {
        this.dokumentSerwis = dokumentSerwis;
    }

    @PostMapping("/dodaj")
    public ResponseEntity<DokumentDto> addDokument(@RequestBody DokumentDto dokumentDto){
        dokumentSerwis.addDokument(dokumentDto);
        return ResponseEntity.ok().body(dokumentDto);
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DokumentDto> getDokument(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok().body(dokumentSerwis.getDokument(id));
    }
}
