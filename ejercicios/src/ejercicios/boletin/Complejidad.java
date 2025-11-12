package ejercicios.boletin;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {

	// MÉTODOS

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
	
	public static void validaPassword() {
		
		Scanner sc = new Scanner(System.in);
		
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		int especiales = 0;
		
		System.out.println("Ingresa una contraseña:");
		String password = sc.next();
		
	}

}
