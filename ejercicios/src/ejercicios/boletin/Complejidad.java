package ejercicios.boletin;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {

	// MÉTODOS

	/*
	 * Este método genera un número aleatorio del 1 al 100. A continuación, va 
	 * pidiendo números y va mostrando por pantalla si el número a adivinar es 
	 * mayor o menor que el introducido, además de los intentos que te quedan 
	 * (tienes 10 intentos para acertarlo). El programa termina cuando se 
	 * acierta el número (además muestra por pantalla en cuantos intentos 
	 * lo has acertado), si se llega al limite de intentos te muestra el 
	 * número que había generado.
	 */
	
	public static void adivinaNumero() {
		
		Scanner sc = new Scanner(System.in);
		Random r1 = new Random();
		
		int numero;
		int random;
		int intentos = 10;
		random = r1.nextInt(1,101);
			
		do {
			System.out.println("He pensado un número aleatorio entre 1 y 100, ¡introduce un número y te diré si es mayor o menor!:");
			numero = sc.nextInt();
			
			intentos--;
			
			if(intentos==0){
				System.out.printf("¡Has perdido! Mi número era %d.\n", random);
			}else if(numero < random) {
				System.out.printf("¡Es mayor que %d! Te quedan %d intentos.\n", numero, intentos);
			}else if(numero > random) {
				System.out.printf("¡Es menor que %d! Te quedan %d intentos.\n", numero, intentos);
			}else {
				System.out.printf("¡Has acertado! Mi número era %d.\n"
						+ "Número de intentos usados: %d.\n", random, 10-intentos);
			}
			
			
		}while(intentos>0 && numero != random);
		
		sc.close();
			
	}
	
	/*
	 * Según cierta cultura, los números de la suerte son el 3, el 7, el 8 y 
	 * el 9. Los números de la mala suerte son el resto: el 0, el 1, el 2, 
	 * el 4, el 5 y el 6. Un número es afortunado si contiene más números de 
	 * la suerte que de la mala suerte. Este método imprime por pantalla si 
	 * un número introducido por el usuario es afortunado o no.
	 */
	
	public static void numerosAfortunados() {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int buenaSuerte = 0;
		int malaSuerte = 0;
		
		System.out.println("Introduce un número para saber si es afortunado o no:");
		numero = sc.nextInt();
		
		while(numero>0) {
			
			int cifra = numero%10;
			numero = numero/10;
			
			if(cifra==3 || cifra==7 || cifra==8 || cifra==9) {
				buenaSuerte++;
			}else if(cifra==0 || cifra==1 || cifra==2 || cifra==4 || cifra==5 || cifra==6) {
				malaSuerte++;
			}
			
		}
		
		if(buenaSuerte>malaSuerte) {
			System.out.println("¡El número introducido es afortunado!");
		}else {
			System.out.println("¡El número introducido es desafortunado!");
		}
		
		sc.close();
		
	}
	
	/*
	 * Nos han encargado realizar el validador de contraseña de una determinada web. 
	 * El usuario debe introducir una contraseña y si la contraseña es válida, el 
	 * sistema imprime por pantalla “CONTRASEÑA VÁLIDA”, en caso contrario, muestra 
	 * “VUELVE A INTENTARLO” y vuelve a pedirla. La contraseña debe tener un mínimo 
	 * de 10 caracteres. Cómo mínimo debe contener: dos letras mayúsculas, dos letras 
	 * minúsculas, dos números y dos caracteres especiales (@, #, *, %, &, /).
	 * 	NOTA: Te puedes ayudar de las siguientes funciones del tipo String:
	 * 		matches("[a-z]") - Devuelve true si contiene una letra minúscula.
	 * 		matches("[A-Z]") - Devuelve true si contiene una letra mayúscula.
	 * 		matches("[0-9]") - Devuelve true si contiene un número.
	 * 		matches("[@#*%&/]") - Devuelve true si contiene un carácter especial.
	 */
	
	public static void validaPassword() {
		
		Scanner sc = new Scanner(System.in);
		
		int mayus;
		int minus;
		int numeros;
		int especiales;
		String password;
		
		do {
			mayus = 0;
			minus = 0;
			numeros = 0;
			especiales = 0;
			
			System.out.println("Ingrese una contraseña:");
			password = sc.next();
			
			for(int i=0; i < password.length(); i++) {
				String caracter = password.substring(i, i+1); 
				
				if(caracter.matches("[a-z]")) {
					minus++;
				}
				else if(caracter.matches("[A-Z]")) {
					mayus++;				
				}
				else if(caracter.matches("[0-9]")) {
					numeros++;
				}
				else if(caracter.matches("[@#*%&/]")){
					especiales++;
				}
			}
			
			if(minus >= 2 && mayus >= 2 && numeros >= 2 && especiales >= 2 && password.length() >= 10) {
				System.out.println("CONTRASEÑA VÁLIDA");
			}
			else {
				System.out.println("VUELVE A INTENTARLO");
			}
		}while(minus < 2 || mayus < 2|| numeros < 2 || especiales < 2 || password.length() < 10);
		
		sc.close();
		
	}

}