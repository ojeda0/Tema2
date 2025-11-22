package ejercicios.boletin2.ejercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO 6
		 * 
		 * Introducir una cadena de caracteres e indicar si es un palíndromo. 
		 * Una palabra palíndroma es aquella que se lee igual adelante que atrás.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		String cadenaInvertida = "";
		
		System.out.println("Introduce una palabra o frase para comprobar si es palíndroma o no:");
		cadena = sc.nextLine();
		
		String cadenaLimpia = cadena.replace(" ","");
		
		for(int i=cadenaLimpia.length()-1; i>=0; i--) {
			cadenaInvertida += cadenaLimpia.charAt(i);
		}
		
		if(cadenaLimpia.equalsIgnoreCase(cadenaInvertida)) {
			
			System.out.printf("Has introducido la palabra o frase: %s\n"
					+ "La palabra o frase al revés es: %s\n"
					+ "¡Esta palabra o frase SI es palíndroma!\n", cadena, cadenaInvertida);
			
		}else {
			
			System.out.printf("Has introducido la palabra o frase: %s\n"
					+ "La palabra o frase al revés es: %s\n"
					+ "¡Esta palabra o frase NO es palíndroma!\n", cadena, cadenaInvertida);
			
		}
		
		sc.close();
	}

}