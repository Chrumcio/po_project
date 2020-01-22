package com.example.po_project.serwis;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.model.TypDokumentu;
import com.example.po_project.repozytorium.TypDokumentuRepozytorium;
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
public class TypDokumentuSerwisImplTest {

    @Autowired
    private TypDokumentuSerwisImpl typDokumentuSerwis;

    @MockBean
    private TypDokumentuRepozytorium typDokumentuRepozytorium;

    @Before
    public void setUp(){
        TypDokumentu typDokumentuDto = new TypDokumentu();
        typDokumentuDto.setNazwa("nazwa");
        Mockito.when(typDokumentuRepozytorium.getTypDokumentuByNazwa("nazwa")).thenReturn(typDokumentuDto);
    }

    @Test
    public void getTypDokumentuByNazwaFoundTest(){
        TypDokumentuDto typDokumentuDto = new TypDokumentuDto();
        typDokumentuDto.setNazwa("nazwa");
        assertThat(typDokumentuSerwis.getTypDokumentuByNazwa("nazwa").getNazwa()).isEqualTo(typDokumentuDto.getNazwa());
    }

    @Test
    public void getTypDokumentuByNazwaNotFoundTest(){
        Mockito.when(typDokumentuRepozytorium.getTypDokumentuByNazwa("nazwa")).thenReturn(null);
        assertThat(typDokumentuSerwis.getTypDokumentuByNazwa("nazwa")).isNull();
    }
}
