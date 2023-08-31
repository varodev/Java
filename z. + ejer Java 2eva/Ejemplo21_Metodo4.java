import java.util.Scanner;

public class Ejemplo21_Metodo4 {
	
	static String input1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserta dato:");
		String dato = entrada.next();
		entrada.close();
		return dato;

	}

	public static void main(String[] args) {
		String dato1 = input1();

		System.out.println(dato1);
		
	}

}
