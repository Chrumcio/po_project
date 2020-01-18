package com.example.po_project.repozytorium;

import com.example.po_project.model.Klient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlientRepozytorium extends JpaRepository<Klient,Long> {
    Klient findKlientByKontoid(Long id);
}
