package ejercicios.ejerciciosDoWhile.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Diapositiva 41.
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Introduce un número entero del 1 al 10:");
			numero = sc.nextInt();
			
			if(numero < 1 || numero > 10) {
				System.out.println("Recuerda, ¡debe ser un número entero entre 1 y 10!");
			}
		}while(numero < 1 || numero > 10);

		System.out.printf("Tu número entero introducido ha sido %d.\n", numero);
		
		sc.close();
	}

}