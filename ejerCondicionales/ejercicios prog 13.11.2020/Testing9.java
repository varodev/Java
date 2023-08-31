package alvaro;
import java.util.*;
public class Testing9 {
    public static void main(String[]args) {
    	try (Scanner scanner = new Scanner(System.in)) {
			           
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
    	
    	}//try
		
    	}//main 
        public static void mostrarResultado (String cadena) {
        	System.out.println(cadena);
    	}//mostrarResultado   
   
}//testing8
			
			
	

