package com.example.po_project.repozytorium;

import com.example.po_project.model.Klient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * KlientRepozytorium jest to interfejs, który rozszerza JpaRepository,
 * które umożliwia podstawowe operacje związane z działaniem na bazie danych.
 * Umożliwia operacje CRUD. Nie posiada żadnych nowych metod, gdyż operacje CRUD
 * są wystarczające do działania programu
 */
public interface KlientRepozytorium extends JpaRepository<Klient,Long> {
}
