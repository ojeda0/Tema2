package ejerciciosWhile.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 50) {
			
			if(contador%2==0) {
				System.out.println(contador);
			}
			contador++;
		}
	}
}