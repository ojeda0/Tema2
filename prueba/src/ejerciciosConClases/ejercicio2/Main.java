package ejerciciosConClases.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//ESCÁNER
		Scanner sc = new Scanner(System.in);
		
		//PEDIMOS DATOS
		System.out.println("Introduce el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduce el operador ( + , - , * , / ):");
		String operador = sc.next();
		
		System.out.println("Introduce el segundo número:");
		double numero2 = sc.nextDouble();
		
		//CONSTRUCTOR
		Calculadora calculo1 = new Calculadora(numero1, numero2, operador);
		
		//MÉTODO
		calculo1.calcularConIf();
		calculo1.calcularConSwitch();
		
		//CERRAMOS ESCÁNER
		sc.close();
	}
}