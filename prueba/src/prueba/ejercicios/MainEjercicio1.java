package prueba.ejercicios;

import java.util.Scanner;

public class MainEjercicio1 {

	public static void main(String[] args) {
		
		
		int numero = pedirNumeroMayor(6, 20);

	}
	
	public static int pedirNumeroMayor(int minimo, int maximo) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduce un número mayor que %d y menor que %d:\n", minimo, maximo);
		int numero = sc.nextInt();
		sc.close();
		
		return numero;
	}
	
}