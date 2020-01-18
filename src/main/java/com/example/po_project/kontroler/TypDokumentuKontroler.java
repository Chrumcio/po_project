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

    public TypDokumentuKontroler(TypDokumentuSerwisImpl typDokumentuSerwis) {
        this.typDokumentuSerwis = typDokumentuSerwis;
    }

    @GetMapping("/{nazwa}")
    public ResponseEntity<TypDokumentuDto> getTypDokumentuByNazwa(@PathVariable(value = "nazwa")String nazwa){
        return ResponseEntity.ok().body(typDokumentuSerwis.getTypDokumentuByNazwa(nazwa));
    }
}
