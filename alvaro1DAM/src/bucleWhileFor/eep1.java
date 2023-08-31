package bucleWhileFor;
import java.util.*;
public class eep1 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
	
	int numero = 0;
	int sum = 0;
	
	System.out.println("Introduce un numero");
	numero = scanner.nextInt();
		
		while (numero!=0) {
			sum+=numero;
			System.out.println("Introduce un numero");
			numero = scanner.nextInt();	
			
		}//while
	System.out.println("el resultado de la suma es: " + sum);
	
}//try
   }//main
}//eep1
