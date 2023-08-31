package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile1 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);	

System.out.println("introduce un numero");
int num = scanner.nextInt();
int cuadrado = (int)Math.pow(num, 2);

while (num >= 0) {
	System.out.println(num + " es igual a " + cuadrado);
	System.out.println("introduce un numero");
	num = scanner.nextInt();
}//while
	System.out.println("el numero es " + num); 
scanner.close();
	}//main
}//ejeWhile1
