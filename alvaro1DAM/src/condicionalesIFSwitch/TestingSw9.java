package condicionalesIFSwitch;
import java.util.*;
public class TestingSw9 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	       System.out.println("introduce una palabra");
	       String message = scanner.nextLine();
	       
	       	   char mess = message.charAt(0);
	    	   
	       	   switch (mess) {
		       case 'c':
		    	  System.out.println("has introducido una C"); 
		       break;
		       case 'p':
		    	   printMessage("Has introducido una P");
		       break;
		       case 'j':
		    	   ImprimePantalla(message);
			   break;
		       default:
				   if (message.equalsIgnoreCase("finalizar")) {
					   System.out.println("El usuario desea finalizar el programa");
			    	   System.exit(0);  
				   }
				   else {
					   System.err.println("Estamos dentro del caso por defecto"); 
				   }
			   }//switch 
scanner.close();
    }//main
	public static void printMessage(String message) {
		System.out.println(message); 
	}//printMessage
	public static void ImprimePantalla(String message){
		System.out.println("Has introducido una J");
	}//ImprimePantalla
}//TestingSw9
