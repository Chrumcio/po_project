package com.example.po_project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

/**
 * Klasa konfiguracyjna, w której odbywa się konfigurowanie Bean-ów
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * Metoda jest używana do stworzenia Bean-a typu ModelMapper
     * nie przyjmuje argumentów
     * @return ModelMapper zwraca nowy obiekt klasy ModelMapper
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
