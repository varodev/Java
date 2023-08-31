package condicionalesIFSwitch;
import java.util.*;
public class eje_swB {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.println("pedir un numero entre 0 y 99999 y decir cuantas cifras tiene");
	       int num = scanner.nextInt();

	       if (num >0 && num < 100000) {
	       
	       if(num<10) {
	    	   System.out.println("tiene 1 cifra");
	       }
	       else if(num<100) {
	    	   System.out.println("tiene 2 cifras");
	       }	   
	       else if(num<1000) {
	    	   System.out.println("tiene 3 cifras");
	       }   
	       else if(num<10000) {
	    	   System.out.println("tiene 4 cifras");
	       }
	       else if(num<100000){
	    	   System.out.println("tiene 5 cifras");
	       }
	       }//if num > 0 && num < 10
	       else {
	    	   System.out.println("algo estas haciendo mal");
	       }//else
scanner.close();
    }//main
}//eje_swB
