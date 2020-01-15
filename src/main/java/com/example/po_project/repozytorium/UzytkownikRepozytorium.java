package com.example.po_project.repozytorium;

import com.example.po_project.model.Uzytkownik;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UzytkownikRepozytorium extends JpaRepository<Uzytkownik,Long> {
    @Query("SELECT * FROM uzytkownik WHERE kontoid:=id")
    Uzytkownik findUzytkownikByKontoid(@Param("id") Long id);
}
