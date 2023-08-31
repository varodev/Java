package pooHerencia;

public class E4ProfesorTitular extends E4Profesor {
	private int antiguedad;

////////////////////////////////C		
	public E4ProfesorTitular() {
		super();
	}

	public E4ProfesorTitular(String nombre, String apellidos, int edad, String idProfesor, int antiguedad) {
		super(nombre, apellidos, edad, idProfesor);
		this.antiguedad = antiguedad;
	}

////////////////////////////////GS
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void mostrarDatos() {
		System.out.println(getNombre() + " " + getApellidos() + " " + getEdad() + " " + getIdProfesor() + " " + getAntiguedad());
		}
	
	

}
