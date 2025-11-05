package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número para ordenarlos de mayor a menor:");
		int a = sc.nextInt();
		
		System.out.println("Introduce el segundo número para ordenarlos de mayor a menor:");
		int b = sc.nextInt();
		
		System.out.println("Introduce el tercer número para ordenarlos de mayor a menor:");
		int c = sc.nextInt();
		
		sc.close();
		
		System.out.printf("El primer número introducido ha sido: %d\n"
				+ "El segundo número introducido ha sido: %d\n"
				+ "El tercer número introducido ha sido: %d\n"
				+ "%s", a, b, c, ordenarMayorMenor(a, b, c));
		
	}

	public static String ordenarMayorMenor(int a, int b, int c) {
		
		/*
		 * a > b > c
		 * a > c > b
		 * b > a > c
		 * b > c > a
		 * c > a > b
		 * c > b > a
		 */
		
		String mensaje = "";
		
		if(a>b && b>c) {
			
			mensaje = a + " es mayor que " + b + " y " + b + " es mayor que " + c;
			//mensaje = String.format("%d es mayor que %d y %d es mayor que %d\n", a, b, b, c);
			
		}else if(a>c && c>b) {
			
			mensaje = a + " es mayor que " + c + " y " + c + " es mayor que " + b;
			//mensaje = String.format("%d es mayor que %d y %d es mayor que %d\n", a, c, c, b);
			
		}else if(b>a && a>c) {
			
			mensaje = b + " es mayor que " + a + " y " + a + " es mayor que " + c;
			
		}else if(b>c && c>a) {
			
			mensaje = b + " es mayor que " + c + " y " + c + " es mayor que " + a;
			
		} else if(c>a && a>b) {
			
			mensaje = c + " es mayor que " + a + " y " + a + " es mayor que " + b;
			
		} else if(c>b && b>a) {
			
			mensaje = c + " es mayor que " + b + " y " + b + " es mayor que " + a;
			
		} else {
			
			mensaje = "Debes introducir números diferentes para ordenarlos de mayor a menor.";
			
		}
		
		return mensaje;
	}
	
}