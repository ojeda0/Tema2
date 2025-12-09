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
	
	public static int digitoN(int numero, int posicion) {
		
		int totalDigitos = digitos(numero);
		
		/*int totalDigitos = 0;
		
		int aux = numero;
		
		while(aux > 0) {
			
			aux /= 10;
			totalDigitos++;
			
		}*/
		
		int digitosDerecha = totalDigitos - 1 - posicion;
		
		for(int i = 0; i < digitosDerecha; i++) {
			
			numero = numero / 10;
			
		}
		
		return numero % 10;
	}
	
	public static boolean esCapicua(int numero) {
		
		boolean numeroCapicuo = false;
		
		int numeroVolteado = voltea(numero);
		
		/*int numeroVolteado = 0;
		
		while(numero > 0) {
			
			int digito = numero % 10;
			
			numeroVolteado *= 10 + digito;
			
			numero /= 10;
			
		}*/
		
		if(numeroVolteado == numero) {
			
			numeroCapicuo = true;
			
		}
		
		return numeroCapicuo;
		
	}
	
	public static int potencia(int base, int exponente) {
		
		int potenciaNumero = 1;
		
		for(int i = 0; i < exponente; i++) {
			
			potenciaNumero *= base;
			
		}
		
		return potenciaNumero;
		
	}
	
	public static int posicionDeDigito(int numero, int digito) {
		
		int totalDigitos = 0;
		
		int aux = numero;
		
		while(aux > 0) {
			
			aux /= 10;
			totalDigitos++;
			
		}
		
		for(int i = 0; i < totalDigitos; i++) {
			
			int posicion = digitoN(numero, i);
			
			if(posicion == digito) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	
	public static int pegaPorDelante(int numero, int numeroPegar) {
		
		int multiplica = 1;
		
		int aux = numero;
		
		while(aux > 0) {
			
			multiplica *= 10;
			
			aux /= 10;
			
		}
		
		int resultado = numeroPegar * multiplica + numero;
		
		return resultado;
		
	}
}