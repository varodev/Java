package pooClasesAbstractasPolim;

public class E2Operario extends E2Empleado {
	
	public E2Operario(String nombre) {
		super(nombre);
	}
	
	public E2Operario() {
	}
		
	public String toString() {
		return super.toString() + " = Operario"  ;
	}
}
