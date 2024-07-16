package com.bootcamp.aprendiendo_spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@SpringBootApplication
public class AprendiendoSpring2Application {

	public static void main(String[] args) {
		SpringApplication.run(AprendiendoSpring2Application.class, args);
	}

	@GetMapping("/saludo")
	public Persona getSaludo(){

		Saludo saludo = new Saludo("hola", List.of("que más", "qué onda","Bon dia"));
		return new Persona ("Pepe", 36, saludo);
	}

	public record Saludo (String saludo, List<String> saludosAlternos){
	}

	public record Persona ( String nombre, int edad, Saludo saludo){}
}
