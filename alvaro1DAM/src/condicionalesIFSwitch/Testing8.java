package condicionalesIFSwitch;
import java.util.*;
public class Testing8 {
    public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
			           
        System.out.println("Dime tu primera nota");
        double nota = scanner.nextDouble();
        System.out.println("Dime tu segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("Dime tu tercera nota");
        double nota3 = scanner.nextDouble();
        System.out.println("Dime tu tercera nota");
        double nota4 = scanner.nextDouble();
        
        double media = (nota + nota2 + nota3 + nota4)/4;
                     
        if (media >= 5) {
		String aprobado = "estoy aprobado";	
		 mostrarResultado(aprobado);
        }
        else {
		String suspenso = "estoy suspenso";
		mostrarResultado(suspenso);
        }
    	
scanner.close();
   	}//main 
    public static void mostrarResultado (String cadena) {
        	System.out.println(cadena);
    }//mostrarResultado   
}//testing8
			
			
	

