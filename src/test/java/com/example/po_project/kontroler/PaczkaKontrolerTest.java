package com.example.po_project.kontroler;

import com.example.po_project.dto.PaczkaDto;
import com.example.po_project.serwis.PaczkaSerwisImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(PaczkaKontroler.class)
public class PaczkaKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PaczkaSerwisImpl paczkaSerwis;

    @Test
    public void getPaczkaByNameNotFoundTest() throws Exception {
        List<PaczkaDto> list = new ArrayList<>();
        PaczkaDto paczkaDto = new PaczkaDto();
        paczkaDto.setNazwa("nazwa");
        paczkaDto.setKategoria("kategoria");
        list.add(paczkaDto);
        given(paczkaSerwis.getPaczkaByName("nazwa")).willReturn(null);
        mvc.perform(get("paczka/{name}","nazwa")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    public void getPaczkaByKategoriaNotFoundTest() throws Exception {
        List<PaczkaDto> list = new ArrayList<>();
        PaczkaDto paczkaDto = new PaczkaDto();
        paczkaDto.setKategoria("kategoria");
        paczkaDto.setNazwa("nazwa");
        list.add(paczkaDto);
        given(paczkaSerwis.getPaczkaByKategoria("kategoria")).willReturn(null);
        mvc.perform(get("paczka/kategoria/{kategoria}","kategoria")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
