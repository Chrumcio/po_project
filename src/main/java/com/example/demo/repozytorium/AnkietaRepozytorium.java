package com.example.demo.repozytorium;

import com.example.demo.model.Ankieta;
import org.springframework.data.repository.CrudRepository;

public interface AnkietaRepozytorium extends CrudRepository<Ankieta,Long> {
}
