package com.example.po_project.serwis;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.model.Paczka;
import com.example.po_project.repozytorium.PaczkaRepozytorium;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaczkaSerwisImplTest {

    @Autowired
    private PaczkaSerwisImpl paczkaSerwis;

    @MockBean
    private PaczkaRepozytorium repozytorium;

    @Before
    public void setUp(){
        List<Paczka> paczkaList = new ArrayList<>();
        Paczka paczka = new Paczka();
        paczka.setNazwa("paczka");
        paczka.setKategoria("kategoria");
        paczka.setKod_kreskowy(123l);
        paczkaList.add(paczka);
        Mockito.when(repozytorium.findByNazwa("paczka")).thenReturn(paczkaList);
        Mockito.when(repozytorium.findByKategoria("kategoria")).thenReturn(paczkaList);
    }

    @Test
    public void getPaczkaByNameFoundTest(){
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        PaczkaDto paczkaDto = new PaczkaDto();
        paczkaDto.setNazwa("paczka");
        paczkaDto.setKategoria("kategoria");
        paczkaDtoList.add(paczkaDto);

        assertThat(paczkaSerwis.getPaczkaByName("paczka").size()).isEqualTo(paczkaDtoList.size());
        assertThat(paczkaSerwis.getPaczkaByName("paczka").get(0).getNazwa()).isEqualTo(paczkaDto.getNazwa());
        assertThat(paczkaSerwis.getPaczkaByName("paczka").get(0).getKategoria()).isEqualTo(paczkaDto.getKategoria());
    }

    @Test
    public void getPaczkaByNameNotFoundTest(){
        Mockito.when(repozytorium.findByNazwa("paczka")).thenReturn(new ArrayList<>());
        assertThat(paczkaSerwis.getPaczkaByName("paczka")).isEqualTo(new ArrayList<>());
    }

    @Test
    public void getPaczkaByKategoriaFoundTest(){
        List<PaczkaDto> paczkaDtoList = new ArrayList<>();
        PaczkaDto paczkaDto = new PaczkaDto();
        paczkaDto.setNazwa("paczka");
        paczkaDto.setKategoria("kategoria");
        paczkaDtoList.add(paczkaDto);

        assertThat(paczkaSerwis.getPaczkaByKategoria("kategoria").size()).isEqualTo(paczkaDtoList.size());
        assertThat(paczkaSerwis.getPaczkaByKategoria("kategoria").get(0).getNazwa()).isEqualTo(paczkaDto.getNazwa());
        assertThat(paczkaSerwis.getPaczkaByKategoria("kategoria").get(0).getKategoria()).isEqualTo(paczkaDto.getKategoria());
    }

    @Test
    public void getPaczkaByKategoriaNotFoundTest(){
        Mockito.when(repozytorium.findByKategoria("kategoria")).thenReturn(new ArrayList<>());
        assertThat(paczkaSerwis.getPaczkaByKategoria("kategoria")).isEqualTo(new ArrayList<>());
    }
}
