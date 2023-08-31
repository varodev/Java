package ev3.ejercicios.cuenta;

public class Cuenta {

	// ATRIBUTOS
	
	private String nombreTitular;
	private String apellidosTitular;
	private double saldo;
	
	
	// MAIN
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("Manuel", "Gómez", 100);
	}
	
	
	// CONSTRUCTORES
	
	public Cuenta(String nombreTitular, String apellidosTitular, double saldo) {
		
		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.saldo = saldo;
	}
	
	public Cuenta(String nombreTitular) {
		
		this(nombreTitular, "Desconocido", 0);
	}
	
//	public Cuenta(String apellidosTitular) {
//		
//	}
	
//	public Cuenta() {
//		
//		this("Desconocido", "Desconocido", 0);
//	}
	
	
	// MÉTODOS

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getApellidosTitular() {
		return apellidosTitular;
	}

	public void setApellidosTitular(String apellidosTitular) {
		this.apellidosTitular = apellidosTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double calcularInteresesAnuales() {
		
		return saldo * 0.005;
	}


	@Override
	public String toString() {
		return "Cuenta [nombreTitular=" + nombreTitular + ", apellidosTitular=" + apellidosTitular + ", saldo=" + saldo
				+ "]";
	}
}
