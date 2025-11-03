package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una letra:");
		String letra = sc.next();

		System.out.printf("La letra %s es vocal: %b\n", letra, esVocal(letra));
		
	}

	public static boolean esVocal(String letra) {
		
		boolean esVocal = (letra.equalsIgnoreCase("A")) || 
				(letra.equalsIgnoreCase("E")) || 
				(letra.equalsIgnoreCase("I")) || 
				(letra.equalsIgnoreCase("O")) || 
				(letra.equalsIgnoreCase("U"));
		
		return esVocal;
	}
	
}