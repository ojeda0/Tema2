package ejercicios.ejerciciosBuclesAnidados.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * Pedir por consola un número n y dibujar un triángulo rectángulo de n 
		 * elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n= 4:
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número entero para dibujar un triángulo rectángulo con ese número de elementos por lado:");
		numero = sc.nextInt();
		
		for(int i=1; i<=numero; i++) {
			
			for(int j=i; j<=numero; j++) {
				System.out.print("*");
			}
		
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
