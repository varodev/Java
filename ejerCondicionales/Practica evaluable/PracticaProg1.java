package Practica_Programacion1EVA;
import java.util.*;
public class PracticaProg1 {
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		System.out.println("Introduzca su edad");
		int edad = scanner.nextInt();
		System.out.println("Introduzca el tipo de botella, siendo las opciones Ron, Vodka, Whisky");
		String tipo_botella = scanner.next();
		System.out.println("Precio");
		double precio = scanner.nextDouble();
		System.out.println("Cantidad");
		double cantidad = scanner.nextInt();
				
		    if (edad < 18){
          	comprobarVentaGC(edad,tipo_botella,precio,cantidad); 
    		System.out.println("No vender alcohol a menores de edad");		
    		}
    		else {
    		System.out.println("el precio de tus " + cantidad + " botellas de " +  tipo_botella + " , es de " + comprobarVentaGC(edad, tipo_botella, precio, cantidad) + " euros" );
    		}
		    
scanner.close();		
	}//main
 public static double comprobarVentaGC(int edad,String tipo_botella,double precio, double cantidad){
        double precioTotal = 0;	
        switch (tipo_botella) {
		case "Ron":
			if (edad >=18) {
	    		precioTotal = precio * cantidad;
	    	}
		    else {
				   System.out.println(edad = -1);
	    	}	
		break;
		case "Vodka":
			if (edad >=18) {
	    		precioTotal = precio * cantidad;
	    	}
		    else {
				   System.out.println(edad = -1);
	    	}
		break;
		case "Whisky":
			if (edad >=18) {
	    		precioTotal = precio * cantidad;
	    	}
		    else {
				   System.out.println(edad = -1);
	    	}
		break;
		}//switch
    	return precioTotal;
    }//comprobarVentaGC
}//PracticaProg1
