package condicionalesIFSwitch;
import java.util.*;
public class Testing11 {
    public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
 System.out.println("introduce la numero comprendido entre 0 y 9999");
 int numero = scanner.nextInt();
            
            System.out.println(calcularLongitud(numero));
            
scanner.close();
    }//main 
   public static int calcularLongitud (int numero) {
	 	    
	   if(numero>0 && numero <=9999) {
			System.out.println("Longitud correcta");
	   } 
       else {
			System.out.println("Longitud incorrecta");
       }
	   return numero;
   }//calcularLonguitud
}//testing11
			
			
	

