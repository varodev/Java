package pooClasesAbstractasPolim;

public abstract class E2Empleado {
	protected String nombre;

////////////////////////C	
	public E2Empleado() {
		super();
	}

	public E2Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
////////////////////////////////GS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Empleado " + nombre;
	}
}
