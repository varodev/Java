package pooExcepciones;
import java.util.*;
public class ExcepcionesEjemplo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int [] array = {4,2,6,7};
	    int n;
	    boolean repetir = false;
	    do{
	         try{
	                repetir = false;
	                System.out.print("Introduce un número entero entre 0 y 3" + " ");
	                n = scanner.nextInt();
	                System.out.println("Valor en la posición " + n + ": " + array[n]);
	         }catch(InputMismatchException e){
	        	 	   scanner.nextLine();//vacio buffer
	                   n = 0;
	                   System.out.println("Debe introducir un número entero ");
	                   repetir = true;
	         }catch(IndexOutOfBoundsException e){
	                  System.out.println("Debe introducir un número entero entre 0 y 3" + " ");
	                  repetir = true;
	         }catch(Exception e){ //resto de excepciones de tipo Exception y derivadas
	                   System.out.println("Error inesperado " + e.toString());
	                   repetir = true;
	         }
	     }while(repetir==true);
	     scanner.close();
	}
}	
