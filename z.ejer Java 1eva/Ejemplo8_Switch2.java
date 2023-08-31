import java.util.Scanner;

public class Ejemplo8_Switch2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserte una letra (a, b, c o d): ");
		String letra = entrada.nextLine();
		String letra2=letra.toUpperCase();
		switch (letra2) {
		case "A":
			System.out.println("Ha insertado una '" + letra + "'");
			break;
		case "B":
			System.out.println("Ha insertado una '" + letra + "'");
			break;
		case "C":
			System.out.println("Ha insertado una '" + letra + "'");
			break;
		case "D":
			System.out.println("Ha insertado una '" + letra + "'");
			break;
		default:
			System.out.println("Ha insertado una letra no válida");
		
		}

		entrada.close();
	}

}
