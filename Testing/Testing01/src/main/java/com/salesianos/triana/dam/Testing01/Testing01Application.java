package com.salesianos.triana.dam.Testing01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Testing01Application {

	public static void main(String[] args) {
		SpringApplication.run(Testing01Application.class, args);
	}

	@PostConstruct
	public void initData() {

		Numero n = new Numero();
		Diamante d = new Diamante();


		System.out.println("Cinco numeros aleatorios del 1 al 10: "+n.calcularNumerosAleatorios());

		d.addElement("<");
		d.addElement("<");
		d.addElement(">");
		d.addElement(">");
		d.addElement(">");

		d.imprimirCadena();

		System.out.println("Se han formado: "+d.comprobarNumDiamantes()+" diamantes en total.");
	}

}
