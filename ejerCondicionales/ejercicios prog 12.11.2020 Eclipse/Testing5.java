package alvaro;
import java.util.*;
public class Testing5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int numero = sc.nextInt();
        
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
			
			
	

