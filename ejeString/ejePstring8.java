package string;
import java.util.*;
public class ejePstring8 {
	
	String mail;
	
	public ejePstring8() {
		try(Scanner scanner = new Scanner (System.in)){
			System.out.println("Introduce la correo electronico");	
	    	mail = scanner.nextLine();
		}//try
	}//ejePstring8()
		public void setArroba() {
			
		           int arroba = 0;
		
    		for (int i = 0; i<mail.length();i++ ) {
	            if (mail.charAt(i)=='@') {
		           arroba++;
	            }//if arroba
            }//for
	
            if (arroba ==1) {
	            System.out.println("el email " +  mail + " tiene arroba");
            }
            else {
	        System.out.println("el email " +  mail + " no tiene arroba");
            }
	    }//setArroba
	
	public static void main(String[] args) {
    	
		ejePstring8 arro = new ejePstring8();
		arro.setArroba();
  
   }//main
}//ejePstring8
