package ejercicios.ejerciciosFor.ejercicio6;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO DIAPOSITIVA 54
		 * Diseñar un programa que muestre la suma de los 
		 * 10 primeros números impares empezando desde el 0.
		 */
		int suma = 0;
		
		for(int i=0; i<20; i++) {
			if(i%2!=0) {
				suma+=i;
			}
		}
		
		System.out.printf("La suma de los 10 primeros números impares es de %d.\n", suma);
		
	}

}
