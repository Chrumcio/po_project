package com.example.po_project.repozytorium;

import com.example.po_project.model.Konto;
import org.springframework.data.repository.CrudRepository;

public interface KontoRepozytorium extends CrudRepository<Konto,Long> {
}
