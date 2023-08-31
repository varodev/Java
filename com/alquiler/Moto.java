package ev3.ejercicios.com.alquiler;

public class Moto {

	// ATRIBUTOS
	
	private String matricula;
	private double cantidadDeCombustible;
	
	// CONTRUCTORES
	
	public Moto(String matricula, double cantidadDeCombustible) {
		this.matricula = matricula;
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	
	// MÉTODOS

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}


	public void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}
}
