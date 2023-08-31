package bucleWhile_doWhile;
import java.util.*;
public class ejeWhile7 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
int num = 0;

System.out.println("Introduce un numero");
num = scanner.nextInt();
	
int sum = 0;
int counter = 0;
float med = 0;
	
while (num>=0) {
		
		System.out.println("Introduce un numero");
		num = scanner.nextInt();
		counter++;
		sum=sum+num;
		
	}//while
med = (sum-num)/(counter-1);
System.out.println("el resultado de la media es: " + med );
scanner.close();
	}//main
}//ejeWhile7
