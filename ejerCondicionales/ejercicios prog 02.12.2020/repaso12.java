package ejerciciosRepaso;
import java.util.*;
public class repaso12 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       System.out.println("introduce primera fecha");
       String fecha1 = scanner.nextLine();
       System.out.println("introduce segunda fecha");
       String fecha2 = scanner.nextLine();
       
       if (fecha1.equals(fecha2)) {
		System.out.println("igual");   
	   }
	   else {
		   System.out.println("distinta");  
	   }
scanner.close();
    }//main
}//repaso12