package agenda3Eva;

public class familiares extends persona {
	private String direccionV;
	private String parentesco;//cercana o lejana
	
	/////////////////////////CONSTRUCTORES
	public familiares() {
		super();
	}
	
	public familiares(String nombre, String apellidos, String mail, String telefono, String direccionV, String parentesco) {
		super(nombre, apellidos, mail, telefono);
		this.direccionV=direccionV;
		this.parentesco=parentesco;
	}

	/////////////////////////////////GETTER & SETTER
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

	public String getDireccionV() {
		return direccionV;
	}

	public void setDireccionV(String direccionV) {
		this.direccionV = direccionV;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	//METODO toString	
	public String toString() {
		return super.toString() + " " + direccionV + " " + parentesco;
    }

	/*@Override
	public int compareTo() {
		// TODO Auto-generated method stub
		return super.compareTo(stu);
	}*/
	
	
}
