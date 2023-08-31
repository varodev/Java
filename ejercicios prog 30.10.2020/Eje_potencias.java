import java.util.*;
public class Eje_potencias{
	public static void main(String args[]){
		//meter por teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce base");
		double numero1 = sc.nextDouble();
		System.out.println("introduce exponente");
	    double numero2 = sc.nextDouble();
		
		//lo que te devuelve el método calculaPotencia
	    double potencia = calcularPotencia(numero1, numero2);
	    System.out.println("el resultado de la potencia es: " + potencia);
			
	}
		//método calculaPotencia
	public static double calcularPotencia(double base, double exponente){
		double potenci = Math.pow(base, exponente);
		return potenci;
		
	}
	
	
}