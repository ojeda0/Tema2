package ejercicios.boletin2.ejercicio13;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * EJERCICIO 13
		 */
		
		Random r1 = new Random();
		
		int golesTorrent = 0;
		int golesBetis = 0;
		int golesIsco = 0;
		
		String numeroString = "";
		
		for(int i=1; i<=9; i++) {
			
			int digito = r1.nextInt(10);
			
			numeroString += digito;
			
			if(digito % 4 == 0) {
				golesBetis++;
				golesIsco++;
			}
			else if(digito % 2 == 0) {
				golesBetis++;
			}
			else {
				golesTorrent++;
			}
		}
		
		System.out.printf("Número generado: %s\n"
				+ "TORRENT %d - %d BETIS\n"
				+ "Goles de Isco: %d", numeroString, golesTorrent, golesBetis, golesIsco);
	}

}