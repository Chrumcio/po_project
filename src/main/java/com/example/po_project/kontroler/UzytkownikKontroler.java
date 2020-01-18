package com.example.po_project.kontroler;

import com.example.po_project.dto.UzytkownikDto;
import com.example.po_project.model.Uzytkownik;
import com.example.po_project.serwis.UzytkownikSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uzytkownik")
@CrossOrigin
public class UzytkownikKontroler {

    private UzytkownikSerwisImpl uzytkownikSerwisImpl;

    public UzytkownikKontroler(UzytkownikSerwisImpl uzytkownikSerwisImpl) {
        this.uzytkownikSerwisImpl = uzytkownikSerwisImpl;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UzytkownikDto> findUzytkownikByKontoId(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(uzytkownikSerwisImpl.findUzytkownikById(id));
    }
}
