package com.example.demo.repozytorium;

import com.example.demo.model.Paczka;
import org.springframework.data.repository.CrudRepository;

public interface PaczkaRepozytorium extends CrudRepository<Paczka,Long> {
}
