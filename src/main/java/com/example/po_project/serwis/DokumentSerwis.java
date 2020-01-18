package com.example.po_project.serwis;

import com.example.po_project.dto.DokumentDto;

public interface DokumentSerwis {
    DokumentDto addDokument(DokumentDto dokumentDto);
    DokumentDto getDokumentById(Long id);
}
