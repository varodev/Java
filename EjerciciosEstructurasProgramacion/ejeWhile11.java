package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile11 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		

int factorPrimo;

System.out.println("introduce un numero");
int num = scanner.nextInt();

factorPrimo = 2;

System.out.println(num + " = ");
while (factorPrimo <= num) {
	if ((num % factorPrimo) == 0) {
		System.out.println(factorPrimo + " ");
		num = num / factorPrimo;
	}
	else {
		factorPrimo++;
		System.out.println();
	}
}//while
scanner.close();
	}//main
}//ejeWhile11
