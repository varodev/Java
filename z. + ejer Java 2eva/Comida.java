package clases;

public class Comida {
	
	String tipo = "Pescado";
	double precio = 4.3;
	boolean caliente = true;

	public void imprimir() {
		System.out.println("Tipo de comida");
	}
	
	
	public static void main(String[] args) {
		
		Comida comidaLunes = new Comida ();
		System.out.println("El precio de " + comidaLunes.tipo + " con un precio de " + comidaLunes.precio);
		comidaLunes.imprimir();
	}

}
