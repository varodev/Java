package pooClasesAbstractasPolim;

public class E2Directivo extends E2Empleado {

	public E2Directivo(String nombre) {
		super(nombre);
	}
	
	public E2Directivo() {
	}

	public String toString() {
		return super.toString() + " = Directivo" ;
	}
}
