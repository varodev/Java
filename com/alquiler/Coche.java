package ev3.ejercicios.com.alquiler;

public class Coche {

	// ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String matricula;
	private double cantidadDeCombustible;
	
	
	// CONTRUCTORES
	
	public Coche(String marca, String modelo, String matricula, double cantidadDeCombustible) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	
	// MÉTODOS

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


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
	
	public Coche copia() {
		return new Coche(marca, modelo, matricula, cantidadDeCombustible);
	}


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", cantidadDeCombustible="
				+ cantidadDeCombustible + "]";
	}
}
