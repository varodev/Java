package BucleFor;
import java.util.*;
public class ejeFor15 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	boolean multi3 = false;
		
		for (i=1; i<6; i++) {
			System.out.println("Introduce numero");
			int numero = scanner.nextInt();
			
			if (numero %3 ==0) {
				multi3 = true;
						}
		}//for
		
		if (multi3 == false) {
			System.out.println("no existen multiplos de 3");
		}else {
			System.out.println("hay multiplos de 3");
		}
}//try
    }//main
}//ejeFor15
