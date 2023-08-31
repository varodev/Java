package ev3.ejercicios.cuenta;

public class Principal {
	
	public static void main(String[] args) {

//		int numero = 10;
//		
//		System.out.println("Antes de llamar al método = " + numero);
//		
//		metodoPrimitivo(numero);
//		
//		System.out.println("Después de llamar al método = " + numero);
		
		
		Cuenta cuenta = new Cuenta("Mario", "Pérez", 250);
		
		System.out.println("Antes de llamar al método = " + cuenta.getNombreTitular());
		
		metodoObjeto(cuenta);
		
		System.out.println("Después de llamar al método = " + cuenta.getNombreTitular());
		
	}
	
	public static void metodoObjeto(Cuenta parametroCuenta) {
		
		System.out.println("Dentro del método (antes) = " + parametroCuenta.getNombreTitular());

		parametroCuenta.setNombreTitular("Luis");
		
		System.out.println("Dentro del método (depués) = " + parametroCuenta.getNombreTitular());
	}
	
	public static void metodoPrimitivo(int parametroNumerico) {
		
		System.out.println("Dentro del método (antes) = " + parametroNumerico);

		parametroNumerico = 50;
		
		System.out.println("Dentro del método (depués) = " + parametroNumerico);
	}

}
