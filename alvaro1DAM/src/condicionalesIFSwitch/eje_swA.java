package condicionalesIFSwitch;
import java.util.*;
public class eje_swA {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce tu usuario");
	       String user = scanner.next();
	       System.out.println("introduce tu contraseña");
	       int pwd = scanner.nextInt();

	       String numCadena = String.valueOf(pwd);
	    
	       if (user.equals("Carlos") && numCadena.equals("44867")){
	    	   checkCredentials(user, pwd);
	    	   System.out.println("Login correcto");
		    }
		    else {
		    	checkCredentials(user, pwd);
		    	System.err.println("Login incorrecto");
		    }
scanner.close();
    }//main
	public static boolean checkCredentials(String user, int pwd) {
		if (user != "Carlos" && pwd != 44867 ) {
		   	return false;
		}
		else {
			return true;
		}
	}//checkCredentials
}//eje_swA
