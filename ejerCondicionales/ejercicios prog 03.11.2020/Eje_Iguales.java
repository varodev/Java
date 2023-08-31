import java.util.*;
public class Eje_Iguales{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("introduce el segundo numero");
		int num2 = sc.nextInt();
		
		
		boolean veraz = true;
		boolean falacia = false;
		
		boolean verdad = compararNumerosIguales(num1,num2);
				System.out.println("el resultado es: " + verdad);
		
		boolean mentira = compararNumerosDistintos(num1,num2);
				System.out.println("el resultado es: " + mentira);
				
				
	}
	public static boolean compararNumerosIguales(int num1, int num2){
	boolean compararNumerosI = (num1 == num2);
	return compararNumerosI;
	}
	public static boolean compararNumerosDistintos(int num1, int num2){
	boolean compararNumerosD = (num1 != num2);
	return compararNumerosD;
	}

	
}