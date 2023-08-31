package BucleFor;
import java.util.*;
public class ejeFor26 {
	public static void main(String[] args) {
   try(Scanner scanner = new Scanner(System.in);){ 	
	    int i;
        int j;
 
        System.out.println("Lado cuadrado: ");
        int aste = scanner.nextInt();
        
        for(i=1;i<aste;i++){
			for(j=0;j<i;j++){
				System.out.print("*");
			}//for j subida
			System.out.print("\n");
		}//for i subida
		for(i=aste;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("*");
			}//for j bajada
			System.out.print("\n");
		}//for i bajada
   }//try			
    }//main
}//ejeFor25
