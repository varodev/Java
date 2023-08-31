package matrices;
import java.util.*;
public class ejeMatrices17 {
Scanner scanner = new Scanner(System.in);
Random rnd = new Random();
	int matrixA[][];
	int matrixB[][];
	int f,c;
		
	public void rellenar(){
		System.out.println("Autorellenado matriz de A...");
		
		 matrixA= new int[5][9];
		 matrixB= new int[9][5];
			for(int f=0; f< 5;f++) {
				for (int c=0; c<9;c++) {
					matrixA[f][c]=rnd.nextInt(8)+1;
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz de A queda asi impresa");
		for(int f=0; f<5;f++) {
			System.out.println();
			for (int c=0; c<9;c++) {
				System.out.print(matrixA[f][c] + " ");
			}
		}
	}//imprimir
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f<5;f++) {
			for (int c=0; c<9;c++) {
			matrixB[c][f]=matrixA[f][c];	
			}
		}
		
		System.out.println("\nLa matriz de B queda asi impresa ");
		for (int f=0;f<9;f++) {
			System.out.println();
			for(int c=0;c<5;c++) {
				System.out.print(matrixB[f][c] + " ");
			}
		}
	}
		
	public static void main(String[] args) {
		ejeMatrices17 matrix = new ejeMatrices17();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
	}
}
