package condicionalesIFSwitch;
import java.util.*;
public class repaso8 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce numero del 0 al 9999");
		int numero = scanner.nextInt();
	
		int uni = numero % 10;
		numero = numero / 10;
		int dec = numero % 10;
		numero = numero / 10;
		int cen = numero % 10;
		numero = numero / 10;
		int uniM = numero % 10;
		numero = numero / 10;
		int decM = numero;
				
	   
	if (numero > 0 && numero < 10000) {
		if (decM == uni && uniM == dec && cen > 0) {
	    	System.out.println("Full capicua");
		}
		else if (decM == uni) {
			System.out.println("capicua");
		}
		else {
			System.out.println("algo estas haciendo mal");
		}
	}
	else{
			System.out.println("el numero excede el tamaño pedido");
		}
scanner.close();
    }//main
}//repaso8
