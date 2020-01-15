package com.example.po_project.kontroler;


import com.example.po_project.dto.AnkietaDto;
import com.example.po_project.model.Ankieta;
import com.example.po_project.serwis.AnkietaSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ankieta")
public class AnkietaKontroler {

    @Autowired
    private AnkietaSerwisImpl ankietaSerwisImpl;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public ResponseEntity<List<Ankieta>> findCities(Model model){
        List<Ankieta> ankietas = ankietaSerwisImpl.findAll();
        //model.addAttribute("ankietas",ankietas);
        return ResponseEntity.ok().body(ankietas);
    }

    @GetMapping("/{id}")
    public AnkietaDto getAniketa(@PathVariable("id")Long id){
        return convertToDto(ankietaSerwisImpl.findAniketaById(id));
    }

    private AnkietaDto convertToDto(Ankieta ankieta) {
        AnkietaDto ankietaDto = modelMapper.map(ankieta, AnkietaDto.class);
        return ankietaDto;
    }
}
