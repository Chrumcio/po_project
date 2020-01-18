package com.example.po_project.kontroler;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.serwis.KontoSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/konto")
@CrossOrigin
public class KontoKontroler {

    private KontoSerwisImpl kontoSerwisImpl;

    public KontoKontroler(KontoSerwisImpl kontoSerwisImpl) {
        this.kontoSerwisImpl = kontoSerwisImpl;
    }

    @GetMapping("/{login}/{haslo}")
    public ResponseEntity<KontoDto> getKontoByLogin(@PathVariable(value = "login") String login, @PathVariable(value = "haslo")String haslo){
        return ResponseEntity.ok().body(kontoSerwisImpl.getKontoByLogin(login,haslo));
    }
}
