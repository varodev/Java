package alvaro;
import java.util.*;
public class Testing10 {
    public static void main(String[]args) {
    	try (Scanner scanner = new Scanner(System.in)) {
		
    		System.out.println("introduce la nota");
            double nota = scanner.nextDouble();
            	
    		String resultado = calcularNota(nota);
    		System.out.println(resultado);
    	      	
    	}//try
    }//main 
   public static String calcularNota (double nota) {
	   String notaExam = null;
	   
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
   }
}//testing10
			
			
	

