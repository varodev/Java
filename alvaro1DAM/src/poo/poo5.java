package poo;
import java.util.*;
public class poo5 {
	Random rnd = new Random();
			
	public void generaVector(int vector[]) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=rnd.nextInt(8)+1;
		}
	}
			
	public void calcular(int vectorA[], int vectorB[],int vectorC[]) {
		for (int i=0;i<vectorC.length;i++) {
			vectorC[i]=vectorA[i]+vectorB[i];
		}
	}
	
	public void visualizar(int vectorA[], int vectorB[],int vectorC[]) {
		System.out.println("\nvector 1");
		for (int i=0;i<vectorA.length;i++) {
			System.out.print(vectorA[i] + " ");
		}
		System.out.println("\nvector 2");
		for (int i=0;i<vectorB.length;i++) {
			System.out.print(vectorB[i] + " ");
		}
		System.out.println("\nvector 3");
		for (int i=0;i<vectorC.length;i++) {
			System.out.print(vectorC[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
