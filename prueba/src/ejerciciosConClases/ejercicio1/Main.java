package ejerciciosConClases.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		//PEDIMOS DATOS
		System.out.println("Introduce una nota del 0 al 10:");
		int nota = sc.nextInt();
		
		//CONSTRUCTOR
		Calificacion calificacion1 = new Calificacion(nota);
		
		//MÉTODO
		calificacion1.mostrarResultadoSwitchClasico();
		calificacion1.mostrarResultadoSwitchNuevo();
		calificacion1.mostrarResultadoIf();
		
		//CERRAMOS ESCÁNER
		sc.close();
	}
}