package com.example.po_project.kontroler;


import com.example.po_project.model.Ankieta;
import com.example.po_project.serwis.AnkietaSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ankieta")
public class AnkietaKontroler {

    @Autowired
    private AnkietaSerwis ankietaSerwis;

    @GetMapping("/all")
    public ResponseEntity<List<Ankieta>> findCities(Model model){
        List<Ankieta> ankietas = ankietaSerwis.findAll();
        //model.addAttribute("ankietas",ankietas);
        return ResponseEntity.ok().body(ankietas);
    }
}
