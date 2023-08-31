package BucleFor;
import java.util.*;
public class ejeFor2 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);		
		int i;
		int sumatotal=0;
		
		for (i=1; i<15; i++) {
			System.out.println("Introduce un número: ");
			int numero = scanner.nextInt();
			
			sumatotal = sumatotal + numero;
scanner.close();
		}
			System.out.println("El sumatorio total es: " + sumatotal );
		
	}//main
}//ejeFor2
