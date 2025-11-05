package ejerciciosConClases.ejercicio2;

public class Calculadora {

	//ATRIBUTOS
	private double numero1;
	private double numero2;
	private String operador;
	
	//CONSTRUCTOR
	public Calculadora(double numero1, double numero2, String operador) {
		setNumero1(numero1);
		setNumero2(numero2);
		setOperador(operador);
	}
	
	//MÉTODOS
	public double getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public double getNumero2() {
		return this.numero2;
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public String getOperador() {
		return this.operador;
	}
	
	public void setOperador(String operador) {
		if(!(operador.equals("+")) && !(operador.equals("-")) && !(operador.equals("*")) && !(operador.equals("/"))) {
			throw new IllegalArgumentException("Debes introducir un operador válido ( + , - , * , / )");
		}
		
		if((operador.equals("/")) && (this.numero2==0)) {
			throw new IllegalArgumentException("No es posible dividir entre 0.");
		}
		
		this.operador = operador;
	}
	
	public void calcularConIf() {
		if(this.operador.equals("+")) {
			double suma = this.numero1 + this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, suma);
		} else if(this.operador.equals("-")) {
			double resta = this.numero1 - this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, resta);
		} else if(this.operador.equals("*")) {
			double multiplicacion = this.numero1 * this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, multiplicacion);
		} else if(this.operador.equals("/")) {
			double division = this.numero1 / this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, division);
		}
	}
	
	public void calcularConSwitch() {
		switch(this.operador) {
		case "+":
			double suma = this.numero1 + this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, suma);
			break;
		case "-":
			double resta = this.numero1 - this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, resta);
			break;
		case "*":
			double multiplicacion = this.numero1 * this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, multiplicacion);
			break;
		case "/":
			double division = this.numero1 / this.numero2;
			System.out.printf("El resultado de %.2f %s %.2f es %.2f\n", this.numero1, this.operador, this.numero2, division);
			break;
		}
	}
}
