import java.util.*;
public class Eje1_3{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
    
		
    System.out.println("Introduce radio circunferencia");
		double radio_cir = sc.nextDouble();
	
	final double PI = 3.14;
	
	double longitud = 2 *(PI * radio_cir);
	double area = (PI * radio_cir * radio_cir);
	
	System.out.println("Longitud: " + longitud + "cm");
	System.out.println("area: " + area + "cm");
	
	}




}