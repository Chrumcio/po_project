package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.model.Dokument;
import com.example.po_project.repozytorium.DokumentRepozytorium;
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
    public void addDokumentSuccess(){
        DokumentDto dokumentDto = new DokumentDto();
        dokumentDto.setData_wystawienia(123456789l);
        DokumentDto added = dokumentSerwis.addDokument(dokumentDto);
        assertThat(dokumentDto.getData_wystawienia()).isEqualTo(added.getData_wystawienia());
    }

    @Test
    public void addDokumentNotSuccess(){
        DokumentDto dokumentDto = null;
        DokumentDto added = dokumentSerwis.addDokument(dokumentDto);
        assertThat(added).isNull();
    }

    @Test
    public void getDokumentByIdFoundTest(){
        Long id = 25l;
        Long dataWystawienia = 1579274098475l;
        DokumentDto found = dokumentSerwis.getDokumentById(id);
        assertThat(found.getData_wystawienia()).isEqualTo(dataWystawienia);
    }

    @Test
    public void getDokumentByIdNotFoundTest(){
        Long id = 21312312312l;
        DokumentDto notFound = dokumentSerwis.getDokumentById(id);
        assertThat(notFound).isNull();
    }
}
