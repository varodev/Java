package ev3.ejercicios.empresa;

public class Directivo extends Empleado {

	double bonus;
	
	public Directivo(String nombre, String apellidos, double salario, double bonus) {
		
		super(nombre, apellidos, salario);
		this.bonus = bonus;
	}
	
	public void metodo() {
		
		setNombre("Mario");
	}
}
