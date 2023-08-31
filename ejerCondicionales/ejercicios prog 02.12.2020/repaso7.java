package ejerciciosRepaso;
import java.util.*;
public class repaso7 {
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
	    	System.out.println (uni + "" + dec + "" + cen + "" + uniM + "" + decM);
		}
		else {
			System.out.println("algo estas haciendo mal");
		}
scanner.close();
    }//main
}//repaso7