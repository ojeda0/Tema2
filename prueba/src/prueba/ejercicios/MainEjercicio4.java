package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero para comprobar si es múltiplo del segundo:");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número entero:");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El primer número introducido ha sido %d y el segundo número introducido ha sido %d.\n"
				+ "¿El primer número es múltiplo del segundo?: %b.\n", numero1, numero2, esMultiplo(numero1, numero2));

	}
	
	public static boolean esMultiplo(int numero1, int numero2) {
		boolean esMultiplo = (numero2 != 0) ? (numero1 % numero2 == 0):false;
		return esMultiplo;
	}

}