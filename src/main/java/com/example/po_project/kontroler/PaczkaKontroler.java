package com.example.po_project.kontroler;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.serwis.PaczkaSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paczka")
@CrossOrigin
public class PaczkaKontroler {

    private PaczkaSerwisImpl paczkaSerwisImpl;

    public PaczkaKontroler(PaczkaSerwisImpl paczkaSerwisImpl) {
        this.paczkaSerwisImpl = paczkaSerwisImpl;
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<PaczkaDto>> getPaczkaByName(@PathVariable(value = "name")String name){
        return ResponseEntity.ok().body(paczkaSerwisImpl.getPaczkaByName(name));
    }

    @GetMapping("/kategoria/{kategoria}")
    public ResponseEntity<List<PaczkaDto>> getPaczkaByKategoria(@PathVariable(value = "kategoria")String kategoria){
        return ResponseEntity.ok().body(paczkaSerwisImpl.getPaczkaByKategoria(kategoria));
    }
}
