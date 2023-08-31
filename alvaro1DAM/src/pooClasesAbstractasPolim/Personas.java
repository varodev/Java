package pooClasesAbstractasPolim;

public abstract class Personas {
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String estadoCivil;
	
	/////////////////////////////////////////////////////////////////////////////////C
	public Personas(String nombre, String apellido, String dni, String estadoCivil) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}

	public Personas() {
		super();
	}

///////////////////////////////////GS	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
}
