package alvaro;
import java.util.*;
public class Testing14 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce numero de horas");
        int horas = scanner.nextInt();
        int precioHora;
        
        if (horas <= 20) {
        	precioHora = 12;
		}
		else if (horas > 20 && horas < 30) {
			precioHora = 15;
		}
		else {
			precioHora = 25;
		}
        
        double result = getsueldo (horas, precioHora);   
        System.out.print(result);
        printSalary (getsueldo(horas, precioHora));
        
scanner.close();
	}//main
	public static double getsueldo (int horas, int precioHora) {
		return horas*precioHora;
	}//getueldo
	
	public static void printSalary (double getsueldo) {
		if (getsueldo > 2000 ) {
			System.out.println("Eres rico:" + getsueldo);
		}
		else {
			System.out.println("Eres un currante: " + getsueldo);
		}
	}//printSalary
}//Testing14
