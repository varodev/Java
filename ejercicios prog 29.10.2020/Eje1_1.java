import java.util.*;
public class Eje1_1{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
    
		
    System.out.println("Marca");
		String Marca = sc.nextLine();
	
	System.out.println("Modelo");
		String Modelo = sc.nextLine();
	
	System.out.println("Color");
		String Color = sc.nextLine();
	
	System.out.println("Precio_coche");
		int Precio_coche = sc.nextInt();
	
	System.out.println("Precio_pri_revision");
		int Precio_pri_revision = sc.nextInt();
	
	System.out.println("Precio_seguro");
		int Precio_seguro = sc.nextInt();
	
	int suma = Precio_coche + Precio_pri_revision + Precio_seguro;
	
	
	System.out.println("los detalltes son: " + Marca + Modelo + Color);
	System.out.println("el precio total es: " + suma);
	
	}




}