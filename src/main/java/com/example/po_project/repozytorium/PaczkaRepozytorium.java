package com.example.po_project.repozytorium;

import com.example.po_project.model.Paczka;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaczkaRepozytorium extends JpaRepository<Paczka,Long> {
    List<Paczka> findByNazwa(String name);
    List<Paczka> findByKategoria(String kategoria);
}
