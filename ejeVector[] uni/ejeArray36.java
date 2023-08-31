package vectores;
import java.util.*;
public class ejeArray36 {
	Random rnd = new Random();   
	int [] matrix;
	int i=0;
	int j=0;
	int ascendente=0;
		
	public void rellenar() {
	System.out.println("Autorellenado matriz...");
	 	matrix= new int[10];
	 		for(i=0;i<10;i++) {
			matrix[i]=rnd.nextInt(8)+1;
			}
	}
	
	public void imprimir() {
		System.out.println("La matriz queda asi");
		for(i=0;i<10;i++) {
		System.out.print(matrix[i] + " ");	
		}
	}
	
	/*public void operar() {
		System.out.println("\nOperando");	
		for(i=0;i<10;i++) {
			Arrays.sort(matrix);	
		}
	}*/
	
	public void operar2() {
		System.out.println("\nOperando");
		for(i=0;i<10;i++) {
			for(j=1;j<(matrix.length-i); j++) {
				if (matrix[j-1]>matrix[j]) {
					ascendente=matrix[j-1];
					matrix[j-1]=matrix[j];
					matrix[j]=ascendente;
				}
			}
		}
	}
	
	public void imprimir2() {
		System.out.println("La matriz queda asi");
		for(i=0;i<10;i++) {
		System.out.print(matrix[i] + " ");	
		}
	}
	
   public static void main(String[] args) {
	ejeArray36 nomb = new ejeArray36();
		nomb.rellenar();
		nomb.imprimir();
		//nomb.operar();
		//nomb.imprimir();
		nomb.operar2();
		nomb.imprimir2();
	}//main
}//ejeArray36
