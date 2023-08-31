package ev1.ejercicios;

public class EjercicioOperadorTernario {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int division = a / b;
		
		boolean esPar = division%2 == 0 ? true : false;
		
		System.out.println(division);
		System.out.println("¿es par? = " + esPar);
		
	}

}
