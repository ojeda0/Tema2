package repasoExamen;

import java.util.Random;
import java.util.Scanner;

public class Repaso {

	//MÉTODOS
	
	public static void ejercicio2() {
		
		/*
		 * Pide una cadena y un carácter por teclado (valida que sea un carácter) 
		 * y muestra cuantas veces aparece el carácter en la cadena.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		String caracter = "";
		int contadorCaracter = 0;
		
		System.out.println("Introduce una palabra o frase:");
		cadena = sc.nextLine();
		
		do {
			
			System.out.println("Introduce un caracter para saber cuantas veces aparece en la palabra o frase:");
			caracter = sc.next();
			
			if(caracter.length() != 1) {
				
				System.out.println("¡Debes introducir un solo caracter!");
				
			}
			
		}while(caracter.length() != 1);
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.substring(i, i+1).equalsIgnoreCase(caracter)) {
				
				contadorCaracter++;
				
			}
			
		}
		
		System.out.printf("La palabra o frase introducida ha sido: %s\n"
				+ "El caracter introducido ha sido: %s\n"
				+ "Este caracter se repite %d veces.\n", cadena, caracter, contadorCaracter);
		
		sc.close();
		
	}
	
	public static void ejercicio3() {
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		int contadorPalabras = 1;
		
		System.out.println("Introduce una frase:");
		cadena = sc.nextLine();
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.substring(i, i+1).equalsIgnoreCase(" ")) {
				
				contadorPalabras++;
				
			}
			
		}
		
		System.out.printf("La frase introducida ha sido: %s\n"
				+ "Esta frase tiene %d palabras.\n", cadena, contadorPalabras);
		
		sc.close();
		
	}
	
	public static void ejercicio4() {
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = "";
		String caracter1 = "";
		String caracter2 = "";
		
		System.out.println("Introduce una palabra o frase:");
		cadena = sc.nextLine();
		
		do {
			
			System.out.println("Introduce el caracter que quieres sustituir por el segundo:");
			caracter1 = sc.next();
			
			if(caracter1.length() != 1) {
				
				System.out.println("¡Debes introducir un solo caracter!");
			}
			
		}while(caracter1.length() != 1);
		
		do {
			
			System.out.println("Introduce el caracter para sustituirlo por el anterior:");
			caracter2 = sc.next();
			
			if(caracter2.length() != 1) {
				
				System.out.println("¡Debes introducir un solo caracter!");
			}
			
		}while(caracter2.length() != 1);
		
		for(int i = 0; i < cadena.length(); i++) {
			
			String caracter = cadena.substring(i, i+1);
			
			if(caracter.equalsIgnoreCase(caracter1)) {
				
				System.out.print(caracter2);
				
			}else {
				
				System.out.print(caracter);
				
			}
			
		}
		
		sc.close();
		
	}
	
	
	public static void ejercicio13() {
		
		Random r = new Random();
		int aleatorio = r.nextInt(100000000,1000000000);
		
		int golesTorrent = 0;
		int golesBetis = 0;
		int golesIsco = 0;
		
		int aux = aleatorio;
		
		while(aux > 0) {
			
			int digito = aux % 10;
			
			if(digito % 2 != 0){
				
				golesTorrent++;
				
			}else if(digito % 2 == 0) {
				
				golesBetis++;
				
				if(digito % 4 == 0) {
					
					golesIsco++;
					
				}
				
			}
			
			aux /= 10;
			
		}
		
		System.out.printf("El número aleatorio generado ha sido: %d\n"
				+ "TORRENT %d - %d BETIS\n"
				+ "Goles de Isco: %d\n", aleatorio, golesTorrent, golesBetis, golesIsco);
		
	}
	
	public static void ejercicio14() {
		
		Scanner sc = new Scanner(System.in);
		
		long numero;
		int contadorPares = 0;
		int sumaPares = 0;
		
		do {
			
			System.out.println("Introduce un número entero positivo para saber cuántos dígitos pares tiene y la suma de estos:");
			numero = sc.nextInt();
			
		}while(numero <= 0);
		
		long aux = numero;
		
		while(aux > 0) {
			
			long digito = aux % 10;
			
			if(digito % 2 == 0) {
				
				contadorPares++;
				sumaPares += digito;
				
			}
			
			aux /= 10;
			
		}
		
		System.out.printf("El número introducido ha sido: %d\n"
				+ "Este número tiene un total de %d números pares.\n"
				+ "La suma de estos números es de %d\n", numero, contadorPares, sumaPares);
		
		sc.close();
		
	}
	
}
