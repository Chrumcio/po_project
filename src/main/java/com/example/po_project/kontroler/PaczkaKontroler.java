package com.example.po_project.kontroler;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.serwis.PaczkaSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Klasa PaczkaKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/paczka")
@CrossOrigin
public class PaczkaKontroler {

    private PaczkaSerwisImpl paczkaSerwisImpl;

    public PaczkaKontroler(PaczkaSerwisImpl paczkaSerwisImpl) {
        this.paczkaSerwisImpl = paczkaSerwisImpl;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /{name} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param name Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu String
     * @return ResponseEntity<List<PaczkaDto>> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/{name}")
    public ResponseEntity<List<PaczkaDto>> getPaczkaByName(@PathVariable(value = "name")String name){
        return ResponseEntity.ok().body(paczkaSerwisImpl.getPaczkaByName(name));
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /kategoria/{kategoria} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param kategoria Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu String
     * @return ResponseEntity<List<PaczkaDto>> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping("/kategoria/{kategoria}")
    public ResponseEntity<List<PaczkaDto>> getPaczkaByKategoria(@PathVariable(value = "kategoria")String kategoria){
        return ResponseEntity.ok().body(paczkaSerwisImpl.getPaczkaByKategoria(kategoria));
    }
}
