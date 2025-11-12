package ejercicios.ejerciciosFor.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * 
		 * Escribir una aplicación para aprender a contar, que pedirá un número n y 
		 * mostrará todos los números del 1 a n.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un número para saber todos los números desde 1 hasta ese:");
		n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
