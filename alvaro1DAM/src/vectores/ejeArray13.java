package vectores;
import java.util.*;
public class ejeArray13 {

		Scanner scanner;
		String nombres[];
		int edades[];
				
		public void Met() {
		scanner=new Scanner(System.in);
			
			nombres = new String[5];	
			edades = new int[5];	
			      for (int i=0; i<nombres.length;i++) {
					System.out.println("Escribe nombre " + (i+1));
					nombres[i]=scanner.next();
			
					System.out.println("Escribe edad " + (i+1));
					edades[i]=scanner.nextInt();
				}
		}//Met
		
		public void Mayoria() {
			for (int i=0; i<5;i++) {	
				if (edades[i]>=18) {
					System.out.print(nombres[i] + " ,");	
				}
			}//for
		}//mayoria
		
    public static void main(String[] args) {
	    ejeArray13 num= new ejeArray13();
		num.Met();
		num.Mayoria();
    }//main
}//ejeArray13
