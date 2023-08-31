package BucleFor;
import java.util.*;
public class ejeFor12 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	int sueldoMax = 0;
	
	System.out.println("Numero de sueldos: ");
	int n = scanner.nextInt();
	
	for (i=1; i<n; i++) {
		System.out.println("Introduce sueldo: ");
		int sueldo = scanner.nextInt();
		
		if (sueldo > sueldoMax) {
			sueldoMax = sueldo;
		}
	}//for
	System.out.println("El sueldo máximo es: " + sueldoMax);
}//try
    }//main
}//ejeFor12
