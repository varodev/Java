package bucleWhile_doWhile;
import javax.swing.*;
public class ejeWhile14 {
 public static void main(String[] args) {

String genero = " ";
int altura;


	do{
		genero=JOptionPane.showInputDialog("introduce tu genero (H/M)");
		
	}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);//while	
		
	altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
	
	
		if (genero.equalsIgnoreCase("H")) {
	        
	        System.out.println("El peso ideal es " + (altura - 110) + " kg");
		}
		else {
			
			System.out.println("El peso ideal es " + (altura - 120) + " kg");
		}
	}//main
}//ejeWhile14
