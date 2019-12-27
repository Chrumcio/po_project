package com.example.demo.kontroler;

import com.example.demo.model.Ankieta;
import com.example.demo.serwis.AnkietaSerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class AnkietaKontroler {

    @Autowired
    private AnkietaSerwis ankietaSerwis;

    @GetMapping("/all")
    public String findCities(Model model){
        List<Ankieta> ankietas = ankietaSerwis.findAll();
        model.addAttribute("ankietas",ankietas);
        return "showAnkietas";
    }
}
