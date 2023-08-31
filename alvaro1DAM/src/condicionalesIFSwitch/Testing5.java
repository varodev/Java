package condicionalesIFSwitch;
import java.util.*;
public class Testing5 {
    public static void main(String[]args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			           
        System.out.println("Dime tu edad");
        int numero = scanner.nextInt();
        
        if(numero>=18){
            System.out.println("Eres mayor de edad" );
        }
        else if (numero>0){
            System.out.println("Eres menor de edad");
        }
        else {
            System.out.println("Tu no has nacido");
            
          }
        
    	}   
        
    }

 

}
			
			
	

