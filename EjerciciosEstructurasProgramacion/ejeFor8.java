package BucleFor;
import java.util.*;
public class ejeFor8 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	int i;
	int numero = 0;
	
	do {
		System.out.println("introduce un numero entre 0 y 10");
		numero = scanner.nextInt();
	}while (!(numero >= 0 && numero <=10 ));
	System.out.println("La tabla de multiplicar " + numero);
	
	for (i =1; i<=10;i++) {
		System.out.println(numero + " x " + i + " = " + numero*i);
	}
}//try
    }//main
}//ejeFor8
