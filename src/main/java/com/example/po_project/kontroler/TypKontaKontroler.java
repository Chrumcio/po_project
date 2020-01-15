package com.example.po_project.kontroler;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.model.TypKonta;
import com.example.po_project.serwis.TypKontaSerwisImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typkonta")
@CrossOrigin
public class TypKontaKontroler {

    private TypKontaSerwisImpl typKontaSerwisImpl;
    private ModelMapper modelMapper;

    public TypKontaKontroler(TypKontaSerwisImpl typKontaSerwisImpl,ModelMapper modelMapper) {
        this.typKontaSerwisImpl = typKontaSerwisImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public TypKontaDto getTypKontaById(@PathVariable(value = "id")Long id){
        return convertToDto(typKontaSerwisImpl.getTypKontaById(id));
    }

    private TypKontaDto convertToDto(TypKonta typKonta){
        return modelMapper.map(typKonta,TypKontaDto.class);
    }
}
