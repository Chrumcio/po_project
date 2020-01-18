package com.example.po_project.serwis;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.model.Klient;
import com.example.po_project.repozytorium.KlientRepozytorium;
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
    public void getKlientByKontoIdFoundTest(){
        Long id = 1l;
        String name = "Jan";
        KlientDto found = klientSerwis.getKlientByKontoId(id);

        assertThat(found.getImie()).isEqualTo(name);
    }

    @Test
    public void getKlientByKontoIdNotFoundTest(){
        Long id = 342424234l;
        String name = "Klient";
        KlientDto notFound = klientSerwis.getKlientByKontoId(id);

        assertThat(notFound).isNull();
    }

}
