package bucleWhile_doWhile;
import java.util.*;
public class ejeWhile5 {
 public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		

int n = (int) (Math.random()*100);
int contador = 0; 

System.out.println("introduce un numero");
int num = scanner.nextInt();

while (num!=n) {
	
	if (num > n) {
	System.out.println("introduce un numero menor\n");
	}
	else {
		System.out.println("introduce un numero mayor\n");	
	}
	
	System.out.println("introduce otro numero");
	num = scanner.nextInt(); 
	contador++;
	
}//while
System.out.println("Correcto");
System.out.println("Acertaste al " + contador + " intento");
scanner.close();
	}//main
}//ejeWhile5
