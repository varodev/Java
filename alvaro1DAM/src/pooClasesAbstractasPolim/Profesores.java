package pooClasesAbstractasPolim;

public class Profesores extends Empleados {
	private String depart;

///////////////////////////C	
	public Profesores() {
		super();
	}

	public Profesores(String nombre, String apellido, String dni, String estadoCivil, int anoIncorpo,int numDespacho, String depart) {
		super(nombre, apellido, dni, estadoCivil, anoIncorpo, numDespacho);
		this.depart = depart;
	}

///////////////////////////////GS	
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
}
