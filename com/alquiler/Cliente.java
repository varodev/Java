package ev3.ejercicios.com.alquiler;

public class Cliente {

	private String nombreCompleto;
	private int numeroDni;
	private Coche coche;
	
	public Cliente(String nombreCompleto, int numeroDni, Coche coche) {

		this.nombreCompleto = nombreCompleto;
		this.numeroDni = numeroDni;
		this.coche = coche;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getNumeroDni() {
		return numeroDni;
	}

	public void setNumeroDni(int numeroDni) {
		this.numeroDni = numeroDni;
	}

	public Coche getCoche() {
		return coche.copia();
	}

//	public void setCoche(Coche coche) {
//		this.coche = coche;
//	}
	

	@Override
	public String toString() {
		return "Cliente [nombreCompleto=" + nombreCompleto + ", numeroDni=" + numeroDni + ", coche=" + coche + "]";
	}
}
