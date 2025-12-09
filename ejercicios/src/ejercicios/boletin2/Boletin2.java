package ejercicios.boletin2;

import java.util.Random;
import java.util.Scanner;

public class Boletin2 {

	// MÉTODOS
	
	public static void ejercicio1() {
		
		/*
		 * EJERCICIO 1
		 * 
		 * Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 
		 * 'NO VOCAL' en caso contrario, el programa termina cuando se introduce un punto.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un caracter para saber si es vocal o no, si quieres parar el programa usa un punto (.):");
		String caracter = sc.next();
		
		if((caracter.equalsIgnoreCase("a")) || (caracter.equalsIgnoreCase("e")) || (caracter.equalsIgnoreCase("i")) || (caracter.equalsIgnoreCase("o")) || (caracter.equalsIgnoreCase("u"))) {
			
			System.out.printf("El caracter introducido %s SI es una vocal.\n", caracter);
			
		}else if(caracter.equalsIgnoreCase(".")) {
			
			System.out.println("Has finalizado el programa.");
			
		}else {
			
			System.out.printf("El caracter introducido %s NO es una vocal.\n", caracter);
			
		}
		
		sc.close();
	}
	
	public static void ejercicio2() {

		/*
		 * EJERCICIO 3
		 * 
		 * Pide una cadena y un carácter por teclado (valida que sea un carácter)
		 * y muestra cuantas veces aparece el carácter en la cadena.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String caracter = "";
		String cadena = "";
		int contador = 0;
		
		System.out.println("Introduce una palabra:");
		cadena = sc.next();
		
		
		do {
			
			System.out.println("Introduce un caracter para ver cuántas veces aparece en la palabra introducida:");
			caracter = sc.next();
			
			if(caracter.length() != 1) {
				
				System.out.println("¡Debes introducir 1 solo caracter!");
				
			}
			
		} while(caracter.length() != 1);
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.substring(i, i + 1).equalsIgnoreCase(caracter)) {
				contador++;
			}
			
		}
		
		System.out.printf("La palabra introducida ha sido: %s\n"
				+ "El caracter introducido ha sido: %s\n"
				+ "Este caracter aparece %d veces en la palabra.\n", cadena, caracter, contador);
		
		sc.close();
		
	}
	
	public static void ejercicio3() {
		
		/*
		 * Suponiendo que hemos introducido una cadena por teclado que representa una frase 
		 * (palabras separadas por espacios), realiza un programa que 
		 * cuente cuantas palabras tiene.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		int contadorPalabras = 1;
		
		do {
			
			System.out.println("Introduce una frase para saber cuántas palabras tiene:");
			frase = sc.nextLine();
			
			if(frase.length() == 0) {
				
				System.out.println("¡Recuerda, debes introducir al menos una palabra para la frase!");
				
			}
		
		}while(frase.length() == 0);
		
		for(int i = 0; i<frase.length(); i++) {
			
			if(frase.substring(i, i+1).equalsIgnoreCase(" ")) {
				
				contadorPalabras++;
				
			}
			
		}
		
		System.out.printf("La frase introducida ha sido: %s\n"
				+ "Esta frase tiene %d palabras.\n", frase, contadorPalabras);
		
		sc.close();
		
	}
	
	public static void ejercicio4() {
		
		/*
		 * EJERCICIO 4
		 * 
		 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
		 * sustituye la aparición del primer carácter en la cadena por el segundo carácter.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		String palabra = sc.next();
		
		String caracter1;
		
		do {
			
			System.out.println("Dime el caracter 1:");
			caracter1 = sc.next();
			
		}while(caracter1.length() != 1);
		
		String caracter2;
		
		do {
			
			System.out.println("Dime el caracter 2:");
			caracter2 = sc.next();
			
		}while(caracter2.length() != 1);
		
		for(int i=0; i<palabra.length(); i++) {
			
			String caracter = palabra.substring(i, i+1);
			
			if(caracter.equalsIgnoreCase(caracter1)) {
				
				System.out.print(caracter2);
				
			}
			else {
				System.out.print(caracter);
			}
			
		}
		
		sc.close();
		
	}
	
	public static void ejercicio6() {

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
		
		String cadenaLimpia = cadena.replaceAll(" ","");
		
		for(int i=cadenaLimpia.length()-1; i>=0; i--) {
			cadenaInvertida += cadenaLimpia.substring(i, i+1);
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
	
	public static void ejercicio13() {

		/*
		 * EJERCICIO 13
		 */
		
		Random r1 = new Random();
		
		int golesTorrent = 0;
		int golesBetis = 0;
		int golesIsco = 0;
		
		String numeroString = "";
		
		for(int i=1; i<=9; i++) {
			
			int digito = r1.nextInt(10);
			
			numeroString += digito;
			
			if(digito % 4 == 0) {
				golesBetis++;
				golesIsco++;
			}
			else if(digito % 2 == 0) {
				golesBetis++;
			}
			else {
				golesTorrent++;
			}
		}
		
		System.out.printf("Número generado: %s\n"
				+ "TORRENT %d - %d BETIS\n"
				+ "Goles de Isco: %d", numeroString, golesTorrent, golesBetis, golesIsco);
	}
	
	public static void ejercicio14() {

		/*
		 * EJERCICIO 14
		 */
		
		Scanner sc = new Scanner(System.in);
		
		long numero;
		int pares = 0;
		int sumaPares = 0;
		
		
		do {
			System.out.println("Introduzca un número entero positivo para saber sus dígitos pares y cuanto suman:");
			numero = sc.nextLong();
			
			if(numero < 0) {
				System.out.println("Recuerda, ¡debes introducir un número positivo!");
			}
			
		}while(numero < 0);
		
		long guardarNumero = numero;
		
		if(guardarNumero == 0) {
			
			pares++;
			
		}
		
		while(guardarNumero > 0) {
			
			long digito = guardarNumero % 10;
			
			if(digito % 2 == 0) {
				
				pares++;
				sumaPares += digito;
				
			}
			
			guardarNumero = guardarNumero / 10;
			
		}
		
		System.out.printf("Número introducido: %d\n"
				+ "Dígitos pares: %d\n"
				+ "Suma de los números pares: %d\n", numero, pares, sumaPares);
		
		sc.close();
	}
	
}