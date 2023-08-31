package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile7 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero");
int num = scanner.nextInt();

int sum = 0;
float media = 0;
int contador = 0;

while (num >= 0) {
	sum=sum+num;
	System.out.println("introduce un numero");
	num = scanner.nextInt();	
}//while
media = sum / contador;
System.out.println("el resultado de la media es " + media);
scanner.close();
	}//main
}//ejeWhile7
