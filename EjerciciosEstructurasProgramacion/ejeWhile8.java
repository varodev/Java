package BucleWhile_doWhile;
import java.util.*;
public class ejeWhile8 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
System.out.println("introduce un numero N");
int num = scanner.nextInt();

int i = 1;

while (i <= num) {
	System.out.println(i);
	i++;
}
scanner.close();
	}//main
}//ejeWhile8
