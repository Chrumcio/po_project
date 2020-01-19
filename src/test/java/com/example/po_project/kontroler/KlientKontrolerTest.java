package com.example.po_project.kontroler;

import com.example.po_project.dto.KlientDto;
import com.example.po_project.serwis.KlientSerwisImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(KlientKontroler.class)
public class KlientKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private KlientSerwisImpl klientSerwis;

    @Test
    public void getKlientByKontoIdTest() throws Exception {
        KlientDto klientDto = new KlientDto();
        klientDto.setImie("imie");
        klientDto.setNazwisko("nazwisko");
        klientDto.setId(1l);
        given(klientSerwis.getKlientById(1l)).willReturn(klientDto);
        mvc.perform(get("/klient/id/{id}",1l)
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.imie").value(klientDto.getImie()))
                .andExpect(jsonPath("$.nazwisko").value(klientDto.getNazwisko()));
    }

}
