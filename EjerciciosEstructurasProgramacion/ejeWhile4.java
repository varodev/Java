package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile4 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero");
int num = scanner.nextInt();
int contador = 0;
	
while(num>0) {
	contador = contador+1;
		System.out.println("introduce otro numero");
		num = scanner.nextInt();
}//while
System.out.println(contador++);
scanner.close();
	}//main
}//ejeWhile4
