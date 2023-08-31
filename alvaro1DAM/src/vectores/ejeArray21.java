package vectores;
import java.util.*;
public class ejeArray21 {
    Scanner scanner = new Scanner(System.in);
	String cadena;//scanner.nextLine();
	int i;
	String []nombres;
	int mayor=0;
	int posicion=0;
	String cadena2;
	boolean Estado=false;
		
	public void name() {
		
	System.out.println("Introduce la cantidad de nombres en el vector");	
	int n = scanner.nextInt();
	nombres=new String[n];
	
	for(int i=0;i<nombres.length;i++) {
		System.out.println("introduce el " + (i+1) + " nombre");
		nombres[i]=scanner.next();
	}
	System.out.println(" ");
	System.out.println("Los nombres introducidos son");
		for(int i=0;i<nombres.length;i++) {
			System.out.print(nombres[i] + " ");	
	}
	
	}//name
	
	public void comparar() {
		System.out.println("\n");
		System.out.println("Introduce la cadena a comprar con el array");
		cadena2=scanner.next();
		for(int i=0;i<nombres.length;i++) {
			
			if (cadena2.equalsIgnoreCase(nombres[i])) {
				System.out.println("Se encuentra en el vector y se eliminará: ");
				Estado=true;
				posicion=i;
			}
		}
		
		if (Estado == true) {
			for (i=posicion; i<nombres.length;i++) {
			
				if (i==nombres.length-1) {
					nombres[i]=" ";
				}else {
					nombres[i]=nombres[i+1];
				}
			}	
		}else {
			System.err.println("FALLO");
		}
		
		System.out.println();
		System.out.println("El vector queda:");
		for (i=0; i<nombres.length;i++) {
			System.out.print(nombres[i] + " ");
			}
	}
					
   public static void main(String[] args) {
	ejeArray21 nomb = new ejeArray21();
	 nomb.name();
	 nomb.comparar();
   }//main
}//ejeArray21
