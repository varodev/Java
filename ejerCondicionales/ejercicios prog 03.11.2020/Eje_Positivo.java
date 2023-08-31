import java.util.*;
public class Eje_Positivo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		double num = sc.nextInt();

		double resultado = elevarNumero(num);
		System.out.println("el valor de la potencia es: " + (int)resultado);
				
				
	}
	public static double elevarNumero(double num){
	double elevado = Math.pow(num,4);
	return elevado;
	}
	

	
}