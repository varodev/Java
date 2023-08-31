package vectores;
import java.util.*;
public class ejeArray20 {
    Scanner scanner = new Scanner(System.in);
	
	int i;
	String nombres[];
 	int mayor=0;
	int posicion=0;
	
	public void name() {
		
	System.out.println("Introduce la cantidad de nombres");	
	int n = scanner.nextInt();
	nombres=new String[n];
		for(int i=0;i<nombres.length;i++) {
		System.out.println("introduce el " + (i+1) + " nombre");
		nombres[i]=scanner.next();
		}
	}//name
	
	public void mayor() {
		for(int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i].length());
			if (mayor<nombres[i].length()) {
				mayor=nombres[i].length();
				posicion=i;
			}
		}
		System.out.println("el nombre con mayor numero de caracteres es " 
		+ nombres[posicion] + " con la cantidad de caracteres de " + mayor);
	}
			
   public static void main(String[] args) {
	ejeArray20 nomb = new ejeArray20();
	 nomb.name();
	 nomb.mayor();
   }//main
}//ejeArray20
