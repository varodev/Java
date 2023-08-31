package ejerciciosRepaso;
import java.util.*;
public class eje_swG {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce numero");
	       int numero = scanner.nextInt();
	       
	       int modulo = (numero % 10);
	       
	       if (modulo == 0){
	       System.out.println("el numero " + numero + " es multiplo de 10");	    	  
	       }
	       else {
	       System.out.println("el numero " + numero + " no es multiplo de 10");
	       }
scanner.close();
    }//main
}//eje_swG
