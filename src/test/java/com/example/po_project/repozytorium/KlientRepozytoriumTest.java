package com.example.po_project.repozytorium;

import com.example.po_project.model.Klient;
import com.example.po_project.serwis.KlientSerwis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class KlientRepozytoriumTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private KlientRepozytorium klientRepozytorium;

}
