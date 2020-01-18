package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.model.Dokument;
import com.example.po_project.model.Klient;
import com.example.po_project.repozytorium.DokumentRepozytorium;
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
public class DokumentSerwisImplTest {

    @Autowired
    private DokumentSerwisImpl dokumentSerwis;

    @MockBean
    private DokumentRepozytorium dokumentRepozytorium;

    @Before
    public void setUp(){
        Dokument dokument = new Dokument();
        dokument.setId(25l);
        dokument.setData_wystawienia(1579274098475l);
        Mockito.when(dokumentRepozytorium.findById(25l)).thenReturn(java.util.Optional.of(dokument));
    }

    @Test
    public void getDokumentTest(){
        Long id = 25l;
        Long dataWystawienia = 1579274098475l;
        DokumentDto found = dokumentSerwis.getDokument(id);
        assertThat(found.getData_wystawienia()).isEqualTo(dataWystawienia);
    }

    //Not working yet
//    @Test
//    public void addDokumentTest(){
//        Long dataWystawienia = 1579274098477l;
//        DokumentDto dokumentDto = new DokumentDto();
//        dokumentDto.setData_wystawienia(1579274098477l);
//
//        Dokument dokument = new Dokument();
//        dokumentSerwis.addDokument(dokumentDto);
//        List<Dokument> dokumentList = new ArrayList<>();
//        dokumentList = dokumentRepozytorium.findAll();
//        for(int i = 0; i < dokumentList.size(); i++){
//            if(dokumentList.get(i).getData_wystawienia() == dataWystawienia){
//                dokument = dokumentList.get(i);
//            }
//        }
//        assertThat(dokument.getData_wystawienia()).isEqualTo(dataWystawienia);
//    }
}
