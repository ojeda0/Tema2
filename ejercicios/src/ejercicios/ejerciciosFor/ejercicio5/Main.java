package ejercicios.ejerciciosFor.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO DIAPOSITIVA 53
		 * Implementar una aplicación que pida al usuario un número comprendido 
		 * entre 1 y 10. Hay que mostrar la tabla de multiplicar de dicho número, 
		 * asegurándose de que el número introducido se encuentra en el rango establecido.
		 */

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			
			System.out.println("Introduce un número entre 1 y 10 para ver su tabla de multiplicar:");
			numero = sc.nextInt();
			
			if(numero>1 && numero<10) {
				System.out.printf("¡Has introducido un número entre 1 y 10! Aquí tienes la tabla de multiplicar de %d.\n", numero);
				
				for(int i=1; i<=10; i++) {
					System.out.printf("%d X %d = %d\n", numero, i, numero * i);
				}
			}else {
				System.out.println("Recuerda, ¡debes introducir un número entre 1 y 10!");
			}
			
		}while(numero < 1 || numero > 10);
		
		sc.close();
		
	}

}