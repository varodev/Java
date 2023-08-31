package BucleFor;
import java.util.*;
public class ejeFor4 {
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
		int i;
		double factorizacion = 1;
		
	 System.out.println("introduce un número: ");
     int numero = scanner.nextInt();
		
		for (i=numero; i>0; i--) {
			factorizacion *= i;
scanner.close();			
		}
			System.out.println("Factorial de " + numero + " es " + factorizacion);
	}//main
}//ejeFor4
