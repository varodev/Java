package BucleFor;
import javax.swing.*;
public class ejeFor19 {
	public static void main(String[] args) {
    	
	int i;
	boolean arroba = false;
	String email = JOptionPane.showInputDialog("Introduce tu email");
	
	for (i = 0; i<email.length(); i++) {
		if (email.charAt(i)=='@') {
			arroba = true;
		}else {
			arroba = false;
		}
	}//for
		if (arroba == true) {
		System.out.println("el mail " + email + " es correcto");   	
		}else {
		System.out.println("el mail " + email + " es incorrecto"); 
		}
	}//main
}//ejeFor19
