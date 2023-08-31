package ejeEstrucProg;
import java.util.*;
public class eep7 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
	
	int i;
	double factorizacion = 1;
	
 System.out.println("introduce un número: ");
 int numero = scanner.nextInt();
	
	for (i=numero; i>0; i--) {
		factorizacion *= i;
scanner.close();			
	}
		System.out.println("Factorial de " + numero + " es " + factorizacion);
	
}//try
   }//main
}//eep7
