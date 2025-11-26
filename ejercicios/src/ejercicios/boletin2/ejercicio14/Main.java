package ejercicios.boletin2.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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