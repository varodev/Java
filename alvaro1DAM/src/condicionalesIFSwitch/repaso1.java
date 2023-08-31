package condicionalesIFSwitch;
import java.util.*;
public class repaso1 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	 
	 double x1, x2, d;
	 
	 System.out.println("introduce valor de a");
	 double a = scanner.nextDouble();
	 System.out.println("introduce valor de b");
	 double b = scanner.nextDouble();
	 System.out.println("introduce valor de c");
	 double c = scanner.nextDouble();
	 
	 d = (Math.pow(b, 2)-4*a*c);
	 
	 if (d<0) {
		 System.out.println("no hay soluciones reales"); 	
	 }
	 else {
		x1 = (-b+Math.sqrt(d))/(2*a); 
		x2 = (-b-Math.sqrt(d))/(2*a); 
		System.out.println("el resultado es " + x1);
		System.out.println("el resultado es " + x2);
	 }
scanner.close();
    }//main
}//repaso1