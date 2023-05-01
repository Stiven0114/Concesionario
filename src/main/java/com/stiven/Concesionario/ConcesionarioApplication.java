package com.stiven.Concesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcesionarioApplication.class, args);
		System.out.println("Entro al Spring");
	}

}
