package BucleFor;
import java.util.*;
public class ejeFor27 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner(System.in);){ 	
	    int i;
        int j;
 
        System.out.println("Introduce número: ");
        int num = scanner.nextInt();
        
        for(i=1;i<=num;i++){
        	for(j=1;j<=i;j++){
        		System.out.print(i);
        	}//for j
			System.out.print("\n");
		}//for i 
}//try			
    }//main
}//ejeFor25
