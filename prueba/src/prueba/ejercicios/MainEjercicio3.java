package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero:");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número entero:");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El primer número introducido ha sido %d y el segundo número introducido ha sido %d.\n"
				+ "¿Ambos números son distintos entre sí o alguno de ellos es cero?: %b.\n", numero1, numero2, comprobacion(numero1, numero2));

	}

	public static boolean comprobacion(int numero1, int numero2) {
		boolean comprobacion = (numero1 != numero2) || (numero1 == 0) || (numero2 == 0);
		
		return comprobacion;
	}
	
}