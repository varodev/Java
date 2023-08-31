package ev3.ejercicios.com.controlador;

import ev3.ejercicios.com.taller.Coche;

public class Principal {

	public static void main(String[] args) {

		Coche cocheTaller = new Coche("PEUGEOT", "307", "1234GJK", "1.4", 110, "55\"");
		
		ev3.ejercicios.com.alquiler.Coche cocheAlquiler = new ev3.ejercicios.com.alquiler.Coche("MAZDA", "MX-5", "4567LLL", 50.1);
	}

}
