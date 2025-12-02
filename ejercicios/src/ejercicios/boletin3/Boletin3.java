package ejercicios.boletin3;

import java.util.Scanner;

public class Boletin3 {

	// MÉTODOS
	
	public static void conversorPalotes() {
		
		/*
		 * EJERCICIO 1
		 * 
		 * Realiza un conversor del sistema decimal al sistema de “palotes”. Ejemplo:
		 * Por favor, introduzca un número entero positivo: 47021
		 * El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int aux;
		String palotes = "";
		
		do {
			
			System.out.println("Por favor, introduzca un número entero positivo:");
			numero = sc.nextInt();
			
			if(numero <= 0) {
				System.out.println("Recuerda, ¡debe ser un número entero positivo!");
			}
			
		}while(numero <= 0);
		
		aux = numero;
		
		while (aux > 0) {
			
			int digito = aux % 10;
			
			for(int i = 1; i <= digito; i++) {
				
				palotes = "|" + palotes;
				
			}
			
			aux = aux / 10;
			
			if(aux > 0) {
				
				palotes = "-" + palotes;
				
			}
			
		}
		
		System.out.printf("El número introducido ha sido %d\n"
				+ "EL número en el sistema de palotes es %s\n", numero, palotes);
		
		sc.close();
		
	}
	
	public static void pintarAsteriscos () {
		
		/*
		 * EJERCICIO 2
		 * 
		 * Programa que pinta la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. 
		 * El programa inserta un espacio y pinta dos asteriscos menos en la base para 
		 * simular la curvatura de las esquinas inferiores. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int altura;
		
		do {
			System.out.println("Introduce la altura de la U para dibujarla con asteriscos:");
			altura = sc.nextInt();
		}while(altura<=2);
		
		for(int i=1; i <= altura-1; i++) {
			
			System.out.print("*");
			
			for(int j=1; j <= altura-2; j++) {
				
				System.out.print(" ");
			}
			
			System.out.println("*");
			
		}
		
		System.out.print(" ");
		
		for(int i=1; i <= altura-2; i++) {
			
			System.out.print("*");
			
		}
		
		System.out.println(" ");
		
		sc.close();
		
	}
	
	public static void insertarDigito() {
		
		/*
		 * EJERCICIO 3
		 * 
		 * Programa que sea capaz de insertar un dígito dentro de un número indicando la posición. 
		 * El nuevo dígito se colocará en la posición indicada y el resto de dígitos se desplazará hacia la derecha. 
		 * Las posiciones se cuentan de izquierda a derecha empezando por el 1.
		 */
		
		Scanner sc = new Scanner(System.in);

		long numero;
		long numeroCambiado;
		int posicion;
		int digito;
		long aux;
		int cifras = 0;

		do {
			
			System.out.print("Dime un entero positivo: ");
			numero = sc.nextLong();
			
		} while (numero <= 0);

		aux = numero;

		while (aux > 0) {
			
			aux = aux / 10;
			cifras++;
			
		}

		do {
			
			System.out.print("Dime la posicion donde quieres insertar: ");
			posicion = sc.nextInt();
			
		} while (posicion > cifras || posicion < 1);

		do {
			
			System.out.print("Dime el digito que quieres insertar: ");
			digito = sc.nextInt();
			
		} while (digito > 9 || digito < 0);

		int corte = (int) Math.pow(10, cifras - posicion + 1);
		
		long parteIzq = numero / corte;
		
		long parteDer = numero % corte;
		
		parteIzq = (parteIzq * 10 + digito) * corte;

		numeroCambiado = parteIzq + parteDer;

		System.out.printf("El número resultante es %d \n", numeroCambiado);

		sc.close();
		
	}
	
	public static void serpiente() {
		
	}
	
}