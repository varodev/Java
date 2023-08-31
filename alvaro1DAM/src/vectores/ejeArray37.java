package vectores;
import java.util.*;
public class ejeArray37 {
	Random rnd = new Random();   
	int [] matrix;
	int i=0;
	int j=0;
	int descendente=0;
	
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
	
	public void operar3(){
		System.out.println("\nOperando");
		for(i=0;i<10;i++) {
			for(j=0;j<matrix.length-i-1; j++) {
				if(matrix[j]<matrix[j+1]) {
					descendente=matrix[j+1];
					matrix[j+1]=matrix[j];
					matrix[j]=descendente;
				}
			}
		}	
	}
	
	public void imprimir3() {
		System.out.println("La matriz queda asi");
			for(i=0;i<10;i++) {
				System.out.print(matrix[i] + " ");	
			}
	}
		
  public static void main(String[] args) {
	ejeArray37 nomb = new ejeArray37();
		nomb.rellenar();
		nomb.imprimir();
		nomb.operar3();
		nomb.imprimir3();
	}//main
}//ejeArray37
