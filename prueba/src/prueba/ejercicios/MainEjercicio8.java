package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 0 y 99999 (no más de 5 cifras):");
		int numero = sc.nextInt();
		
		System.out.printf("El número introducido ha sido: %d\n"
				+ "%s", numero, contarCifras(numero));

	}
	
	public static String contarCifras(int numero) {
		
		String mensaje = "";
		
		if(numero<10 && numero>=0) {
			
			mensaje = "El número " + numero + " tiene 1 cifra.";
		
		} else if(numero<100 && numero>=10) {
			
			mensaje = "El número " + numero + " tiene 2 cifras.";
			
		} else if(numero<1000 && numero>=100) {
			
			mensaje = "El número " + numero + " tiene 3 cifras.";
			
		} else if(numero<10000 && numero>=1000) {
			
			mensaje = "El número " + numero + " tiene 4 cifras.";
			
		} else if(numero<100000 && numero>=10000) {
			
			mensaje = "El número " + numero + " tiene 5 cifras.";
			
		} else {
			
			mensaje = "Error, introduce un número entre 0 y 99999";
			
		}
		
		return mensaje;
	}

}
