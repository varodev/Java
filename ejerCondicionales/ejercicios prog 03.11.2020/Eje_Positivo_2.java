import java.util.*;
public class Eje_Positivo_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
		int num1 = sc.nextInt();

	    System.out.println("introduce el segundo numero");
		int num2 = sc.nextInt();
		
        elevarNumero(num1, num2);
		
				
	}
	public static void elevarNumero(int base, int exponente){
	System.out.println(Math.pow(base,exponente));
	}
	

	
}