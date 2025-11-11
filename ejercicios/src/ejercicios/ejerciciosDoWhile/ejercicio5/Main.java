package ejercicios.ejerciciosDoWhile.ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. 
		 * El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. 
		 * Mientras la solución introducida sea correcta, el juego continuará. 
		 * En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		Random  r1 = new Random();
		Random  r2 = new Random();
		
		int numero1;
		int numero2;
		int solucionSuma;
		int intentos = 0;
		int aciertos = 0;
		
		
		do {
			numero1 = r1.nextInt(1,101);
			numero2 = r2.nextInt(1,101);
			
			System.out.printf("¿Cuánto es %d + %d?\n", numero1, numero2);
			solucionSuma = sc.nextInt();
			
			intentos++;
			
			if(solucionSuma == numero1+numero2) {
				System.out.println("¡Correcto! Vamos con la siguiente.");
				aciertos++;
			}
			
		}while(solucionSuma == numero1+numero2);
		
		System.out.printf("Has fallado, inténtalo de nuevo.\n"
				+ "Numero de intentos: %d\n"
				+ "Número de aciertos: %d\n", intentos, aciertos);
		
		sc.close();
	}

}
