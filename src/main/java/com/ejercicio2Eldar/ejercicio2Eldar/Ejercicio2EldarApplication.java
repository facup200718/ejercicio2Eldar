package com.ejercicio2Eldar.ejercicio2Eldar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class Ejercicio2EldarApplication {

	public static void main( String[] args ) {
		SpringApplication.run(Ejercicio2EldarApplication.class, args);
	}
}

