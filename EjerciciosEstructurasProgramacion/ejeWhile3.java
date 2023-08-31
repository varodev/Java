package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile3 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero");
int num = scanner.nextInt();

	while(num!=0) {
		if (num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		System.out.println("introduce un numero");
		num = scanner.nextInt();
	}//while
scanner.close();
	}//main
}//ejeWhile3
