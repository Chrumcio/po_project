package com.example.po_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PoProjectApplication to klasa uruchomieniowa cały program, zawiera tylko metodę main
 *
 * @author Mateusz Koza
 * @version 1.0
 */

@SpringBootApplication
public class PoProjectApplication {

	/**
	 * Metoda main uruchamia działanie aplikacji napisanej w Spring Boot
	 * @param args
	 * @return Brak.
	 */
	public static void main(String[] args) {
		SpringApplication.run(PoProjectApplication.class, args);
	}

}
