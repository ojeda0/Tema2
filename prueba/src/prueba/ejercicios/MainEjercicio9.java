package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número para ordenarlos de mayor a menor:");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número para ordenarlos de mayor a menor:");
		int numero2 = sc.nextInt();
		
		System.out.println("Introduce el tercer número para ordenarlos de mayor a menor:");
		int numero3 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("");
		
	}

	public static String ordenarMayorMenor(int numero1, int numero2, int numero3) {
		
		/*
		 * numero1 > numero2 > numero3
		 * numero1 > numero3 > numero2
		 * 
		 */
		
		String mensaje = "";
		
		if(numero1>numero2 && numero2>numero3) {
			
			mensaje = numero1 + " es mayor que " + numero2 + " es mayor que " + numero3;
			
		}else if(numero1>numero3 && numero3>numero2) {
			
			mensaje = numero1 + " es mayor que " + numero3 + " es mayor que " + numero2;
			
		}
		
		return mensaje;
	}
	
}
