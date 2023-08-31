package matrices;
import java.util.*;
public class ejeMatrices6 {
	Random rnd = new Random();
	int f;
	int c;
	int [][] NUM;
	int nMayor=0;
	int counterMayor;
			
	public void rellenar(){
		System.out.println("Autorellenado...");
		NUM= new int[5][6];
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
					
			}
		}	
		for(int f=0; f< NUM.length;f++) {
			for (int c=0; c<NUM[f].length;c++) {
		
				if(NUM[f][c]==nMayor) {
					System.out.println();
					System.out.println("el valor máximo es " + nMayor);	
					System.out.println("fila " + f);
					System.out.println("columna " + c);
					counterMayor++;
				}
				
			}
		}
		System.out.println();
		System.out.println("El numero de veces que aparece " + nMayor + " son " + counterMayor);
	}	
	
		
	public static void main(String[] args) {
		ejeMatrices6 matrix = new ejeMatrices6();
			matrix.rellenar();
			matrix.imprimir();
		    matrix.operar();
		    
		   
		    
	}

}
