package BucleFor;
import java.util.*;
public class ejeFor14 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	boolean suspenso = false;
	int counterSus=0;
	
	
		for (i=1; i<6; i++) {
			System.out.println("Introduce la nota");
			int nota = scanner.nextInt();
			
			if (nota <5) {
				counterSus++;
				suspenso = true;
						}
		}//for
		
		if (suspenso == true) {
			System.out.println("Hay " + counterSus + " suspensos");
		}else {
			System.out.println("no hay suspensos");
		}
}//try
    }//main
}//ejeFor14
