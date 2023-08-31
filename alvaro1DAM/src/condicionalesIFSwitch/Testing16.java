package condicionalesIFSwitch;
import java.util.*;
public class Testing16 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	System.out.println("introduce profesion");
	String profesion = scanner.nextLine();	
	System.out.println("introduce numero de DNI");
	String DNI = scanner.nextLine();
	System.out.println("introduce edad");
	int edad = scanner.nextInt();
	
	String var1 = "estudiante y trabajador";
	String var2 = "trabajador";
	String var3 = "estudiante";
		
	if (profesion.equals(var1)) {
		System.out.println(DNI + " , " + profesion  + " , " + edad);	
	}
	else if (profesion.equals(var2)) {
		Met(edad);	
	}
	else if (profesion.equals(var3)){
		System.out.println(edad);
	}
	
scanner.close();
	}//main
	public static void Met(int edad) {
		System.out.println(edad);
	}//Met	
}//Testing16

