package com.example.po_project.kontroler;

import com.example.po_project.model.Uzytkownik;
import com.example.po_project.serwis.UzytkownikSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uzytkownik")
@CrossOrigin
public class UzytkownikKontroler {

    private UzytkownikSerwis uzytkownikSerwis;

    public UzytkownikKontroler(UzytkownikSerwis uzytkownikSerwis) {
        this.uzytkownikSerwis = uzytkownikSerwis;
    }

    @GetMapping("/kontoid/{id}")
    public ResponseEntity<Uzytkownik> findUzytkownikByKontoId(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(uzytkownikSerwis.findUzytkownikByKontoId(id));
    }
}
