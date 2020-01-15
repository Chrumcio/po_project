package com.example.po_project.kontroler;

import com.example.po_project.dto.UzytkownikDto;
import com.example.po_project.model.Uzytkownik;
import com.example.po_project.serwis.UzytkownikSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uzytkownik")
@CrossOrigin
public class UzytkownikKontroler {

    private UzytkownikSerwisImpl uzytkownikSerwisImpl;
    private ModelMapper modelMapper;

    public UzytkownikKontroler(UzytkownikSerwisImpl uzytkownikSerwisImpl,ModelMapper modelMapper) {
        this.uzytkownikSerwisImpl = uzytkownikSerwisImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/kontoid/{id}")
    public UzytkownikDto findUzytkownikByKontoId(@PathVariable(value = "id") Long id){
        return convertToDto(uzytkownikSerwisImpl.findUzytkownikByKontoId(id));
    }

    private UzytkownikDto convertToDto(Uzytkownik uzytkownik){
        return modelMapper.map(uzytkownik,UzytkownikDto.class);
    }
}
