package com.example.demo.repozytorium;

import com.example.demo.model.Konto;
import org.springframework.data.repository.CrudRepository;

public interface KontoRepozytorium extends CrudRepository<Konto,Long> {
}
