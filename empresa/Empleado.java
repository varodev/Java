package ev3.ejercicios.empresa;

public class Empleado extends Persona {

	double salario;

	public Empleado() {
		
		super("desconocido", "desconocido", 0);
		this.salario = 0;
	}
	
	public Empleado(String nombre, String apellidos, double salario) {

		super(nombre, apellidos, 0);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void cobrarNomina() {
		
		System.out.println(getNombre() + " recibe " + salario + "€");
	}
}
