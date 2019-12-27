package com.example.demo.repozytorium;

import com.example.demo.model.Magazyn;
import org.springframework.data.repository.CrudRepository;

public interface MagazynRepozytorium extends CrudRepository<Magazyn,Long> {
}
