package ejercicios.ejerciciosRecursividad.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(suma(5));

	}
	
	public static int suma(int n) {
		int res = 0;
		
		if(n>0) {
			res = n+suma(n-1);
		}
		
		return res;
	}
	
	public static int suma2(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+suma(n-1);
	}

}