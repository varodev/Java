import java.util.*;
public class Eje_return3{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("introduce el nombre: ");
		String nombre = sc.nextLine();
		
		String nomb = "Bienvenido";
		System.out.println(nomb + nombre);	
	}
	    public static String name(String nombre){
		String nomb = nombre;
		return nomb;
	}
}