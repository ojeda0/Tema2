package ejercicios.ejerciciosFor.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * 
		 * Escribir todos los múltiplos de 7 menores que 100.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int multiplosDe = 7;
		
		for(int i = 0; i<100; i++) {
			
			if(i % multiplosDe == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
		
	}

}