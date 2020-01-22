package com.example.po_project.kontroler;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.serwis.DokumentSerwisImpl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Klasa DokumentKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/dokument")
@CrossOrigin
public class DokumentKontroler {

    private DokumentSerwisImpl dokumentSerwis;

    public DokumentKontroler(DokumentSerwisImpl dokumentSerwis) {
        this.dokumentSerwis = dokumentSerwis;
    }

    /**
     * Metoda opatrzona adnotacją @PostMapping oznaczającą, że
     * jest obsługiwany pod podanym adresem /dodaj POST, w którym
     * przekazywane są również dane, które następnie są dodane do
     * bazy danych. Metoda wywołuje metodę serwisu addDokument
     * @param dokumentDto Obiekt przekazany z zewnątrz, który ma zostać
     *                    dodany do bazy danych
     * @return ResponseEntity<DokumentDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @PostMapping("/dodaj")
    public ResponseEntity<DokumentDto> addDokument(@RequestBody DokumentDto dokumentDto){
        DokumentDto dto = dokumentSerwis.addDokument(dokumentDto);
        return ResponseEntity.ok().body(dto);
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /{id} GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @param id Argument przekazywany do wyszukiwania obiektu
     *           po tym kluczu, jest typu Long
     * @return ResponseEntity<DokumentDto> Rozszerzenie HttpEntity
     * dodaje do zwracanego typu status kodu
     */
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DokumentDto> getDokument(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok().body(dokumentSerwis.getDokumentById(id));
    }
}
