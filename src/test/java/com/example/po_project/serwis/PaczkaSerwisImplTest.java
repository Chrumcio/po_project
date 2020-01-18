package com.example.po_project.serwis;

import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaczkaSerwisImplTest {

    @Autowired
    private PaczkaSerwisImpl paczkaSerwis;

    @MockBean
    private PaczkaRepozytorium repozytorium;

    @Before
    public void setUp(){
        Paczka paczka = new Paczka();
    }
}
