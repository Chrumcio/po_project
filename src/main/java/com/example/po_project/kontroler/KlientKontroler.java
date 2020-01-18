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

    public KlientKontroler(KlientSerwisImpl klientSerwisImpl) {
        this.klientSerwisImpl = klientSerwisImpl;
    }

    @GetMapping("/kontoid/{id}")
    public KlientDto getKlientByKontoId(@PathVariable(value = "id")Long id){
        return klientSerwisImpl.getKlientByKontoId(id);
    }
}
