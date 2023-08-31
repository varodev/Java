import java.util.*;
public class Eje1_2{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
    
		
    System.out.println("Introduce el tamano del lado");
		int Lado = sc.nextInt();
	
	
	//gracias nacho
	int perimetro = Lado + Lado + Lado + Lado + Lado + Lado;
	
	
	System.out.println("el perimetro total es: " + perimetro);
	
	
	}




}