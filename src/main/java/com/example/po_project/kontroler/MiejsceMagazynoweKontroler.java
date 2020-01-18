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

@RestController
@RequestMapping("/miejsceMagazynowe")
@CrossOrigin
public class MiejsceMagazynoweKontroler {

    private MiejsceMagazynoweSerwisImpl miejsceMagazynoweSerwisImpl;

    public MiejsceMagazynoweKontroler(MiejsceMagazynoweSerwisImpl miejsceMagazynoweSerwisImpl,ModelMapper modelMapper) {
        this.miejsceMagazynoweSerwisImpl = miejsceMagazynoweSerwisImpl;
    }

    @GetMapping("/all")
    public List<MiejsceMagazynoweDto> getAllMiejsceMagazynowe(){
        return miejsceMagazynoweSerwisImpl.getAllMiejsceMagazynowe();
    }
}
