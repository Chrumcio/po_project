package com.example.demo.repozytorium;

import com.example.demo.model.Dokument;
import org.springframework.data.repository.CrudRepository;

public interface DokumentRepozytorium extends CrudRepository<Dokument,Long> {
}
