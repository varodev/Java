package condicionalesIFSwitch;
import java.util.*;
public class Testing9 {
    public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("nombre del cliente");
        String cliente = scanner.nextLine();
        System.out.println("cantidad de articulos comprados");
        int articulos = scanner.nextInt();

        if(articulos<5) {
			System.out.println("efectivo");
		} 
        else if (articulos>5 && articulos<12) {
			System.out.println("tarjeta");
        }
        else {
        	System.out.println("cheque");
        }
        
        System.out.println(cliente + " ha comprado la cantidad de " + articulos + " articulos.");
        
scanner.close();
    }//main  	
}//testing9
			
			
	


