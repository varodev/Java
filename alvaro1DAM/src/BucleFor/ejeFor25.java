package BucleFor;
import java.util.*;
public class ejeFor25 {
	public static void main(String[] args) {
   try(Scanner scanner = new Scanner(System.in);){ 	
	    int i;
        int j;
 
        System.out.println("Lado cuadrado: ");
        int aste = scanner.nextInt();
        
        	for (i = 0; i <aste; i++) {
        		for(j = 0 ; j<aste; j++) {
        			System.out.print("* ");
        		}//for j
        		System.out.print("\n");
        	}//for i
   }//try			
    }//main
}//ejeFor25
