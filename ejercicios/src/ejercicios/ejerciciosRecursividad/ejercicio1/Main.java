package ejercicios.ejerciciosRecursividad.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(recursiva(5,4));

	}
	
	public static double recursiva(double a, int n) {
		
		if(n==0) {
			return 1;
		}
		return a*recursiva(a, n-1);
		
	}

}