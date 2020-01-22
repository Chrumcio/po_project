package com.example.po_project.serwis;

import com.example.po_project.model.TypKonta;
import com.example.po_project.repozytorium.TypKontaRepozytorium;
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
public class TypKontaSerwisImplTest {

    @Autowired
    private TypKontaSerwisImpl typKontaSerwis;

    @MockBean
    private TypKontaRepozytorium typKontaRepozytorium;

    @Test
    public void getTypKontaByIdFoundTest(){
        TypKonta typKonta = new TypKonta();
        typKonta.setNazwa("nazwa");
        typKonta.setId(1l);
        Mockito.when(typKontaRepozytorium.findById(1l)).thenReturn(java.util.Optional.of(typKonta));

        assertThat(typKontaSerwis.getTypKontaById(1l).getNazwa()).isEqualTo(typKonta.getNazwa());
    }

    @Test
    public void getTypKontaByIdNotFoundTest(){
        Mockito.when(typKontaRepozytorium.findById(1l)).thenReturn(null);
        assertThat(typKontaSerwis.getTypKontaById(1l)).isNull();
    }
}
