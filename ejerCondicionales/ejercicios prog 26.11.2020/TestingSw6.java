package condicionalesSwitch;
import java.util.*;
public class TestingSw6 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = scanner.nextInt();
		System.out.println("introduce par o impar");
		String eleccion = scanner.next();
			
		    switch (eleccion) {
			case "par":
				boolean resultPar = MetPar(numero);		
				System.out.println("el numero elegido es " + resultPar);
			break;
			case "impar":
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
}//TestingSw6
