import java.util.*;
public class Eje_Dinero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce cantidad de Euros");
		int euro = sc.nextInt();
	    
		cambioALibras(euro);
		cambioADolares(euro);
		cambioAYenes(euro);
		        				
	}
	public static void cambioALibras(int euro){
	System.out.println(euro * 0.9);
	}
	public static void cambioADolares(int euro){
	System.out.println(euro * 0.85);
	}
	public static void cambioAYenes(int euro){
	System.out.println(euro * 122.39);
	}

	
}