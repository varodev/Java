package ejerciciosRepaso;
import java.util.*;
public class eje_swE {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("Welcome to Tio Pepe's store");
           System.out.println("introduce el monto");
	       int monto = scanner.nextInt();
	       System.out.println("introduce que dia de la semana es hoy");
	       String caracter = scanner.next();
	       
	       double descuento = monto - (monto * 0.21);
	       
	     switch (caracter){
	    	   case "lunes":  
	    	   System.out.println("no hay descuento");
	    	   System.out.println("el precio es " + monto + " euros");
	    	   break;
	    	   case "martes":  
		       System.out.println("promocion del 21% " + descuento + " euros");
		       break;
	    	   case "miercoles":  
	    		   System.out.println("no hay descuento");
	    		   System.out.println("el precio es " + monto + " euros");
		       break;
	    	   case "jueves":  
	    		   System.out.println("promocion del 21% " + descuento + " euros");
		       break;
	    	   case "viernes":  
	    		   System.out.println("no hay descuento");
	    		   System.out.println("el precio es " + monto + " euros");
		       break;
	    	   case "sabado":  
	    		   System.out.println("no hay descuento");
	    		   System.out.println("el precio es " + monto + " euros");
		       break;
	    	   case "domingo":  
	    		   System.out.println("no hay descuento");
	    		   System.out.println("el precio es " + monto + " euros");
		       break;
		       default:
	    	   System.out.println("algo mal estas haciendo");
	       }
scanner.close();
    }//main
}//eje_swE
