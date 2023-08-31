import java.util.Scanner;

//Ejemplo de input.

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("El número PI es "+ Math.PI);
		System.out.println("Inserta un número entero:");
		int entero = input.nextInt();
		System.out.println("El número insertado es el " + entero);
		System.out.println("Inserta un número float:");
		float decimal = input.nextFloat();
		System.out.println("El numero insertado es " + decimal);
		System.out.println("Inserte su nombre: ");
		String nombre = input.next();
		System.out.println("Buenas tardes "+nombre);
		System.out.println("Inserte un número entero: ");
		String num = input.next();
		System.out.println("El número multiplicado por 1000 es: "+(Float.parseFloat(num)*1000));
		//Pasar de un string a un float. Un entero se haría con Integer.parseInt(num)
		input.close();
	}

}
