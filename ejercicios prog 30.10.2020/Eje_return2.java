import java.util.*;
public class Eje_return2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("introduce el nombre Fernando: ");
		String nombre = sc.nextLine();
		
		String nomb = "Bienvenido Fernando";
		System.out.println(nomb);	
			
	}
	
	public static String name(String nombre){
		String nomb = nombre;
		return nomb;
		
	}
}