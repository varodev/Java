package condicionalesIFSwitch;
import java.util.*;
public class Testing16_1 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("introduce numero de DNI");
    String DNI = scanner.nextLine();
    System.out.println("introduce profesion");
	String profesion = scanner.nextLine();	
	System.out.println("introduce edad");
	int edad = scanner.nextInt();
	
	switch (profesion) {
	case "estudiante y trabajador":
	System.out.println(DNI + " , " + profesion  + " , " + edad);
	break;
	case "trabajador":
    Met(edad);
    break;
	case "estudiante":
	break;
	default:
	System.out.println("algo estas haciendo mal");
	}//switch
scanner.close();
}//main
public static void Met(int edad) {
		System.out.println(edad);
}//Met	
}//Testing16

