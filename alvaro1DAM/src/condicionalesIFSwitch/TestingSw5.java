package condicionalesIFSwitch;
import java.util.*;
public class TestingSw5 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce un numero");
		int numero = scanner.nextInt();
		System.out.println("introduce 1 si crees que es par");
		System.out.println("introduce 2 si crees que es impar");
		int eleccion = scanner.nextInt();
			
   switch (eleccion) {
	case 1:
	System.out.println("el numero " + numero + " es " + MetPar(numero));
	break;
	case 2:
	System.out.println("el numero " + numero + " es " + MetImpar(numero));
	break;
	default:
	System.err.println("error");	
   }//switch
scanner.close();
    }//main
	public static boolean MetPar(int numero) {
		return numero % 2 == 0;
    }//MetPar
	public static boolean MetImpar(int numero) {
		return numero % 2 != 0;
    }//MetImpar
}//TestingSw5
