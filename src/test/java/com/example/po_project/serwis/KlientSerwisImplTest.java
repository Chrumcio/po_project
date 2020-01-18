package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.model.Klient;
import com.example.po_project.model.Konto;
import com.example.po_project.repozytorium.KlientRepozytorium;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KlientSerwisImplTest {

    @Autowired
    private KlientSerwisImpl klientSerwis;

    @MockBean
    private KlientRepozytorium klientRepozytorium;

    @Before
    public void setUp(){
        Klient klient = new Klient();
        klient.setId(1l);
        klient.setImie("Jan");
        Mockito.when(klientRepozytorium.findKlientByKontoid(1l)).thenReturn(klient);
    }

    @Test
    public void getKlientByKontoIdTest(){
        Long id = 1l;
        String name = "Jan";
        KlientDto found = klientSerwis.getKlientByKontoId(id);

        assertThat(found.getImie()).isEqualTo(name);
    }

}
