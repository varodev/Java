 package poo;

public class Persona {
	private String nombre; //los atributos se inician con set o constructores
	private String apellido;
	private String calle;
	private int telefono;
	private String [] aficiones;
	
	
	public Persona(String nombre, String apellido, String calle, int telefono, String[] aficiones) {//practicar constructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.calle = calle;
		this.telefono = telefono;
		this.aficiones = aficiones;
	}
			
	public Persona() {// por defecto para que no de error
	}
		
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
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String[] getAficiones() {
		return aficiones;
	}
	public void setAficiones(String[] aficiones) {
		this.aficiones = aficiones;
	}
	
	
	
	
}
