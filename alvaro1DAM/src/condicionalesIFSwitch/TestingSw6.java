package condicionalesIFSwitch;
import java.util.*;
public class TestingSw6 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = scanner.nextInt();
		
		if(numero >=1) {
		System.out.println("introduce par, si crees que es par");
		System.out.println("introduce impar, si crees que es impar");
		String eleccion = scanner.next();
			
		switch (eleccion) {
			case "par":
				System.out.println("La eleccion es " + MetPar(numero));
			break;
			case "impar":
				System.out.println("La eleccion es " + MetImpar(numero));	
			break;
			default:
			System.err.println("error");	
			}//switch
		}//if
		else {
			System.out.println("estas metiendo algo menor de 0");
		}//else
scanner.close();
    }//main
	public static boolean MetPar(int numero) {
		return numero % 2 == 0;
    }//MetPar
	public static boolean MetImpar(int numero) {
		return numero % 2 != 0;
    }//MetImpar
}//TestingSw6
