package com.example.po_project.repozytorium;

import com.example.po_project.model.TypKonta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypKontaRepozytorium extends JpaRepository<TypKonta,Long> {
    TypKonta findByid(Long id);
}
