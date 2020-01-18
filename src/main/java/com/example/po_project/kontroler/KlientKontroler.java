package com.example.po_project.kontroler;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.serwis.KlientSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/klient")
@CrossOrigin
public class KlientKontroler {

    private KlientSerwisImpl klientSerwisImpl;

    public KlientKontroler(KlientSerwisImpl klientSerwisImpl) {
        this.klientSerwisImpl = klientSerwisImpl;
    }

    @GetMapping("/kontoid/{id}")
    public ResponseEntity<KlientDto> getKlientByKontoId(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok().body(klientSerwisImpl.getKlientByKontoId(id));
    }
}
