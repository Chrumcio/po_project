package com.example.po_project.repozytorium;

import com.example.po_project.model.Konto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepozytorium extends JpaRepository<Konto,Long> {
    Konto findByLogin(String login);
}
