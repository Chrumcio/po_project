package com.example.po_project.kontroler;

import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.serwis.MiejsceMagazynoweSerwis;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/miejsceMagazynowe")
@CrossOrigin
public class MiejsceMagazynoweKontroler {

    private MiejsceMagazynoweSerwis miejsceMagazynoweSerwis;

    public MiejsceMagazynoweKontroler(MiejsceMagazynoweSerwis miejsceMagazynoweSerwis) {
        this.miejsceMagazynoweSerwis = miejsceMagazynoweSerwis;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MiejsceMagazynowe>> getAllMiejsceMagazynowe(){
        return ResponseEntity.ok(miejsceMagazynoweSerwis.getAllMiejsceMagazynowe());
    }
}
