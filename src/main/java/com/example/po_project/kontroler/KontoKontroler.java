package com.example.po_project.kontroler;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.model.Konto;
import com.example.po_project.serwis.KontoSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/konto")
@CrossOrigin
public class KontoKontroler {

    private KontoSerwisImpl kontoSerwisImpl;
    private ModelMapper modelMapper;

    public KontoKontroler(KontoSerwisImpl kontoSerwisImpl,ModelMapper modelMapper) {
        this.kontoSerwisImpl = kontoSerwisImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{login}/{haslo}")
    public KontoDto getKontoByLogin(@PathVariable(value = "login") String login,@PathVariable(value = "haslo")String haslo){
        return convertToDto(kontoSerwisImpl.getKontoByLogin(login,haslo));
    }

    private KontoDto convertToDto(Konto konto){
        return modelMapper.map(konto,KontoDto.class);
    }
}
