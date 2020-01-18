package com.example.po_project.repozytorium;

import com.example.po_project.model.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UzytkownikRepozytorium extends JpaRepository<Uzytkownik,Long> {
    Uzytkownik findUzytkownikByKontoid(Long id);
}
