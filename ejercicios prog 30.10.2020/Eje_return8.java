import java.util.*;
public class Eje_return8{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
		
	System.out.println("introduce la velocidad en Kilometros/hora");
	double KM = sc.nextDouble();
	
	double resultado = MS (KM); 
	System.out.println("el valor del cambio es: " + resultado);
		
	}
	public static double MS(double KM){
		double M_S = KM * 0.277778;
		return M_S;
		
	}
	
}