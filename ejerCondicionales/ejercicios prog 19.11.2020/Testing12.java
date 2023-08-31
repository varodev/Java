package alvaro;
import java.util.*;
public class Testing12 {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in); 
		
    		System.out.println("introduce el primer numero");
            int numero1 = scanner.nextInt();
            System.out.println("introduce el segundo numero");
            int numero2 = scanner.nextInt();
           
            
            
            String resultado = comprobarNumeros (numero1, numero2);
            System.out.println("Al escribir el número se deduce que el " + resultado);
    	
            
            
            scanner.close();
    }//main 
   public static String comprobarNumeros (int numero1, int numero2) {
	   String calc = null;
	   
	   if(numero1 > numero2) {
			calc = "primero numero es mayor que el segundo";
	   } 
       else if (numero1 < numero2) {
			calc = "primero numero es menor que el segundo";
       }
       else {
    	   calc = "primero numero y segundo numero son iguales";
       }
	   return calc;
   }//calcularLonguitud
     
}//testing12
			
			
	

