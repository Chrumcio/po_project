package com.example.po_project.kontroler;

import com.example.po_project.dto.UzytkownikDto;
import com.example.po_project.serwis.UzytkownikSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Klasa UzytkownikKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/uzytkownik")
@CrossOrigin
public class UzytkownikKontroler {

    private UzytkownikSerwisImpl uzytkownikSerwisImpl;

    public UzytkownikKontroler(UzytkownikSerwisImpl uzytkownikSerwisImpl) {
        this.uzytkownikSerwisImpl = uzytkownikSerwisImpl;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /id/{id} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param id Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu Long
     * @return ResponseEntity<UzytkownikDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/id/{id}")
    public ResponseEntity<UzytkownikDto> findUzytkownikByKontoId(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(uzytkownikSerwisImpl.findUzytkownikById(id));
    }
}
