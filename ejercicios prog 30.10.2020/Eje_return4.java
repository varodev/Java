import java.util.*;
public class Eje_return4{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14; 
		System.out.println("introduce el radio por teclado: ");
		int r = sc.nextInt();
		
		double resultado = area (r, PI);
		System.out.println("el resultado es: " + resultado);	
			
	}
	
	public static double area(int r, double PI){
		double are = PI*r*r;
		return are;
		
	}
}