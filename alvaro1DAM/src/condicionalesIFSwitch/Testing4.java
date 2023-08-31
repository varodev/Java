package condicionalesIFSwitch;
import java.util.*;
public class Testing4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// rest of your code
			
			
			System.out.println("introduce tu edad");
			int edad = scanner.nextInt();
			
			
			if (edad >= 18 ) {
				System.out.println("eres mayor de edad");	
			
			}
			
			if (edad < 18) {
				System.out.println("eres menor de edad");	
	
			}
			
			if (edad < 0) {
				System.out.println("no existes");
			}
		}	
	}
	
}
				
			
			
			
	

