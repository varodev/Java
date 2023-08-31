import java.util.Scanner;

public class Ejercicio_ParámetroEdad {

	static void comprobarEdad (int edad) {
		
		if (edad >= 18) {
		
			System.out.println("Es mayor de edad");
		} 
		
		else
			System.out.println("Es menor de edad");
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserta tu edad: ");
		
		int edad = input.nextInt();
		
		comprobarEdad(edad);
		
	}

}
