package condicionalesIFSwitch;
import java.util.*;
public class Testing3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// rest of your code
			
			System.out.println("introduce tu edad");
			int edad = scanner.nextInt();
			
			
			if (edad >= 18 ) {
				System.out.println("eres mayor de edad");	
			
			}
			else {
				System.out.println("eres menor de edad");
			}
		}	
	}
	
}
				
			
			
			
	

