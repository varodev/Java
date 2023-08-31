package ejeEstrucProg;
import java.util.*;
public class eep9_1 {
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
	
		for (j=1;j<=i;j++) {
			if (i%j==0){
				primo++;
			}//if de while
		}//for j
	
		if (primo==2){
			cont++;
			System.out.println("el numero "+ i +" es primo");
		}//if de primo
		else {
			System.out.println("el numero "+ i +" no es primo");
		}//else
	}//for i
	System.out.println("Hay "+ cont+ " numeros primos");
}//try
   }//main
}//eep9
