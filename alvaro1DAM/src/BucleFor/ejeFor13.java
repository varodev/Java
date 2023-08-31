package BucleFor;
import java.util.*;
public class ejeFor13 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	boolean hayNeg=false;
	
		for (i=1; i<10; i++) {
			System.out.println("Introduce numero");
			int numero = scanner.nextInt();
			
			if (numero <0) {
				hayNeg=true;
			}
		}//for
		
		if (hayNeg == true) {
			System.out.println("Se ha introducido algun numero negativo");
		}else {
			System.out.println("No se ha introducido ningun numero negativo");
		}
}//try
    }//main
}//ejeFor13
