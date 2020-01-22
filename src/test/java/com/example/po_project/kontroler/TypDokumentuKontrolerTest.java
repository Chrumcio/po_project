package com.example.po_project.kontroler;

import com.example.po_project.dto.TypDokumentuDto;
import com.example.po_project.serwis.TypDokumentuSerwisImpl;
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
@WebMvcTest(TypDokumentuKontroler.class)
public class TypDokumentuKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TypDokumentuSerwisImpl typDokumentuSerwis;

    @Test
    public void getTypDokumentuByNazwa() throws Exception {
        TypDokumentuDto typDokumentuDto = new TypDokumentuDto();
        typDokumentuDto.setNazwa("nazwa");
        typDokumentuDto.setId(1l);
        given(typDokumentuSerwis.getTypDokumentuByNazwa("nazwa")).willReturn(typDokumentuDto);
        mvc.perform(get("/typDokumentu/{nazwa}","nazwa")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nazwa").value(typDokumentuDto.getNazwa()));
    }
}
