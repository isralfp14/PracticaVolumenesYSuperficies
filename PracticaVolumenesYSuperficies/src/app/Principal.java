package app;

import clases.Cilindro;
import clases.Cubo;

public class Principal {

	public static void main(String[] args) {
		
		int random = (int) (Math.random()*(10-1) + 1);
		
		System.out.print("El numero aleatorio es: " + random + "\n");
		
		//Cubo
		Cubo c1 = new Cubo(random);
		Cubo c2  = new Cubo(random);
		System.out.print("------CUBO-----" + "\n");
		System.out.print("Superficie 1: " + c1.superficie() + "\n");
		System.out.print("Superficie 2: " + c2.superficie() + "\n");
		System.out.print("Volumen 1: " + c1.volumen() + "\n");
		System.out.print("Volumen 2: " + c2.volumen() + "\n");
		System.out.print("==========================" + "\n");
		
		// Cilindro
		Cilindro cili1 = new Cilindro(random, random);
		Cilindro cili2 = new Cilindro(random, random);
		System.out.print("------CILINDRO-----" + "\n");
		System.out.print("Superficie 1: " + cili1.superficie() + "\n");
		System.out.print("Superficie 2: " + cili2.superficie() + "\n");
		System.out.print("Volumen 1: " + cili1.volumen() + "\n");
		System.out.print("Volumen 2: " + cili2.volumen() + "\n");
		System.out.print("==========================");

	}

}
