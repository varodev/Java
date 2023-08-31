package BucleFor;
import java.util.*;
public class ejeFor6 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	int sum = 0;
	int sueldoMayores1K = 0;
	
	for (i =1; i<10; i++) {
		System.out.println("introduce el cantidad del sueldo");
		int sueldo = scanner.nextInt();
			
			if (sueldo > 1000) {
				sueldoMayores1K++;
				sum = sum + sueldo;
			}
	}//for
	System.out.println("La suma es " + sum);
	System.out.println("La cantidad de sueldos mayores de 1000€ es " + sueldoMayores1K);
}//try
    }//main
}//ejeFor6
