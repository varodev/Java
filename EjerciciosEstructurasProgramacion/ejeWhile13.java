package BucleWhile_doWhile;
import javax.swing.*;
public class ejeWhile13 {
 public static void main(String[] args) {

	 String contra = "alvaro";
	 String pwd = "";
	 
	 while (contra.equals(pwd)==false) {
		 
		pwd=JOptionPane.showInputDialog("introduce la contraseña");
		 
	  if (contra.equals(pwd)==false) {
		 
		 System.out.println("contraseña incorrecta");
		 
	  }//if
		
	 }//while
	 	System.err.println("contraseña correcta");

	}//main
}//ejeWhile13
