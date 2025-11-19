package ejercicios.boletin2.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		String caracter = null;
		
		System.out.println("Introduce una frase:");
		cadena = sc.next();
		
		do {
			System.out.println("Introduce un caracter para ver cuantas veces aparece en la frase:");
			caracter = sc.next();
			
		}while(!(caracter.length()==1));
		
		sc.close();
		
	}

}
