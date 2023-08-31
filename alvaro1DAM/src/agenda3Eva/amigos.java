package agenda3Eva;

public class amigos extends persona {
	private int afinidad;//un entero entre 1 y 5, siendo 1 el grado de menor afinidad y 5 el de mayor afinidad
	
	/////////////////CONSTRUCTORES
	public amigos() {
		super();
	}

	public amigos(String nombre, String apellidos, String mail, String telefono, int afinidad) {
		super(nombre, apellidos, mail, telefono);
		this.afinidad = afinidad;
	}

	///////////////////////////GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}

	//METODO toString
	public String toString() {
		return super.toString() + " " + afinidad;
	}
	
	/*@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	
	
	
}
