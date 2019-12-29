package com.example.po_project.kontroler;

import com.example.po_project.model.Konto;
import com.example.po_project.serwis.KontoSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/konto")
@CrossOrigin
public class KontoKontroler {

    private KontoSerwis kontoSerwis;

    public KontoKontroler(KontoSerwis kontoSerwis) {
        this.kontoSerwis = kontoSerwis;
    }

    @GetMapping("/{login}/{haslo}")
    public ResponseEntity<Konto> getKontoByLogin(@PathVariable(value = "login") String login,@PathVariable(value = "haslo")String haslo){
        return ResponseEntity.ok(kontoSerwis.getKontoByLogin(login,haslo));
    }
}
