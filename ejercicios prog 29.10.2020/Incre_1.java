import java.util.*;
public class Incre_1{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("dame el primer numero");
	int num1 = sc.nextInt();
	
	System.out.println("dame el segundo numero");
	int num2 = sc.nextInt();
	
	suma(num1,num2);
	resta(num1,num2);
	multiplicacion(num1,num2);
	division(num1,num2);
	modulo(num1,num2);
	}
		//METODO
	public static void suma(int num1,int num2){
	System.out.println(num1 + num2);	
		
		
	}
	public static void resta(int num1,int num2){
	System.out.println(num1 - num2);	
		
		
	}
	public static void multiplicacion(int num1,int num2){
	System.out.println(num1 * num2);	
		
				
	}
	public static void division(int num1,int num2){
	System.out.println(num1 / num2);	
		
	}
	public static void modulo(int num1,int num2){
	System.out.println(num1 % num2);	
			
	}

}