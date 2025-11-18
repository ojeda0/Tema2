package ejercicios.ejerciciosBuclesAnidados.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO
		 * Diseñar una programa que muestre las tablas de multiplicar del 1 al 10.
		 */
		
		for(int i=1; i<=10; i++) {
			
			System.out.printf("Tabla del %d:\n\n", i);
			
			for(int j=1; j<=10; j++) {
				
				System.out.printf("%d X %d = %d\n", i, j, i*j);
				
			}
			
			System.out.println("----------------");
			
		}
	}

}