package condicionalesSwitch;
import java.util.*;
public class TestingSw5 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = scanner.nextInt();
		System.out.println("introduce 1 para par, 2 para impar");
		int eleccion = scanner.nextInt();
			
		    switch (eleccion) {
			case 1:
				boolean resultPar = MetPar(numero);		
				System.out.println("el numero elegido es " + resultPar);
			break;
			case 2:
				boolean resultImpar = MetImpar(numero);
				System.out.println("el numero elegido es " + resultImpar);	
			break;
			default:
			System.err.println("error");	
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
}//TestingSw5
