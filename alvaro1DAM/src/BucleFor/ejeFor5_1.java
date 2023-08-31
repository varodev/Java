package BucleFor;
import java.util.*;
public class ejeFor5_1 {
	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);		
	
    int i;
	int counterZero=0;
	int counterPlus=0;
	int counterMinus=0;
	int sumaPlus=0;
	int sumaMinus=0;
	float mediaPlus;
	float mediaMinus;
	
	for (i=1; i<=10; i++) {
		System.out.println("Introduce un número: ");
		int numero = scanner.nextInt();
		
		if (numero == 0) {
			counterZero++;
		}//if
		else if (numero > 0 ) {
			counterPlus++;
			sumaPlus = sumaPlus + counterPlus;
		}
		else {
			counterMinus++;
			sumaMinus = sumaMinus + counterMinus;
scanner.close();							
			
		}//else
	
	}//for
	
		System.out.println("La cantidad de números ceros son: " + counterZero);
		
		if (counterPlus == 0) {
			System.out.println("no hay media de números positivos");
		}else {
			mediaPlus = (float)sumaPlus/counterPlus;
			System.out.println("La media de los números de positivos son " + mediaPlus);
		}//counterPlus
		
		if (counterMinus == 0) {
			System.out.println("no hay media de números negativos");
		}else {
			mediaMinus = (float)sumaMinus/counterMinus;
			System.out.println("La media de los números de positivos son " + mediaMinus);
		}//counterMinus
			
		}//main
}//ejeFor5
