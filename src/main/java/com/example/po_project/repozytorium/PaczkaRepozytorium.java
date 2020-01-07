package com.example.po_project.repozytorium;

import com.example.po_project.model.Paczka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaczkaRepozytorium extends JpaRepository<Paczka,Long> {
    Paczka findByName(String name);
}
