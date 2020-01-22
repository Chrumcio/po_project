package com.example.po_project.kontroler;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.serwis.TypKontaSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Klasa TypKontaKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/typkonta")
@CrossOrigin
public class TypKontaKontroler {

    private TypKontaSerwisImpl typKontaSerwisImpl;

    public TypKontaKontroler(TypKontaSerwisImpl typKontaSerwisImpl) {
        this.typKontaSerwisImpl = typKontaSerwisImpl;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /{id} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param id Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu Long
     * @return ResponseEntity<TypKontaDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/{id}")
    public ResponseEntity<TypKontaDto> getTypKontaById(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok().body(typKontaSerwisImpl.getTypKontaById(id));
    }
}
