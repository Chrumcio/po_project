package com.example.po_project.repozytorium;

import com.example.po_project.model.Dokument;
import org.springframework.data.repository.CrudRepository;

public interface DokumentRepozytorium extends CrudRepository<Dokument,Long> {
}
