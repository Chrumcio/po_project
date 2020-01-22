package com.example.po_project.kontroler;

import com.example.po_project.dto.KontoDto;
import com.example.po_project.serwis.KontoSerwisImpl;
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
@WebMvcTest(KontoKontroler.class)
public class KontoKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private KontoSerwisImpl kontoSerwis;

    @Test
    public void getKontoByLogin() throws Exception {
        KontoDto kontoDto = new KontoDto();
        String login = "login";
        String haslo = "haslo";
        kontoDto.setLogin(login);
        kontoDto.setHaslo(haslo);
        kontoDto.setId(1l);
        given(kontoSerwis.getKontoByLogin(login,haslo)).willReturn(kontoDto);
        mvc.perform(get("/konto/{login}/{haslo}",login,haslo)
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.login").value(kontoDto.getLogin()))
                .andExpect(jsonPath("$.haslo").value(kontoDto.getHaslo()));
    }
}
