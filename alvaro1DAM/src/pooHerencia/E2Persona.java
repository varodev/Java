package pooHerencia;

public class E2Persona {
protected String nombre;
protected String apellidos;
protected int edad;

////////////////////C
public E2Persona() {
	super();
}

public E2Persona(String nombre, String apellidos, int edad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
}

public E2Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}

public E2Persona(String nombre) {
	super();
	this.nombre = nombre;
}

public E2Persona(int edad) {
	super();
	this.edad = edad;
}

///////////////////////GS
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

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}




}
