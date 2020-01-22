package com.example.po_project.serwis;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.model.Klient;
import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KontoRepozytorium;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KontoSerwisImplTest {

    @Autowired
    private KontoSerwisImpl kontoSerwis;

    @MockBean
    private KontoRepozytorium kontoRepozytorium;

    @Before
    public void setUp(){
        Konto konto = new Konto();
        konto.setId(3l);
        konto.setLogin("login");
        konto.setHaslo("haslo");
        Mockito.when(kontoRepozytorium.findByLogin("login")).thenReturn(konto);
    }

    @Test
    public void getKontoByLoginFoundTest(){
        String login = "login";
        String haslo = "haslo";
        KontoDto found = kontoSerwis.getKontoByLogin(login,haslo);
        assertThat(found.getHaslo()).isEqualTo(haslo);
    }

    @Test
    public void getKontoByLoginNotFoundTest(){
        String login = "exampleLogin";
        String haslo = "exampleHaslo";
        KontoDto notFound = kontoSerwis.getKontoByLogin(login,haslo);
        assertThat(notFound).isNull();
    }
}
