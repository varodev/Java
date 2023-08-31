package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile2 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero");
int num = scanner.nextInt();

	while(num!=0) {
		if (num>0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		System.out.println("introduce un numero");
		num = scanner.nextInt();
	}//while
scanner.close();
	}//main
}//ejeWhile2
