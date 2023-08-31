import java.util.*;
public class Eje1_5{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
    
	System.out.println("Introduce precio producto");
		double precio_pro = sc.nextDouble();
	
	final double IVA = (21 * precio_pro /100); 
	
	 double Precio_final = precio_pro + IVA;
	 
	 System.out.print("el precio total es: " + Precio_final);
	
	
		}

}