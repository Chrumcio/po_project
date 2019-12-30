package com.example.po_project.kontroler;

import com.example.po_project.model.Paczka;
import com.example.po_project.serwis.PaczkaSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paczka")
@CrossOrigin
public class PaczkaKontroler {

    private PaczkaSerwis paczkaSerwis;

    public PaczkaKontroler(PaczkaSerwis paczkaSerwis) {
        this.paczkaSerwis = paczkaSerwis;
    }

    @GetMapping("/{name}")
    public ResponseEntity<Paczka> getPaczkaByName(@PathVariable(value = "name")String name){
        return ResponseEntity.ok(paczkaSerwis.getPaczkaByName(name));
    }
}
