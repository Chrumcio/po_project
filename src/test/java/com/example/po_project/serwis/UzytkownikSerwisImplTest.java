package com.example.po_project.serwis;

import com.example.po_project.model.Uzytkownik;
import com.example.po_project.repozytorium.UzytkownikRepozytorium;
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
public class UzytkownikSerwisImplTest {

    @Autowired
    private UzytkownikSerwisImpl uzytkownikSerwis;

    @MockBean
    private UzytkownikRepozytorium uzytkownikRepozytorium;

    @Test
    public void findUzytkownikByKontoIdFoundTest(){
        Uzytkownik uzytkownik = new Uzytkownik();
        uzytkownik.setNazwisko("nazwisko");
        uzytkownik.setImie("imie");
        Mockito.when(uzytkownikRepozytorium.findById(1l).get()).thenReturn(uzytkownik);

        assertThat(uzytkownikSerwis.findUzytkownikById(1l).getImie()).isEqualTo(uzytkownik.getImie());
        assertThat(uzytkownikSerwis.findUzytkownikById(1l).getNazwisko()).isEqualTo(uzytkownik.getNazwisko());
    }

    @Test
    public void findUzytkownikByKontoIdNotFoundTest(){
        Mockito.when(uzytkownikRepozytorium.findById(1l)).thenReturn(null);

        assertThat(uzytkownikSerwis.findUzytkownikById(1l)).isNull();
    }
}
