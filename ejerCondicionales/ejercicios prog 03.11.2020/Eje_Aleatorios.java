import java.util.*;
public class Eje_Aleatorios{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el primer numero entre el 1 y 20");
		int num1 = sc.nextInt();

		System.out.println("introduce el segundo numero entre el 1 y 20");
		int num2 = sc.nextInt();
	
		generarAleatorio(num1,num2);	
	
	}
	public static void generarAleatorio(int num1, int num2){
	System.out.println(Math.random()*20+1);
	}
	
}