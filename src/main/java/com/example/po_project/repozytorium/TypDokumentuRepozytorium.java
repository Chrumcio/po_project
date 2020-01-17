package com.example.po_project.repozytorium;

import com.example.po_project.model.TypDokumentu;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypDokumentuRepozytorium extends JpaRepository<TypDokumentu,Long> {
    @Query("SELECT * FROM typdokumentu WHERE nazwa=:nazwa")
    TypDokumentu getTypDokumentuByNazwa(String nazwa);
}
