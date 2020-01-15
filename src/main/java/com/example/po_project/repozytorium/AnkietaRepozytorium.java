package com.example.po_project.repozytorium;

import com.example.po_project.model.Ankieta;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnkietaRepozytorium extends JpaRepository<Ankieta,Long> {
    @Query("SELECT * FROM ankieta WHERE id=:id")
    Ankieta findAnkietaById(Long id);

}
