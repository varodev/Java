package condicionalesSwitch;
import java.util.*;
public class TestingSw4 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.println("introduce profesion");
	String profesion = scanner.nextLine();	
	System.out.println("introduce numero de DNI");
	String DNI = scanner.nextLine();
	System.out.println("introduce edad");
	int edad = scanner.nextInt();
	
	switch (profesion){
	case "estudiante y trabajador":
		System.out.println(DNI + " , " + profesion + " , " + edad);
	break;
	case "trabajador":
		Met(edad);
	break;	
	case "estudiante":
		System.out.println(edad);
	break;	
	default:
		System.out.println("ninguna de las opciones anteriores");
	}//switch
		
scanner.close();
	}//main
	public static void Met(int edad) {
		System.out.println(edad);
	}//Met	
}//TestingSw3
