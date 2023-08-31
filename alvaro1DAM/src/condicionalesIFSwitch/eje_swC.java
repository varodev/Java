package condicionalesIFSwitch;
import java.util.*;
public class eje_swC {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce tu usuario");
	       String user = scanner.next();
	       System.out.println("introduce tu contraseña");
	       int pwd = scanner.nextInt();

	       String numCadena= String.valueOf(pwd);
	       
	    if (user.equals("Carlos") && numCadena.equals("12345")){
	    	System.out.println("Login correcto");
	    }
	    else {
	    	System.err.println("Login incorrecto");
	    }
scanner.close();
    }//main
}//eje_swC
