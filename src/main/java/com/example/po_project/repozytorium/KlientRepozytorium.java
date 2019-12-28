package com.example.po_project.repozytorium;

import com.example.po_project.model.Klient;
import org.springframework.data.repository.CrudRepository;

public interface KlientRepozytorium extends CrudRepository<Klient,Long> {
}
