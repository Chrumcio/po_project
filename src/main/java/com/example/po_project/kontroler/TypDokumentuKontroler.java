package com.example.po_project.kontroler;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.serwis.TypDokumentuSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typDokumentu")
@CrossOrigin
public class TypDokumentuKontroler {

    private TypDokumentuSerwisImpl typDokumentuSerwis;
    private ModelMapper modelMapper;

    public TypDokumentuKontroler(TypDokumentuSerwisImpl typDokumentuSerwis, ModelMapper modelMapper) {
        this.typDokumentuSerwis = typDokumentuSerwis;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{nazwa}")
    public TypDokumentuDto getTypDokumentuByNazwa(@PathVariable(value = "nazwa")String nazwa){
        return convertToDto(typDokumentuSerwis.getTypDokumentuByNazwa(nazwa));
    }

    private TypDokumentuDto convertToDto(TypDokumentu typDokumentu){
        return modelMapper.map(typDokumentu,TypDokumentuDto.class);
    }

    @PostMapping("/dodaj")
    public ResponseEntity<TypDokumentu> add(@RequestBody TypDokumentu dokumentu){
        typDokumentuSerwis.add(dokumentu);
        return ResponseEntity.ok().body(dokumentu);
    }
}
