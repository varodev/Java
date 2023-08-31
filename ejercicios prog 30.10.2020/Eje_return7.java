import java.util.*;
public class Eje_return7{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14; 
		System.out.println("introduce el radio por teclado: ");
		int r = sc.nextInt();
		
		double resultado_long = longitud (r, PI);
		double resultado_area = area (r, PI);
		System.out.println("el resultado es: " + resultado_long);	
		System.out.println("el resultado es: " + resultado_area);
	}
	
	public static double longitud(int r, double PI){
		double longitd = 2*(PI*r);
		return longitd;
		
	}
	
	public static double area(int r, double PI){
		double are = PI*r*r;
		return are;
		
	}
	
}