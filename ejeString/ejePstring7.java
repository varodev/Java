package string;
import java.util.*;
public class ejePstring7 {
	
        String oracion;
		
		public ejePstring7() {
			try(Scanner scanner = new Scanner (System.in)){	
			
			System.out.println("Introduce la oracion: La mañana esta fria");	
			oracion = scanner.nextLine();
		    }//try	
		}//public ejePstring7()	
			
			public void setORacion() {
			/*System.out.println(oracion.substring(0,2));
	    	System.out.println(oracion.substring(3,9));
	    	System.out.println(oracion.substring(10,14));
	    	System.out.println(oracion.substring(15,19));*/
			 for (int i=0;i<oracion.length();i++) {
	    		if(oracion.charAt(i)==' ') {
	    			System.out.println();
	    		}
	    		else {
	    			System.out.print(oracion.charAt(i));
	    		}
	    	 }//for
			}//setOracion
			
    public static void main(String[] args) {
    
    	ejePstring7 ora = new ejePstring7();
    	ora.setORacion();
    }//main
}//ejePstring7
