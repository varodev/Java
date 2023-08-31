package clases;

public class Ordenador_2 {

	String marca = "Dell";
	String tipo = "Portátil";
	String RAM = "8Gb";
	String CPU = "Core i5";
	
	
	public static void main(String[] args) {
		Ordenador_2 miordenador = new Ordenador_2();
		System.out.println("Mi ordenador es de tipo "+miordenador.tipo+".");
		//Me he cambiado de ordenador.
		miordenador.tipo = "Sobremesa";
		miordenador.marca = "HP";
		miordenador.CPU = "Core i7";
		System.out.println("Mi ordenador es de marca "+miordenador.marca + " de tipo " + miordenador.tipo+".");
		//Acceder a otra clase
		Coche mycoche = new Coche();
		System.out.println("Mi coche es de color "+mycoche.color);

	}

}
