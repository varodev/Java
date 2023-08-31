package clases;

public class Telefonos {
	
	String marca;
	String modelo;
	int numero;
	
	public void imprimirNumero() {
		System.out.println(this.numero);
	}
	
	
	public Telefonos (String marca2, String modelo2, int numero2) {
		marca=marca2;
		modelo=modelo2;
		numero=numero2;
	}
}
