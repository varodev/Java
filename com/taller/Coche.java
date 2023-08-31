package ev3.ejercicios.com.taller;

public class Coche {

	// ATRIBUTOS
	
	private String marca;
	private String modelo;
	private String matricula;
	private String motorizacion;
	private int potencia;
	private String neumaticos;
	
	
	// CONSTRUCTORES
	
	public Coche(String marca, String modelo, String matricula, String motorizacion, int potencia, String neumaticos) {

		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.motorizacion = motorizacion;
		this.potencia = potencia;
		this.neumaticos = neumaticos;
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

	public String getMotorizacion() {
		return motorizacion;
	}

	public void setMotorizacion(String motorizacion) {
		this.motorizacion = motorizacion;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getNeumaticos() {
		return neumaticos;
	}

	public void setNeumaticos(String neumaticos) {
		this.neumaticos = neumaticos;
	}
}
