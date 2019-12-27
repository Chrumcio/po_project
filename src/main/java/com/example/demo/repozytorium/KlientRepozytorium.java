package com.example.demo.repozytorium;

import com.example.demo.model.Klient;
import org.springframework.data.repository.CrudRepository;

public interface KlientRepozytorium extends CrudRepository<Klient,Long> {
}
