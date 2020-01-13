package com.example.po_project.kontroler;

import com.example.po_project.model.TypKonta;
import com.example.po_project.serwis.TypKontaSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typkonta")
@CrossOrigin
public class TypKontaKontroler {

    private TypKontaSerwis typKontaSerwis;

    public TypKontaKontroler(TypKontaSerwis typKontaSerwis) {
        this.typKontaSerwis = typKontaSerwis;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypKonta> getTypKontaById(@PathVariable(value = "id")Long id){
        return ResponseEntity.ok(typKontaSerwis.getTypKontaById(id));
    }
}
