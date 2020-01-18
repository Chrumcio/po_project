package com.example.po_project.repozytorium;

import com.example.po_project.model.Klient;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface KlientRepozytorium extends JpaRepository<Klient,Long> {
//    @Query("SELECT * FROM klient WHERE kontoid=:id")
    Klient findKlientByKontoid(Long id);
}
