import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase {

	public static void main(String[] args) {
		
		
		
		System.out.println(pedirPorTeclado());
		
		
	}
	
	static int pedirPorTeclado() {
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Por favor, introduzca un numero: ");
			int numero = scanner.nextInt();
			
			return numero;
			
		} catch (InputMismatchException e) {

			System.out.println("Tiene que introducir un número entero...");
			return pedirPorTeclado();
		}
		
	}

}

