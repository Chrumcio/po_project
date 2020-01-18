package com.example.po_project.repozytorium;

import com.example.po_project.model.TypDokumentu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypDokumentuRepozytorium extends JpaRepository<TypDokumentu,Long> {
    TypDokumentu getTypDokumentuByNazwa(String nazwa);
}
