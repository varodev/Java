package ev3.ejercicios.empresa;

public class Persona {

	// ATRIBUTOS
	
	private String nombre;
	private String apellidos;
	
	private int numeroDni;

	public Direccion direccion;
	
	
	// CONSTRUCTORES

//	public Persona() {}

	public Persona(String nombre, String apellidos, int numeroDni) {

		this(nombre, apellidos, numeroDni, new Direccion("desconocida", 0, "desconocida", 0));
	}

	public Persona(String nombre, String apellidos, int numeroDni, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroDni = numeroDni;
		this.direccion = direccion;
	}
	
	
	// MÉTODOS

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

	public int getNumeroDni() {
		return numeroDni;
	}

	public void setNumeroDni(int numeroDni) {
		this.numeroDni = numeroDni;
	}

	public Direccion getDireccion() {
		
//		return direccion;
		return direccion.copia();
	}

//	public void setDireccion(Direccion direccion) {
//		this.direccion = direccion;
//	}
}
