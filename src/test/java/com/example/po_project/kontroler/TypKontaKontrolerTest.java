package com.example.po_project.kontroler;

import com.example.po_project.dto.TypKontaDto;
import com.example.po_project.serwis.TypKontaSerwisImpl;
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
@WebMvcTest(TypKontaKontroler.class)
public class TypKontaKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TypKontaSerwisImpl typKontaSerwis;

    @Test
    public void getTypKontaById() throws Exception {
        TypKontaDto typKontaDto = new TypKontaDto();
        typKontaDto.setId(1l);
        typKontaDto.setNazwa("nazwa");
        given(typKontaSerwis.getTypKontaById(1l)).willReturn(typKontaDto);
        mvc.perform(get("/typkonta/{id}",1l)
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nazwa").value(typKontaDto.getNazwa()));
    }
}
