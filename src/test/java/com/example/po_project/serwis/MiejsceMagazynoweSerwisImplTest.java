package com.example.po_project.serwis;

import com.example.po_project.dto.MiejsceMagazynoweDto;
import com.example.po_project.model.MiejsceMagazynowe;
import com.example.po_project.repozytorium.MiejsceMagazynoweRepozytorium;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiejsceMagazynoweSerwisImplTest {

    @Autowired
    private MiejsceMagazynoweSerwis miejsceMagazynoweSerwis;

    @MockBean
    private MiejsceMagazynoweRepozytorium repozytorium;

    @Before
    public void setUp(){
        List<MiejsceMagazynowe> miejsceMagazynoweList = new ArrayList<>();
        MiejsceMagazynowe miejsceMagazynowe = new MiejsceMagazynowe();
        miejsceMagazynowe.setAleja("aleja1");
        miejsceMagazynowe.setBlok("blok1");
        miejsceMagazynoweList.add(miejsceMagazynowe);
        Mockito.when(repozytorium.findAll()).thenReturn(miejsceMagazynoweList);
    }

    @Test
    public void getAllMiejsceMagazynoweFoundTest(){
        List<MiejsceMagazynoweDto> miejsceMagazynoweDtoList = new ArrayList<>();
        MiejsceMagazynoweDto miejsceMagazynoweDto = new MiejsceMagazynoweDto();
        miejsceMagazynoweDto.setAleja("aleja1");
        miejsceMagazynoweDto.setBlok("blok1");
        miejsceMagazynoweDtoList.add(miejsceMagazynoweDto);
        List<MiejsceMagazynoweDto>miejsceMagazynoweDtoFound = miejsceMagazynoweSerwis.getAllMiejsceMagazynowe();

        assertThat(miejsceMagazynoweDtoFound.size()).isEqualTo(miejsceMagazynoweDtoList.size());
        assertThat(miejsceMagazynoweDtoFound.get(0).getAleja()).isEqualTo(miejsceMagazynoweDto.getAleja());
        assertThat(miejsceMagazynoweDtoFound.get(0).getBlok()).isEqualTo(miejsceMagazynoweDto.getBlok());
    }

    @Test
    public void getAllMiejsceMagazynoweNotFoundTest(){
        Mockito.when(repozytorium.findAll()).thenReturn(new ArrayList<>());

        List<MiejsceMagazynoweDto> miejsceMagazynoweDtoList = new ArrayList<>();
        MiejsceMagazynoweDto miejsceMagazynoweDto = new MiejsceMagazynoweDto();
        miejsceMagazynoweDto.setAleja("aleja1");
        miejsceMagazynoweDto.setBlok("blok1");
        miejsceMagazynoweDtoList.add(miejsceMagazynoweDto);
        List<MiejsceMagazynoweDto> miejsceMagazynoweDtoFound = miejsceMagazynoweSerwis.getAllMiejsceMagazynowe();

        assertThat(miejsceMagazynoweDtoFound).isEmpty();
    }
}
