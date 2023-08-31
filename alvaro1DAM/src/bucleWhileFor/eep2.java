package bucleWhileFor;
import java.util.*;
public class eep2 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
	
	int num = 0;
		
	System.out.println("Introduce un numero");
	num = scanner.nextInt();
		
	int sum = 0;
	int counter = 0;
	float med = 0;
		
	while (num>0) {
			
			System.out.println("Introduce un numero");
			num = scanner.nextInt();
			sum=sum+num;
			counter++;
			
		}//while
	med = (sum-num)/(counter-1);
	System.out.println("el resultado de la media es: " + med);
	}//try
   }//main
}//eep2
