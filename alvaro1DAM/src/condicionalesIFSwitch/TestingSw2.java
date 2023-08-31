package condicionalesIFSwitch;
import java.util.*;
public class TestingSw2 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.println("introduce el día de la semana");
	String dia = scanner.nextLine();
	
	switch (dia){
	case "lunes":
		System.out.println("es lunes... (sniff)");
	break;
	case "martes":
		System.out.println("Es martes");
	break;
	case "miercoles":
		System.out.println("Es miercoles!");
	break;
	case "jueves":
		System.out.println("Es jueves!!");
	break;
	case "viernes":
		System.out.println("ES viernes!!!");
	break;
	default:
		System.out.println("**NO HAY CLASE **");
	}
scanner.close();
	}//main
}//TestingSw1
