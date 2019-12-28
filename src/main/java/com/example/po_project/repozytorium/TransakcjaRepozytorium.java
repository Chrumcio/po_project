package com.example.po_project.repozytorium;

import com.example.po_project.model.Transakcja;
import org.springframework.data.repository.CrudRepository;

public interface TransakcjaRepozytorium extends CrudRepository<Transakcja,Long> {
}
