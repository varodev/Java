package condicionalesIFSwitch;
import java.util.*;
public class eje_swD {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce primer precio");
	       int precioP = scanner.nextInt();
	       System.out.println("introduce segundo precio");
	       int precioS = scanner.nextInt();
	       System.out.println("introduce tercer precio");
	       int precioT = scanner.nextInt();
	       
	       System.out.println("Modalidad de pago, c para contado y t para tarjeta");
	       String caracter = scanner.next();
	              
	       double precioPdescuento = precioP - (precioP * 0.05);
	       double precioPincremento = precioP + (precioP * 0.03);
	       double precioSdescuento = precioS - (precioS * 0.05);
	       double precioSincremento = precioS + (precioS * 0.03);
	       double precioTdescuento = precioT - (precioT * 0.05);
	       double precioTincremento = precioT + (precioT * 0.03);
	       
	       switch (caracter){
	    	   case "c":  
	    	   System.out.println(precioPdescuento + " euros");
	    	   System.out.println(precioSdescuento + " euros");
	    	   System.out.println(precioTdescuento + " euros");
	    	   break;
	    	   case "t":  
		       System.out.println(precioPincremento + " euros");
		       System.out.println(precioSincremento + " euros");
		       System.out.println(precioTincremento + " euros");
		       break;
		       default:
	    	   System.out.println("algo mal estas haciendo");
	       }
scanner.close();
    }//main
}//eje_swD
