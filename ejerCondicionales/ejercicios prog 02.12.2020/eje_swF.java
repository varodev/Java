package ejerciciosRepaso;
import java.util.*;
public class eje_swF {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce la temperatura en grados centigrados");
	       int temp = scanner.nextInt();
	       
	      if (temp <= 10){
          System.out.println("el clima es frio");	    	  
	      }
	      else if (temp < 10 && temp <= 20){
	      System.out.println("el clima es nublado");	    	  
	      }
	      else if (temp < 20 && temp <= 30){
	      System.out.println("el clima es caluroso");	    	  
	      }
	      else {
	      System.out.println("el clima es tropical");
	      }
scanner.close();
    }//main
}//eje_swF
