package pooHerencia;

public class E2Empleado extends E2Persona {
	private double sueldo;
	private int comision;
	
///////////////////////////C	
	public E2Empleado() {
		super();
	}
	public E2Empleado(String nombre, String apellidos, int edad, double sueldo, int comision) {
		super(nombre, apellidos, edad);
		this.sueldo = sueldo;
		this.comision = comision;
	}
	
	////////////////////////////GS
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	
	public double calculeTotalCobrado() {
		double total=0;
		if(sueldo >0 && comision >0) {
			total =sueldo + comision;
		}else {
			System.out.println("algo mal estas haciendo");
		}
		return total;
	}
}
