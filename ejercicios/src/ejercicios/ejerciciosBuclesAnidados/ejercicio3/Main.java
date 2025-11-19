package ejercicios.ejerciciosBuclesAnidados.ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		for(char i='Z'; i>='A'; i--) {
			
			for(char j=i; j>='A'; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
