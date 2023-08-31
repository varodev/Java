package bucleWhileFor;
import java.util.*;
public class eep9 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
	
	int cont=0;
	int j=0;
	int primo=0;
	int numeros=0;
	System.out.println("Intoduce numero");
	numeros=scanner.nextInt();

	for (int i=1;i<numeros;i++){
	primo=0;//cuenta la cantidad de veces divisible
	j=1;
	
		while (j<=i) {
			if (i%j==0){
				primo++;
			}//if de while
		j++;

		}//while
	
		if (primo==2){
			cont++;
			System.out.println("el numero "+ i +" es primo");
		}//if de primo
		else {
			System.out.println("el numero "+ i +" no es primo");
		}
	}//for
	System.out.println("Hay "+ cont+ " numeros primos");
}//try
   }//main
}//eep9
