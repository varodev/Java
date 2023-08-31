package ev3.ejercicios;

import ev3.ejercicios.cuenta.Cuenta;

public class EjercicioParametrosMetodo {

	public static void main(String[] args) {

//		// PARTE 1
//		
//		int numero = 10;
//		
//		System.out.println("Antes de llamar al método = " + numero);
//		
//		parametroPrimitivo(numero);
//		
//		System.out.println("Después de llamar al método = " + numero);
		
		
		// PARTE 2
		
		Cuenta cuenta = new Cuenta("Carlos", "Gómez", 1400);
		
		System.out.println("Antes de llamar al método = " + cuenta.getNombreTitular());
		
		parametroObjeto(cuenta);
		
		System.out.println("Después de llamar al método = " + cuenta.getNombreTitular());
	}
	
	static void parametroPrimitivo(int numero) {
		
		System.out.println("Dentro del método (antes) = " + numero);
		
		numero = 30;
		
		System.out.println("Dentro del método (después) = " + numero);
	}
	
	static void parametroObjeto(Cuenta cuenta) {
		
		System.out.println("Dentro del método (antes) = " + cuenta.getNombreTitular());
		
		cuenta.setNombreTitular("Marcos");
		
		System.out.println("Dentro del método (después) = " + cuenta.getNombreTitular());
	}

}
