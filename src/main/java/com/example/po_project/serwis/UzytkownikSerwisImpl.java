package com.example.po_project.serwis;

        import com.example.po_project.dto.UzytkownikDto;
        import com.example.po_project.model.Uzytkownik;
        import com.example.po_project.repozytorium.UzytkownikRepozytorium;
        import org.modelmapper.ModelMapper;
        import org.springframework.stereotype.Service;

@Service
public class UzytkownikSerwisImpl implements UzytkownikSerwis{

    private UzytkownikRepozytorium uzytkownikRepozytorium;
    private ModelMapper modelMapper;

    public UzytkownikSerwisImpl(UzytkownikRepozytorium uzytkownikRepozytorium,ModelMapper modelMapper) {
        this.uzytkownikRepozytorium = uzytkownikRepozytorium;
        this.modelMapper = modelMapper;
    }

    public UzytkownikDto findUzytkownikById(Long id){
        Uzytkownik uzytkownik;
        try {
            uzytkownik = uzytkownikRepozytorium.findById(id).get();
        }catch (Exception e){
            return null;
        }
        UzytkownikDto uzytkownikDto = modelMapper.map(uzytkownik,UzytkownikDto.class);
        return uzytkownikDto;
    }
}
