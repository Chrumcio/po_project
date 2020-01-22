package com.example.po_project.kontroler;

import com.example.po_project.dto.DokumentDto;
import com.example.po_project.serwis.DokumentSerwisImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
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
@WebMvcTest(DokumentKontroler.class)
public class DokumentKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private DokumentSerwisImpl dokumentSerwis;

    @Test
    public void addDokumentTest() throws Exception {
        DokumentDto dokumentDto = new DokumentDto();
        dokumentDto.setData_wystawienia(1234l);
        String json = objectMapper.writeValueAsString(dokumentDto);
        given(dokumentSerwis.addDokument(dokumentDto)).willReturn(dokumentDto);
        mvc.perform(post("/dokument/dodaj")
        .contentType(MediaType.APPLICATION_JSON)
        .content(json)
        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getDokumentFoundTest() throws Exception {
        DokumentDto dokumentDto = new DokumentDto();
        dokumentDto.setData_wystawienia(1234l);
        given(dokumentSerwis.getDokumentById(1l)).willReturn(dokumentDto);
        mvc.perform(get("/dokument/{id}",1l)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data_wystawienia").value(dokumentDto.getData_wystawienia()));
    }
}
