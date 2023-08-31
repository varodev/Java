package clases;

public class Coche {
	
	String color = "azul";
	int puertas = 3;

	public static void main(String[] args) {
		
		Coche micoche = new Coche();
		Coche cochedemivecino = new Coche();
		System.out.println("Mi coche tiene el color " + micoche.color);
		System.out.println("Mi coche tiene "+micoche.puertas + " puertas");
		System.out.println("El coche de mi vecino es de color " + cochedemivecino.color);
		
	}

}
