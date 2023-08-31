package pooHerencia;

public class E1Repartidor extends E1Empleado {
	//clase Hija, contiene información de repartidor (un tipo de empleado)
	private String zona;
//////C
	public E1Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
		super(nombre, apellido, edad, salario);
		this.zona = zona;
	}
	public E1Repartidor(String nombre, String apellido, int edad, double salario) {
		super();
	}
	public E1Repartidor(String nombre,int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
///////GS
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}  
////
	public String toString() {
		return super.toString() + " " + zona;
	}
}
