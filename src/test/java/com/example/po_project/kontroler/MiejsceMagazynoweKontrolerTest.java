package com.example.po_project.kontroler;
import com.example.po_project.dto.MiejsceMagazynoweDto;
import com.example.po_project.serwis.MiejsceMagazynoweSerwisImpl;
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
@WebMvcTest(MiejsceMagazynoweKontroler.class)
public class MiejsceMagazynoweKontrolerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MiejsceMagazynoweSerwisImpl miejsceMagazynoweSerwis;

    @Test
    public void getAllMiejsceMagazynoweTest() throws Exception {
        List<MiejsceMagazynoweDto> list = new ArrayList<>();
        MiejsceMagazynoweDto miejsceMagazynoweDto = new MiejsceMagazynoweDto();
        miejsceMagazynoweDto.setId(1l);
        miejsceMagazynoweDto.setBlok("blok");
        miejsceMagazynoweDto.setAleja("aleja");
        list.add(miejsceMagazynoweDto);
        given(miejsceMagazynoweSerwis.getAllMiejsceMagazynowe()).willReturn(list);
        mvc.perform(get("/miejsceMagazynowe/all")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].blok").value(miejsceMagazynoweDto.getBlok()))
                .andExpect(jsonPath("$[0].aleja").value(miejsceMagazynoweDto.getAleja()));
    }
}
