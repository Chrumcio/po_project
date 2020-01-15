package com.example.po_project.kontroler;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.model.Paczka;
import com.example.po_project.serwis.PaczkaSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paczka")
@CrossOrigin
public class PaczkaKontroler {

    private PaczkaSerwisImpl paczkaSerwisImpl;
    private ModelMapper modelMapper;

    public PaczkaKontroler(PaczkaSerwisImpl paczkaSerwisImpl,ModelMapper modelMapper) {
        this.paczkaSerwisImpl = paczkaSerwisImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{name}")
    public List<PaczkaDto> getPaczkaByName(@PathVariable(value = "name")String name){
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for (Paczka paczka : paczkaSerwisImpl.getPaczkaByName(name)) {
            paczkaDtoList.add(convertToDto(paczka));
        }
        return paczkaDtoList;
    }

    @GetMapping("/kategoria/{kategoria}")
    public List<PaczkaDto> getPaczkaByKategoria(@PathVariable(value = "kategoria")String kategoria){
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        for (Paczka paczka : paczkaSerwisImpl.getPaczkaByKategoria(kategoria)) {
            paczkaDtoList.add(convertToDto(paczka));
        }
        return paczkaDtoList;
    }

    private PaczkaDto convertToDto(Paczka paczka){
        return modelMapper.map(paczka,PaczkaDto.class);
    }
}
