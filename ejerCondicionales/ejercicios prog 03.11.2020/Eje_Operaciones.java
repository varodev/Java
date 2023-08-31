import java.util.*;
public class Eje_Operaciones{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("introduce el segundo numero");
		int num2 = sc.nextInt();
	
			suma(num1,num2);
			resta(num1,num2);
			multi(num1,num2);					
			division(num1,num2);
	
	}
	public static void suma(int num1, int num2){
	System.out.println(num1 + num2);
	
	}
	public static void resta(int num1, int num2){
	System.out.println(num1 - num2);
	}
    public static void multi(int num1, int num2){
	System.out.println(num1 * num2);
	}
	public static void division(int num1, int num2){
	System.out.println(num1 / num2);
	}
}