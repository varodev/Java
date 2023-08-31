package pooHerencia;

public class E4ProfesorInterino extends E4Profesor {
	private int fechaComienzoInterinidad;

/////////////////////////////////C	
	public E4ProfesorInterino() {
		super();
	}

	public E4ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor,int fechaComienzoInterinidad ) {
		super(nombre, apellidos, edad, idProfesor);
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}
	
////////////////////////////////GS
	public int getFechaComienzoInterinidad() {
		return fechaComienzoInterinidad;
	}

	public void setFechaComienzoInterinidad(int fechaComienzoInterinidad) {
		this.fechaComienzoInterinidad = fechaComienzoInterinidad;
	}
	
	public void mostrarDatos() {
		System.out.println(getNombre() + " " + getApellidos() + " " + getEdad() + " " + getIdProfesor() + " " + getFechaComienzoInterinidad());
		}
	

}
