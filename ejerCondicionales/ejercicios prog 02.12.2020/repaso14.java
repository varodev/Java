package ejerciciosRepaso;
import java.util.*;
public class repaso14 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       System.out.println("Pedir una de la forma hora, minutos y segundos");
		System.out.println("introduce hora");
		int hora = scanner.nextInt();
		System.out.println("introduce minutos");
		int minutos = scanner.nextInt();
		System.out.println("introduce segundos");
		int segundos = scanner.nextInt();
	
		System.out.println("La hora seleccionada es: ");
		System.out.println(hora + "horas " + minutos + "minutos " + segundos + "segundos");
	      
		
		
	   if (hora > 0 && hora <= 23 && minutos > 0 && minutos <=59 && segundos > 0 && segundos <=59 ){
	      System.out.println("se implementa un segundo más:");
	      System.out.println(hora + "horas " + minutos + "minutos " + (segundos+1) + "segundos");
	     }
	     else {
	    	 System.out.println("algo estas haciendo mal");
	     }
scanner.close();
    }//main
}//repaso14