package ev3.ejercicios.empresa;

public class Principal {

	public static void main(String[] args) {

		Persona persona = new Persona("Ramón", "Román Pérez", 12345678);
		
		
		// NOMBRE
		String nombre = persona.getNombre();
		nombre.toUpperCase();
		System.out.println("Nombre = " + persona.getNombre());
		
		
		// APELLIDOS
		String apellidos = persona.getApellidos();
		apellidos = "Hola";
		System.out.println("Apellidos = " + persona.getApellidos());
		
		
		// DNI
		int dni = persona.getNumeroDni();
		dni = 20;
		System.out.println("DNI = " + persona.getNumeroDni());
		
		
		// DIRECCIÓN
		Direccion direccion = persona.getDireccion();
		
//		direccion = new Direccion("hola", 20, "adiós", 900);
		
//		System.out.println("persona.direccion = " + persona.direccion);
//		System.out.println("direccion ANTES = " + direccion);
		
		direccion.setCalle("hola");
		direccion.setNumero(20);
		direccion.setCiudad("adiós");
		direccion.setCodigoPostal(300);
		
//		System.out.println("direccion DESPUÉS = " + direccion);

		System.out.println(persona.getDireccion());
	}

}
