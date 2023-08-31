package condicionalesIFSwitch;
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
        
        double sueldo = getsueldo (horas, precioHora);//resultado 
        System.out.print(sueldo);//resultado
        printSalary (sueldo);//getsueldo (horas, precioHora)
        
scanner.close();
	}//main
	public static double getsueldo (int horas, int precioHora) {
		return horas*precioHora;
	}//getsueldo
	public static void printSalary (double sueldo) {//getsueldo
		if (sueldo > 2000) {//getsueldo
			System.out.println("\nEres rico: " + sueldo);//getsueldo
		}
		else {
			System.out.println("\nEres un currante: " + sueldo);//getsueldo
		}
	}//printSalary
}//Testing14
