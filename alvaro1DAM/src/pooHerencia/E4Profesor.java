package pooHerencia;

public class E4Profesor extends E4Persona {
	private String idProfesor;

///////////////////C
	public E4Profesor() {
		super();
	}

	public E4Profesor(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad);
		this.idProfesor=idProfesor;
	}
	
//////////////////GS
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public void mostrarDatos() {
	System.out.println(getNombre() + " " + getApellidos() + " " + getEdad() + " " + getIdProfesor());	
	}
}
