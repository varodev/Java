package pooHerencia;

public class E1Empleado { //clase Padre
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
////////////////////////////GS
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
////////////////////////////////C
	public E1Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}
	public E1Empleado() {
		super();
	}
	
	public E1Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	public E1Empleado(String nombre, String apellido, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	public E1Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
//////
	public boolean compruebaNombre() {
		if(nombre.equals("")) {
			return false;
		}else {
			return true;
		}
	}
	//crear un método que me va a sumar un plus al salario de aquellos empleados que tienen más de 40años, me va a devolver un boolean
	public boolean plus (double sueldoPlus) {
		   boolean aumento = false;
		if (edad>40 && compruebaNombre()) {
			salario=salario+sueldoPlus;
			aumento=true;
		}
		return aumento;
	}
	
	public String toString() {
		return nombre + " " + apellido + " " + edad + " " + salario + " ";
	}
	
	
	
	
	
	
	
	
	
	
	

}
