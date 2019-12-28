package com.example.po_project.repozytorium;

import com.example.po_project.model.Uzytkownik;
import org.springframework.data.repository.CrudRepository;

public interface UzytkownikRepozytorium extends CrudRepository<Uzytkownik,Long> {
}
