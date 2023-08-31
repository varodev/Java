import java.util.*;
public class Eje1_4_1{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el radio");
		double R = sc.nextDouble();
				
		final double Pi = 3.14;
		
		double area = (Pi * (R * R));
	
		System.out.println("el area del circulo es: " + area + "cm"); 
       		
	}

}