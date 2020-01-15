package com.example.po_project.kontroler;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.model.Klient;
import com.example.po_project.serwis.KlientSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/klient")
@CrossOrigin
public class KlientKontroler {

    private KlientSerwisImpl klientSerwisImpl;
    private ModelMapper modelMapper;

    public KlientKontroler(KlientSerwisImpl klientSerwisImpl, ModelMapper modelMapper) {
        this.klientSerwisImpl = klientSerwisImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/kontoid/{id}")
    public KlientDto getKlientByKontoId(@PathVariable(value = "id")Long id){
        return convertToDto(klientSerwisImpl.getKlientByKontoId(id));
    }

    private KlientDto convertToDto(Klient klient){
        KlientDto klientDto = modelMapper.map(klient,KlientDto.class);
        return klientDto;
    }
}
