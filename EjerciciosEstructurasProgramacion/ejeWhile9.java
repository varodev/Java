package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile9 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero N");
int num = scanner.nextInt();

int sum = 0;

while (num>0) {
	sum = sum + num;
	num = num - 1;
}//while
System.out.println("\nLa suma es: " + sum);
scanner.close();
	}//main
}//ejeWhile9
