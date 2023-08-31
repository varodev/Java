package agenda3Eva;

public abstract class persona /*implements Comparable*/ {
	protected String nombre;
	protected String apellidos;
	protected String mail;
	protected String telefono;
	
	//////////////////CONSTRUCTORES
	public persona() {
		super();
	}

	public persona(String nombre, String apellidos, String mail, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
		this.telefono = telefono;
	}

	////////////////////////////GETTERS & SETTERS
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
	
	//METODO toString
	public String toString() {
		return nombre + " " + apellidos + " " + mail + " " + telefono + " ";
	}
	
	/*@Override
	public int compareTo(persona stu) {
		String compareage = ((persona)stu).getTelefono();
		return this.telefono-compareage;
	}*/
	
	
}
