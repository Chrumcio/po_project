package com.example.po_project.kontroler;

import com.example.po_project.model.Paczka;
import com.example.po_project.serwis.PaczkaSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paczka")
@CrossOrigin
public class PaczkaKontroler {

    @Autowired
    private PaczkaSerwis paczkaSerwis;

    public PaczkaKontroler(PaczkaSerwis paczkaSerwis) {
        this.paczkaSerwis = paczkaSerwis;
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<Paczka>> getPaczkaByName(@PathVariable(value = "name")String name){
        return ResponseEntity.ok(paczkaSerwis.getPaczkaByName(name));
    }

    @GetMapping("/kategoria/{kategoria}")
    public ResponseEntity<List<Paczka>> getPaczkaByKategoria(@PathVariable(value = "kategoria")String kategoria){
        return ResponseEntity.ok(paczkaSerwis.getPaczkaByKategoria(kategoria));
    }
}
