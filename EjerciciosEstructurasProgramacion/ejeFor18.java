package BucleFor;
import java.util.*;
public class ejeFor18 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	System.out.println("Introduce a: ");
	double a = scanner.nextDouble();
	
	System.out.println("Introduce b:");
	int b = scanner.nextInt();
	
	int i;
	double potencia = 1;
	
	for(i=0; i<b; i++) {
		
		potencia = potencia*a;
		
	}//for
	System.out.println("La potencia de a " + a + ", elevado a b " + b + " es " + potencia);	
	
}//try
	
	}//main
}//ejeFor18
