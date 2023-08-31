package condicionalesIFSwitch;
import java.util.*;
public class TestingSw1 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.println("introduce el número del día de la semana");
	int dia = scanner.nextInt();
	
	switch (dia){
	case 1:
		System.out.println("es lunes... (sniff)");
	break;
	case 2:
		System.out.println("Es martes");
	break;
	case 3:
		System.out.println("Es Miercoles!");
	break;
	case 4:
		System.out.println("Es Jueves!!");
	break;
	case 5:
		System.out.println("ES VIERNES!!!");
	break;
	default:
		System.out.println("**NO HAY CLASE **");
	}
scanner.close();
	}//main

}//TestingSw1
