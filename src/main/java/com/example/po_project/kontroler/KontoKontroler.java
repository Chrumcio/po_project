package com.example.po_project.kontroler;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.serwis.KontoSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Klasa KontoKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/konto")
@CrossOrigin
public class KontoKontroler {

    private KontoSerwisImpl kontoSerwisImpl;

    public KontoKontroler(KontoSerwisImpl kontoSerwisImpl) {
        this.kontoSerwisImpl = kontoSerwisImpl;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /{login}/{haslo} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param login Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu String
     * @param haslo Argument przekazywany do wyszukiwania obiektu
     *              po tym kluczu, jest typu String
     * @return ResponseEntity<KontoDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/{login}/{haslo}")
    public ResponseEntity<KontoDto> getKontoByLogin(@PathVariable(value = "login") String login, @PathVariable(value = "haslo")String haslo){
        return ResponseEntity.ok().body(kontoSerwisImpl.getKontoByLogin(login,haslo));
    }
}
