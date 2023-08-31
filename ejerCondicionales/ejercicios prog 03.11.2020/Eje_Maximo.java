import java.util.*;
public class Eje_Maximo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("introduce el segundo numero");
		int num2 = sc.nextInt();
	
			int maxi = calcularMaximo(num1, num2);
			System.out.println("el numero maximo es: " + maxi);
		
	
	}
	public static int calcularMaximo(int num1, int num2){
		int calcularMax = Math.max(num1,num2);
		return calcularMax;
	}
	
}