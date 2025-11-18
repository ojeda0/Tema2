package ejercicios.boletin2.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 
		 * 'NO VOCAL' en caso contrario, el programa termina cuando se introduce un punto.
		 */

		Scanner sc = new Scanner(System.in);
		String caracter = null;
		
		do {
			System.out.println("Introduce un caracter para saber si es vocal o no. Utiliza un . para salir del programa:");
			caracter = sc.next();
			
			if(!(caracter.length()==1)) {
				
				System.out.println("¡Debes introducir un solo caracter!");
				
			}else if(caracter.matches("[!#$%&'()*+,-./:;<=>?@^_`{|}~]")) {
				
				System.out.println("¡Debes introducir un caracter válido!");
				
			}else if(caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")) {
				
				System.out.printf("¡Has introducido el caracter %s! Este caracter SI es una vocal.\n", caracter);	
				
			}else {
				System.out.printf("¡Has introducido el caracter %s! Este caracter NO es una vocal.\n", caracter);
			}
			
		}while(!(caracter.equals(".")));
		
		sc.close();
		
	}

}