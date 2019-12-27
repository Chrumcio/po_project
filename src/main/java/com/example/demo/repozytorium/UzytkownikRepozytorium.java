package com.example.demo.repozytorium;

import com.example.demo.model.Uzytkownik;
import org.springframework.data.repository.CrudRepository;

public interface UzytkownikRepozytorium extends CrudRepository<Uzytkownik,Long> {
}
