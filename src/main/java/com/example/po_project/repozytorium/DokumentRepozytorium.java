package com.example.po_project.repozytorium;

import com.example.po_project.model.Dokument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DokumentRepozytorium extends JpaRepository<Dokument,Long> {
}
