package ejercicios.repaso;

public class RepasoRecursividad {

	//MÉTODOS
	
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