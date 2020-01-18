package com.example.po_project.dto;

/**
 * Klasa PaczkaDto jest klasą, która upraszcza klasę Paczka.
 * Obiekty tej klasy są wykorzystywane do komunikacji z aplikacją
 * frontend-ową. Upraszczają model i przesyłane dane są tylko te,
 * które chcemy pokazać użytkownikowi, reszta danych zaś jest ukrywana
 * przed użytkownikiem.
 */
public class PaczkaDto {

    private Long id;
    private String kategoria;
    private MiejsceMagazynoweDto miejsce_magazynowe_id;
    private String nazwa;
    private Long kod_kreskowy;

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu id
     * @return Long Metoda zwraca id danej paczki
     */
    public Long getId() {
        return id;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param id Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kategoria
     * @return Long Metoda zwraca kategorie danej paczki
     */
    public String getKategoria() {
        return kategoria;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kategoria Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu miejsce_magazynowe_id
     * @return MiejsceMagazynoweDto Metoda zwraca obiekt MiejsceMagazynoweDto dla danej paczki
     */
    public MiejsceMagazynoweDto getMiejsce_magazynowe_id() {
        return miejsce_magazynowe_id;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param miejsce_magazynowe_id Jedyny argument przekazywany do tej metody, jest typu MiejsceMagazynoweDto
     */
    public void setMiejsce_magazynowe_id(MiejsceMagazynoweDto miejsce_magazynowe_id) {
        this.miejsce_magazynowe_id = miejsce_magazynowe_id;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu nazwa
     * @return String Metoda zwraca nazwe dla danej paczki
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param nazwa Jedyny argument przekazywany do tej metody, jest typu String
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * Metoda umożliwiająca uzyskanie wartości w polu kod_kreskowy
     * @return Long Metoda zwraca kod kreskowy dla danej paczki
     */
    public Long getKod_kreskowy() {
        return kod_kreskowy;
    }

    /**
     * Metoda umożliwia ustawienie wartości pola klasy
     * @param kod_kreskowy Jedyny argument przekazywany do tej metody, jest typu Long
     */
    public void setKod_kreskowy(Long kod_kreskowy) {
        this.kod_kreskowy = kod_kreskowy;
    }

    /**
     * Metoda toString zwraca reprezentacje biektu w postaci Stringa
     * @return String Zwraca tekstową reprezentację obiektu
     */
    @Override
    public String toString() {
        return "PaczkaDto{" +
                "id=" + id +
                ", kategoria='" + kategoria + '\'' +
                ", miejsce_magazynowe_id=" + miejsce_magazynowe_id +
                ", nazwa='" + nazwa + '\'' +
                ", kod_kreskowy=" + kod_kreskowy +
                '}';
    }
}
