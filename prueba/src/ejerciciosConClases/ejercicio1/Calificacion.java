package ejerciciosConClases.ejercicio1;

public class Calificacion {

	//ATRIBUTOS
	private int nota;
	
	//CONSTRUCTOR
	public Calificacion(int nota) {
		setNota(nota);
	}
	
	//MÉTODOS
	public int getNota() {
		return this.nota;
	}
	
	public void setNota(int nota) {
		if(nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Introduzca una nota entre 0 y 10.");
		}
		this.nota = nota;
	}
	
	public void mostrarResultadoSwitchClasico() {
		switch(this.nota) {
		case 0,1,2,3,4:
			System.out.println("Insuficiente.");
			break;
		case 5:
			System.out.println("Suficiente.");
			break;
		case 6:
			System.out.println("Bien.");
			break;
		case 7,8:
			System.out.println("Notable.");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
			break;
		}
	}
	
	public void mostrarResultadoSwitchNuevo() {
		switch(this.nota) {
		case 0,1,2,3,4 -> System.out.println("Insuficiente.");
		case 5 -> System.out.println("Suficiente.");
		case 6 -> System.out.println("Bien.");
		case 7,8 -> System.out.println("Notable.");
		case 9,10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Debes introducir una nota entre el 0 y el 10.");
		}
	}
	
	public void mostrarResultadoIf() {
		if(this.nota>=0 && this.nota<=4) {
			System.out.println("Insuficiente.");
		} else if(this.nota==5) {
			System.out.println("Suficiente.");
		} else if(this.nota==6) {
			System.out.println("Bien.");
		} else if(this.nota==7 || this.nota==8) {
			System.out.println("Notable.");
		} else if(this.nota==9 || this.nota==10) {
			System.out.println("Sobresaliente.");
		}
	}
}