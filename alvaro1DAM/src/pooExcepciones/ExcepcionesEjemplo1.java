package pooExcepciones;
import java.util.*;
public class ExcepcionesEjemplo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	      int n=0;
	      
	      do{
	           try{
	                 System.out.print("Introduce un número entero MAYOR QUE 0: ");
	                 n = scanner.nextInt();
	                 System.out.println("Número introducido: " + n);
	          }catch(InputMismatchException e){
	        	  System.out.println("Debe introducir un número entero " + e.toString());    
	        	  n = 0;
	                  
	          }finally {
	        	  System.out.println("Programa finalizado");
	        	  scanner.close();
	          }
	      }while(n<=0);
	}
}
