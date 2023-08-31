package condicionalesIFSwitch;
import java.util.*;
public class Testing10 {
    public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
 System.out.println("introduce la nota");
 double nota = scanner.nextDouble();
            	
 System.out.println(calcularNota(nota));
    	      	
scanner.close();
    }//main 
   public static String calcularNota (double nota) {
	   String notaExam = "";
	   
	   if(nota < 5) {
	   notaExam = "Insuficiente";
	   }
	   else if(nota >= 5 && nota <= 7 ) {
	   notaExam = "Bien";
	   }
	   else if(nota > 7 && nota <= 9) {
	   notaExam = "Notable";
	   }
	   else {
	   notaExam = "Sobresaliente";
	   }
	   return notaExam;
   }//calcularnota
}//testing10
			
			
	

