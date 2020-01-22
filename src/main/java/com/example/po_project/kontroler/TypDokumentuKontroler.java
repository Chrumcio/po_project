package com.example.po_project.kontroler;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.serwis.TypDokumentuSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Klasa TypDokumentuKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/typDokumentu")
@CrossOrigin
public class TypDokumentuKontroler {

    private TypDokumentuSerwisImpl typDokumentuSerwis;

    public TypDokumentuKontroler(TypDokumentuSerwisImpl typDokumentuSerwis) {
        this.typDokumentuSerwis = typDokumentuSerwis;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /{nazwa} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param nazwa Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu String
     * @return ResponseEntity<TypDokumentuDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/{nazwa}")
    public ResponseEntity<TypDokumentuDto> getTypDokumentuByNazwa(@PathVariable(value = "nazwa")String nazwa){
        return ResponseEntity.ok().body(typDokumentuSerwis.getTypDokumentuByNazwa(nazwa));
    }
}
