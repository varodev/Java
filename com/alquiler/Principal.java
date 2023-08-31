package ev3.ejercicios.com.alquiler;

public class Principal {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Toyota", "Auris", "3344JJJ", 30);
		Coche coche2 = new Coche("Mercedes", "C220", "2200JJL", 40);
		Coche coche3 = new Coche("Audi", "A4", "6633JJH", 20);
		
		// ...
		
		Cliente cliente = new Cliente("Juan", 1234567, coche3);
		
		Coche coche = cliente.getCoche();
		coche.setCantidadDeCombustible(90);
		
		System.out.println(cliente);
	}
}
