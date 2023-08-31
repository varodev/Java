package BucleFor;
import javax.swing.*;
public class ejeFor20 {
	public static void main(String[] args) {
    	
	int i;
	int arroba = 0;
	boolean point = false;
	
	String email = JOptionPane.showInputDialog("Introduce tu email");
	
	for (i = 0; i<email.length(); i++) {
		if (email.charAt(i)=='@') {
			arroba++;
		}
		
		if (email.charAt(i)=='.') {
			point = true;
		}
		
	}//for
		if (arroba == 1 && point == true) {
		System.out.println("el mail " + email + " es correcto");   	
		}else {
		System.err.println("el mail " + email + " es incorrecto"); 
		}
					
    }//main
}//ejeFor20
