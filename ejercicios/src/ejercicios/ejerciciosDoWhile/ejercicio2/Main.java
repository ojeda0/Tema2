package ejercicios.ejerciciosDoWhile.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Diapositiva 42.

		Scanner sc = new Scanner(System.in);
		
		String vocal;
		
		do {
			System.out.println("Introduce una vocal:");
			vocal = sc.next();
			
			if (!(vocal.equalsIgnoreCase("a")) && !(vocal.equalsIgnoreCase("e")) && !(vocal.equalsIgnoreCase("i")) && !(vocal.equalsIgnoreCase("o")) && !(vocal.equalsIgnoreCase("u"))) {
				System.out.println("Recuerda, ¡debes introducir una vocal!");
			}
		}while(!(vocal.equalsIgnoreCase("a")) && !(vocal.equalsIgnoreCase("e")) && !(vocal.equalsIgnoreCase("i")) && !(vocal.equalsIgnoreCase("o")) && !(vocal.equalsIgnoreCase("u")));
		
		System.out.printf("Tu vocal introducida ha sido %s.\n", vocal);
		
		sc.close();
	}

}