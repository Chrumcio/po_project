package com.example.po_project.kontroler;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.serwis.TypKontaSerwisImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typkonta")
@CrossOrigin
public class TypKontaKontroler {

    private TypKontaSerwisImpl typKontaSerwisImpl;

    public TypKontaKontroler(TypKontaSerwisImpl typKontaSerwisImpl) {
        this.typKontaSerwisImpl = typKontaSerwisImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypKontaDto> getTypKontaById(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok().body(typKontaSerwisImpl.getTypKontaById(id));
    }
}
