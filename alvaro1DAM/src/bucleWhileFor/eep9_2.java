package bucleWhileFor;
import java.util.*;
public class eep9_2 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in)){
	

	int cont=0;
	boolean primo=false;
	int numeros=0;
	System.out.println("Intoduce numero");
	numeros=scanner.nextInt();

	for (int i=2;i<numeros;i++){//se inicia en 2 xq no s epuede controla el 1
	primo=false;
		
		for (int j=2;j<i;j++){
            if (i%j==0){
				primo=true;
			}//if
	}//for j
		
		if (primo==false){
			cont++;
			System.out.println("el numero "+ i +" es primo");
		}//if
		else {
			System.out.println("el numero "+ i +" no es primo");	
		}//else
	}//for i
	System.out.println("Hay "+ cont + " numeros primos");

}//try
   }//main
}//eep9
