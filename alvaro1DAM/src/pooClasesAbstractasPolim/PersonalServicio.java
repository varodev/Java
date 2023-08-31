package pooClasesAbstractasPolim;

public class PersonalServicio extends Empleados {
	private String seccion;

////////////////////////////////C	
	public PersonalServicio() {
		super();
	}

	public PersonalServicio(String nombre, String apellido, String dni, String estadoCivil, int anoIncorpo,int numDespacho, String seccion) {
		super(nombre, apellido, dni, estadoCivil, anoIncorpo, numDespacho);
		this.seccion = seccion;
	}

/////////////////////////////////GS	
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}
