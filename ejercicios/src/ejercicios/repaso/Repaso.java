package ejercicios.repaso;

public class Repaso {

	//MÉTODOS
	
	public static int digitos(int numero) {
		
		/*
		 * EJ 1
		 * Cuenta el número de dígitos de un número entero.
		 */
		
		int numeroDigitos = 0;
		
		while(numero > 0) {
			
			numero = numero / 10;
			
			numeroDigitos++;
			
		}
		
		return numeroDigitos;
		
	}
	
	public static int voltea(int numero) {
		
		/*
		 * EJ 2
		 * Le da la vuelta a un número y lo devuelve.
		 */
		
		int numeroVolteado = 0;
		
		while(numero > 0) {
			
			int digito = numero % 10;
			
			numeroVolteado = numeroVolteado * 10 + digito;
			
			numero /= 10;
			
		}
		
		return numeroVolteado;
		
	}
	
	public static boolean esPrimo(int numero) {
		
		boolean esPrimo = true;
		
		for(int i = 2; i<numero && esPrimo; i++) {
			
			if(numero % i == 0) {
				
				esPrimo = false;
				
			}
			
		}
		
		return esPrimo;
		
	}
	
	public static int siguientePrimo(int numero) {
		
		boolean encontrado = false;
		
		while(!encontrado) {
			
			numero++;
			
			if(esPrimo(numero)) {
				
				encontrado = true;
				
			}
			
		}
		
		return numero;
		
	}
	
	public static int factorial(int numero) {
		
		if(numero == 0) {
			return 1;
		}
		
		return numero * factorial(numero-1);
		
	}
	
	public static int fibonacci(int numero) {
		
		if(numero == 1) {
			return 1;
		}
		
		if(numero == 2) {
			return 1;
		}
		
		return fibonacci(numero-1) + fibonacci(numero-2);
		
	}
	
}