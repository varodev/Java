package bucleWhile_doWhile;
import java.util.*;
public class ejeWhile10 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
	 	 
	 int sum = 0;
	 int divisor = 1;
	 
	 System.out.println("introduce un numero");
	 int num = scanner.nextInt();
	 
	 System.out.println("Los numeros propios de " + num + " son ");
	 while(divisor < num) {
		 if (num % divisor == 0) {
			 System.out.println(divisor + "");
			 sum = sum + divisor;
		 }//if
		 divisor++;
	     }//while
	 
         if (num == sum) {
        	 System.out.println("el numero es perfecto");
         }
         else {
        	 System.out.println("el numero no es perfecto");
         }
scanner.close();
	}//main
}//ejeWhile10
