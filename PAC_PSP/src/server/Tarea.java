package server;

public class Tarea {
	/*String descripcion
	  String estado.*/
	private String descripcion;
	private String estado;

	//Constructor
	public Tarea(String descripcion, String estado) {
		this.descripcion = descripcion;
		this.estado = estado;
	}

	//Getters & Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
			
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	//Método toString para visualizar los datos.
	public String toString() {
		return "descripcion: " + descripcion + ", con estado: " + estado;
	}
}
