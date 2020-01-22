package com.example.po_project.repozytorium;

import com.example.po_project.model.Paczka;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * PaczkaRepozytorium jest to interfejs, który rozszerza JpaRepository,
 * które umożliwia podstawowe operacje związane z działaniem na bazie danych.
 * Umożliwia operacje CRUD. Nie posiada żadnych nowych metod, gdyż operacje CRUD
 * są wystarczające do działania programu
 */
public interface PaczkaRepozytorium extends JpaRepository<Paczka,Long> {
    List<Paczka> findByNazwa(String name);
    List<Paczka> findByKategoria(String kategoria);
}
