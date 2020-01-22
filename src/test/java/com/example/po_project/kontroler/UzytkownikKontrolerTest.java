package com.example.po_project.kontroler;

import com.example.po_project.dto.UzytkownikDto;
import com.example.po_project.serwis.UzytkownikSerwisImpl;
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
@WebMvcTest(UzytkownikKontroler.class)
public class UzytkownikKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UzytkownikSerwisImpl uzytkownikSerwis;

    @Test
    public void findUzytkownikByKontoId() throws Exception {
        UzytkownikDto uzytkownikDto = new UzytkownikDto();
        uzytkownikDto.setId(1l);
        uzytkownikDto.setImie("imie");
        uzytkownikDto.setNazwisko("nazwisko");
        given(uzytkownikSerwis.findUzytkownikById(1l)).willReturn(uzytkownikDto);
        mvc.perform(get("/uzytkownik/id/{id}",1l)
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.imie").value(uzytkownikDto.getImie()))
                .andExpect(jsonPath("$.nazwisko").value(uzytkownikDto.getNazwisko()));
    }
}
