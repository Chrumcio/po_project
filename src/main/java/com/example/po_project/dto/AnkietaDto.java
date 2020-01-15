package com.example.po_project.dto;

public class AnkietaDto {
    private String pytanie;
    private String odpowiedz;
    private Long data_wypelnienia;

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public Long getData_wypelnienia() {
        return data_wypelnienia;
    }

    public void setData_wypelnienia(Long data_wypelnienia) {
        this.data_wypelnienia = data_wypelnienia;
    }

    @Override
    public String toString() {
        return "AnkietaDto{" +
                "pytanie='" + pytanie + '\'' +
                ", odpowiedz='" + odpowiedz + '\'' +
                ", data_wypelnienia=" + data_wypelnienia +
                '}';
    }
}
