package ejerciciosRepaso;
import java.util.*;
public class repaso13 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       System.out.println("introduce primera fecha");
		System.out.println("introduce dia");
		int dia1 = scanner.nextInt();
		System.out.println("introduce mes");
		int mes1 = scanner.nextInt();
		System.out.println("introduce año");
		int anno1 = scanner.nextInt();
	
		System.out.println("introduce segunda fecha");
		  System.out.println("introduce dia");
		  int dia2 = scanner.nextInt();
		  System.out.println("introduce mes");
	      int mes2 = scanner.nextInt();
	      System.out.println("introduce año");
	      int anno2 = scanner.nextInt();
	      
	     if (dia1 != dia2 || mes1 != mes2 || anno1 != anno2) {
	      int difdias = (dia2-dia1) + (30*(mes2-mes1)+ (365*(anno2-anno1))); 
		  System.out.println("la diferencia de dias es " + difdias);
	     }
	     else {
	    	 System.out.println("algo estas haciendo mal");
	     }
scanner.close();
    }//main
}//repaso13