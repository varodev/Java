package matrices;
import java.util.*;
public class ejeMatrices5 {
	Random rnd = new Random();
	int f;
	int c;
	int NUM[][];
	int nMayor=0;
	int nMenor=9;
		
	public void rellenar(){
		System.out.println("Autorellenado...");
		NUM= new int[5][10];
			for(int f=0; f< NUM.length;f++) {
				for (int c=0; c<NUM[f].length;c++) {
					NUM[f][c]=rnd.nextInt(9)+1;
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<NUM.length;f++) {
			System.out.println();
			for (int c=0; c<NUM[f].length;c++) {
				System.out.print(NUM[f][c] + " ");
			}
		}
	}
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f< NUM.length;f++) {
			for (int c=0; c<NUM[f].length;c++) {
				
				if(nMayor<NUM[f][c]) {
					nMayor=NUM[f][c];
				}
					
				if(nMenor>NUM[f][c]) {
					nMenor=NUM[f][c];
				}
			}
		}	
		for(int f=0; f< NUM.length;f++) {
			for (int c=0; c<NUM[f].length;c++) {
		
				if(nMayor==NUM[f][c]) {
					System.out.println();
					System.out.println("el valor máximo es " + nMayor);	
					System.out.println("fila " + f);
					System.out.println("columna " + c);
				}
				if(nMenor==NUM[f][c]) {
					System.out.println();
					System.out.println("el valor minimo es " + nMenor);	
					System.out.println("fila " + f);
					System.out.println("columna " + c);
				}
			}
		}
	}	
			
	public static void main(String[] args) {
		ejeMatrices5 matrix = new ejeMatrices5();
			matrix.rellenar();
			matrix.imprimir();
		    matrix.operar();
	}
}
