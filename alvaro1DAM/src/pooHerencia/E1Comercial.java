package pooHerencia;

public class E1Comercial extends E1Empleado {
		//clase Hija, contiene información de comercial (un tipo de empleado)
	private double comision;
////////////C
	public E1Comercial(String nombre, String apellido, int edad, double salario, double comision) {
			super(nombre, apellido, edad, salario);
			this.comision = comision;
	}
	public E1Comercial(String nombre, String apellido, int edad, double comision) {
		super(nombre, apellido, edad);
		this.comision = comision;
	}
	public E1Comercial() {
		super();
	}
	public E1Comercial(String nombre) {
		super(nombre);
	}
/////////////GS
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
///
	public String toString() {
		return super.toString() + " " + comision;
	}
}
