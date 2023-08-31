package condicionalesIF;
import java.util.*;
public class Testing17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = scanner.nextInt();
		
		boolean eleccion = true;
		
			
		    if (eleccion) {
				boolean resultPar = MetPar(numero);		
				System.out.println("el numero elegido es " + resultPar);
		    }
		    else { 
				boolean resultImpar = MetImpar(numero);
				System.out.println("el numero elegido es " + resultImpar);	
			}//switch
		    
scanner.close();
    }//main
	public static boolean MetPar(int numero) {
		boolean MetP = (numero % 2 == 0); 
		return MetP;
    }//MetPar
	public static boolean MetImpar(int numero) {
		boolean MetImp = (numero % 2 != 0); 
		return MetImp;
    }//MetImpar
}//Testing17	

	