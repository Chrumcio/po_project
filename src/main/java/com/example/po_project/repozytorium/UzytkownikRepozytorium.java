package com.example.po_project.repozytorium;

import com.example.po_project.model.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UzytkownikRepozytorium jest to interfejs, który rozszerza JpaRepository,
 * które umożliwia podstawowe operacje związane z działaniem na bazie danych.
 * Umożliwia operacje CRUD. Dodana została metoda findUzytkownikByKontoid, mająca
 * za zadanie wyszukać użytkownika po id konta przypisanego do uzytkownika
 */
public interface UzytkownikRepozytorium extends JpaRepository<Uzytkownik,Long> {
    Uzytkownik findUzytkownikByKontoid(Long id);
}
