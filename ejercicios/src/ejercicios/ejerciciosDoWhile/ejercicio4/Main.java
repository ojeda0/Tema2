package ejercicios.ejerciciosDoWhile.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO DIAPOSITIVA 44
		 * Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma y promedio.
		 * Realizar el programa con <<do-while>>
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int contador = 0;
		
		do {
			System.out.printf("Introduce el %d número:\n", contador+1);
			int numero = sc.nextInt();
			
			contador++;
			suma += numero;
			
		}while(contador < 10);

		double promedio = suma*1.0/contador;
		
		System.out.printf("La suma de los 10 números introducidos es: %d\n"
				+ "El promedio de los 10 números es: %.2f\n", suma, promedio);
		
		sc.close();
	}

}
