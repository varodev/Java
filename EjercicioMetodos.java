package ev2.ejercicios;

public class EjercicioMetodos {

	public static void main(String[] args) {

		mostrarResultadoDivision(200.4, 2);
		mostrarResultadoDivision(99.3, 3);
		mostrarResultadoDivision(550.5, 5);
		
	}

	static void mostrarResultadoDivision(double dividendo, double divisor) {
		
		System.out.print("El resultado de dividir " + dividendo + " entre " + divisor + " es: ");
		System.out.println(dividendo / divisor);
	}
}
