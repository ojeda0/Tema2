package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para saber si es par o impar:");
		int numero = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El número introducido ha sido: %d.\n"
				+ "Este numero %s.\n", numero, parImpar(numero));
	
	}
	
	public static String parImpar(int numero) {
	
		String salidaPar = "es par";
		
		boolean par = (numero % 2 == 0);
		
		if (!par) {
			salidaPar = "es impar";
		}
		
		return salidaPar;
	}

}
