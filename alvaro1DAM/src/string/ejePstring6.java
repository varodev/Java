package string;
import java.util.*;
public class ejePstring6 {
	
	String clave;
	String contra;
	
	public ejePstring6() {
		
		
		try(Scanner scanner = new Scanner (System.in)){
    		
	    	System.out.println("Introduce la clave");	
	    	clave = scanner.nextLine();
		}//try	
		contra = "123abc";
	}//ejePstring6()
	
		public void setContra(){

			
	 
	
			if (clave.equals(contra)) {
		System.out.println("contraseña correcta");
			}
			else {
		System.out.println("contraseña incorecta");
			}
		}//setContra()
	
	public static void main(String[] args) {
		ejePstring6 clav = new ejePstring6();
		clav.setContra();
	}//main
}//ejePstring6
