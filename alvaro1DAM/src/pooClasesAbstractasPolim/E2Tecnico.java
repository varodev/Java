package pooClasesAbstractasPolim;

public class E2Tecnico extends E2Operario {

	public E2Tecnico(String nombre) {
		super(nombre);
	}
	
	public E2Tecnico() {
	}

	public String toString() {
		return super.toString() + " = Tecnico";
	}
}
