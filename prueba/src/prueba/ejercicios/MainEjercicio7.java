package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número entero:");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número entero:");
		int numero2 = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El primer número introducido ha sido %d y el segundo número introducido ha sido %d.\n"
				+ "%s", numero1, numero2, esMayor(numero1, numero2));
	}
	
	public static String esMayor(int numero1, int numero2) {
		
		String mensaje = "";
		
		if(numero1>numero2) {
			mensaje = numero1 + " es mayor que " + numero2;
			
		} else if(numero1<numero2){
			
			mensaje = numero1 + " es menor que " + numero2;
		}else {
			
			mensaje = numero1 + " es igual que " + numero2;
		}
		
		return mensaje;
	}

}
