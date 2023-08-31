package ev3.ejercicios.cuenta;

public class CuentaNoPermisiva {

	// ATRIBUTOS

	private String nombreTitular;
	private String apellidosTitular;
	private double saldo;


	// MAIN

	public static void main(String[] args) {

		CuentaNoPermisiva cuentaNoPermisiva = new CuentaNoPermisiva("Pedro", null, 300);
		System.out.println("¡Bienvenido " + cuentaNoPermisiva.getNombreTitular() + "!");
	}


	// CONSTRUCTORES

	public CuentaNoPermisiva(String nombreTitular, String apellidosTitular, double saldo) {

		if(nombreTitular == null || apellidosTitular == null) {

			throw new IllegalArgumentException();
		}

		this.nombreTitular = nombreTitular;
		this.apellidosTitular = apellidosTitular;
		this.saldo = saldo;
	}

	public CuentaNoPermisiva(String nombreTitular) {

		this(nombreTitular, "Desconocido", 0);
	}

	//		public Cuenta(String apellidosTitular) {
	//			
	//		}

	public CuentaNoPermisiva() {

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
