package vectores;
import java.util.*;
public class ejeArray8 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){		
	
		String nombres[]= {"hola","adios","buenas"};//array
		boolean existe = true;
		String palabra;
			
		System.out.println("Prueba con una palabra");
		palabra = scanner.nextLine();
			
		for (int i = 0; i < nombres.length; i++) {
			palabra.equals(nombres[i]);
		}//for
		
		while(!palabra.equalsIgnoreCase("hola") && !palabra.equalsIgnoreCase("adios") && !palabra.equalsIgnoreCase("buenas")) {
			System.out.println("Prueba con una palabra");
			palabra = scanner.nextLine();	
		}//while
		
		if (existe) {
			System.out.println("La palabra "+ palabra + " SI está dentro del array");
		}//if
}//try		
	 }//main
}//ejeArray8
