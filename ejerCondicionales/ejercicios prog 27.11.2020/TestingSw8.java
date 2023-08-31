package condicionalesSwitch;
import java.util.*;
public class TestingSw8 {
	public static void main(String[] args) {
		System.out.println("introduce un numero del 0 al 99");
		Scanner scanner = new Scanner(System.in);
		int numEntero = scanner.nextInt();
		
		 int decenas = numEntero / 10;
		 int unidades = numEntero % 10;
		
		
		if (numEntero >= 0 && numEntero <= 99){
		
		 switch(decenas){
		 case 0:
		 System.out.print("cero");
		 break;
		 case 1:
		 System.out.print("diez");
		 break;
		 case 2:
		 System.out.print("veinte");
		 break;
		 case 3:
		 System.out.print("treinta");
		 break;
		 case 4:
		 System.out.print("cuarenta");
		 break;
		 case 5:
		 System.out.print("cincuenta");
		 break;
		 case 6:
		 System.out.print("sesenta");	
		 break;
		 case 7:
		 System.out.print("setenta");
		 break;
		 case 8:
		 System.out.print("ochenta");
		 break;
		 case 9:
		 System.out.print("noventa");
		 break;
		 }//decenas
		 
		 if(unidades !=0) {
		 
		 System.out.print (" y ");
		 
		 switch(unidades){
		 case 0:
		 System.out.println("");
		 break;
		 case 1:
		 System.out.println("uno");
		 break;
		 case 2:
		 System.out.println("dos");
		 break;
		 case 3:
		 System.out.println("tres");
		 break;
		 case 4:
		 System.out.println("cuatro");
		 break;
		 case 5:
		 System.out.println("cinco");
		 break;
		 case 6:
		 System.out.println("seis");
		 break;
		 case 7:
		 System.out.println("siete");
		 break; 
		 case 8:
		 System.out.println("ocho");
		 break;
		 case 9:
		 System.out.println("nueve");
		 break;
		 }//unidades
		}
		}
		else {
			System.out.println("algo mal estas haciendo");
		}
		 
		 System.out.println("el numero elegido tiene " + decenas + " decenas, ademas de estas, " + unidades + " unidades");
		 
scanner.close();
    }//main
}//TestingSw8
