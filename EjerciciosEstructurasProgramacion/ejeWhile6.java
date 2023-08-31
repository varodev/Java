package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile6 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		

int num = 0;
int sum = 0;

do {
	System.out.println("introduce un numero");
	num = scanner.nextInt();	
	sum = sum + num;
}
while (num !=0); 

System.out.println("el resultado de la suma es " + sum);
scanner.close();
	}//main
}//ejeWhile6
