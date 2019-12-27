package com.example.demo.repozytorium;

import com.example.demo.model.Transakcja;
import org.springframework.data.repository.CrudRepository;

public interface TransakcjaRepozytorium extends CrudRepository<Transakcja,Long> {
}
