package ejercicios.ejerciciosFor.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO DIAPOSITIVA 52
		 * Pedir diez números enteros por teclado y mostrar la media.
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		int sumaNumeros = 0;
		double media = 0;
		/*
		 * Para mostrar los números que ha introducido el usuario:
		 */
		//String numeros = "";
		
		for(int i=1; i <= 10; i++) {
			
		System.out.printf("Introduce el %d número:\n", i);
		numero = sc.nextInt();
		
		/*
		 *  Para mostrar los números que ha introducido el usuario:
		 */
		// numeros = numeros + " " + numero;
		
		sumaNumeros += numero;
		
		media = sumaNumeros / i;
		
		}
		
		System.out.printf("¡Ya has introducido los 10 números! La media es %.2f.\n", media);
		sc.close();
		
	}

}