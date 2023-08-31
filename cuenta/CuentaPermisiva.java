package ev3.ejercicios.cuenta;

public class CuentaPermisiva {

	// ATRIBUTOS

	private String nombreTitular;
	private String apellidosTitular;
	private double saldo;


	// MAIN

	public static void main(String[] args) {

		CuentaPermisiva cuentaPermisiva = new CuentaPermisiva(null);
	}


	// CONSTRUCTORES

	public CuentaPermisiva(String nombreTitular, String apellidosTitular, double saldo) {

		if(nombreTitular == null) {

			nombreTitular = "Desconocido";
		}

		if(apellidosTitular == null) {

			apellidosTitular = "Desconocido";
		}

		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.saldo = saldo;
	}

	public CuentaPermisiva(String nombreTitular) {

		this(nombreTitular, "Desconocido", 0);
	}

	//		public Cuenta(String apellidosTitular) {
	//			
	//		}

	public CuentaPermisiva() {

		this("Desconocido", "Desconocido", 0);
	}


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
}
