package com.example.po_project.kontroler;

import com.example.po_project.model.Klient;
import com.example.po_project.serwis.KlientSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/klient")
@CrossOrigin
public class KlientKontroler {

    private KlientSerwis klientSerwis;

    public KlientKontroler(KlientSerwis klientSerwis) {
        this.klientSerwis = klientSerwis;
    }

    @GetMapping("/kontoid/{id}")
    public ResponseEntity<Klient> getKlientByKontoId(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok(klientSerwis.getKlientByKontoId(id));
    }
}
