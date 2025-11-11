package ejercicios.ejerciciosFor.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * Implementa la aplicación Película, que pide al usuario un número y muestra en pantalla la salida: 
		 * ¿Hoy vamos a ver una peli, Vladi?
		 * ¿Hoy vamos a ver una peli, Vladi?
		 * ¿Hoy vamos a ver una peli, Vladi?
		 * Se muestra «¿Hoy vamos a ver una peli, Vladi?...» tantas veces como indique el número introducido. 
		 * La salida anterior sería para el número 3.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número para imprimir la frase ese número de veces:");
		numero = sc.nextInt();
		
		for(int i = 0; i<numero; i++) {
			System.out.println("¿Hoy vamos a ver una peli, Vladi?");
		}
		
		sc.close();
		
	}

}