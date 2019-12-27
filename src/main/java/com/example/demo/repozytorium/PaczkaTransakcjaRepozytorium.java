package com.example.demo.repozytorium;

import com.example.demo.model.PaczkaTransakcja;
import org.springframework.data.repository.CrudRepository;

public interface PaczkaTransakcjaRepozytorium extends CrudRepository<PaczkaTransakcja,Long> {
}
