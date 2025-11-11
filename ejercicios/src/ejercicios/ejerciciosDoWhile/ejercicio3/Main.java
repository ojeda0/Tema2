package ejercicios.ejerciciosDoWhile.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Diapositiva 43.
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		do {
			System.out.println("Introduce el primer número:");
			numero1 = sc.nextInt();
			
			System.out.println("Introduce el segundo número:");
			numero2 = sc.nextInt();
			
			if(numero1 != numero2) {
				System.out.println("Recuerda, ¡para terminar el proceso debes introducir 2 números iguales!");
			}
			
		}while(numero1 != numero2);
		
		System.out.printf("¡Has terminado el proceso! Ambos números introducidos han sido %d. \n", numero1);
		sc.close();
	}

}
