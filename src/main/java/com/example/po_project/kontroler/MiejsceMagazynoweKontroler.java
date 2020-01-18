package com.example.po_project.kontroler;

import com.example.po_project.dto.MiejsceMagazynoweDto;
import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.serwis.MiejsceMagazynoweSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa MiejsceMagazynoweKontroler jest klasą kontrolera z
 * adnotacjami: @RestController, @RequestMapping, @CrossOrigin
 * Pierwsza adnotacja jest wymagana i jest specjalistyczną wersją kontrolera
 * Druga adnotacja jest adnotacją ustawiającą ścieżkę ogólną do kontrolera,
 * aby odwoływać się do kontrolera w przeglądarce wpisując odpowiedni adres
 * Trzecia adnitacja jest adnotacja zezwalająca na żądania krzyżowe dotyczące
 * określonych klas procedur obsługi i / lub metod procedur obsługi.
 */
@RestController
@RequestMapping("/miejsceMagazynowe")
@CrossOrigin
public class MiejsceMagazynoweKontroler {

    private MiejsceMagazynoweSerwisImpl miejsceMagazynoweSerwisImpl;

    public MiejsceMagazynoweKontroler(MiejsceMagazynoweSerwisImpl miejsceMagazynoweSerwisImpl,ModelMapper modelMapper) {
        this.miejsceMagazynoweSerwisImpl = miejsceMagazynoweSerwisImpl;
    }

    /**
     * Metoda opatrzona adnotacją @GetMapping oznaczającą, że
     * jest obsługiwane pod podanym adresem /all GET, który
     * pobiera dane z serwisu i wysyła je pod wskazany adres.
     * @return List<MiejsceMagazynoweDto> Lista wszystkich dostępnych
     * miejsc magazynowych
     */
    @GetMapping("/all")
    public List<MiejsceMagazynoweDto> getAllMiejsceMagazynowe(){
        return miejsceMagazynoweSerwisImpl.getAllMiejsceMagazynowe();
    }
}
