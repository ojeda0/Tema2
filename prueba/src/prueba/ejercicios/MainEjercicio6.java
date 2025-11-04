package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero:");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número entero:");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El primer número introducido ha sido %d y el segundo número introducido ha sido %d.\n"
				+ "%s\n", numero1, numero2, sonIguales(numero1, numero2));

	}
	
	public static String sonIguales(int numero1, int numero2) {
		
		String mensaje = "";
		
		if(numero1==numero2) {
			mensaje = "Ambos números son iguales.";
		}else {
			mensaje = "Los números son diferentes.";
		}
		
		return mensaje;
	}

}
