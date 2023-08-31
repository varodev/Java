package matrices;
import java.util.*;
public class ejeMatrices13 {
	Scanner scanner= new Scanner(System.in);
	Random rnd = new Random(); 
	int  matrixA[][];
	int  matrixB[][];
	int  matrixSumaAB[][];
	int f,c;
	
	boolean simetrica;
	
	public void rellenar(){
		System.out.println("Autorellenado de A...");
		scanner= new Scanner(System.in);
		 matrixA= new int[3][3];
			for(int f=0; f< matrixA.length;f++) {
				for (int c=0; c<matrixA[f].length;c++) {
			matrixA[f][c]=rnd.nextInt(8)+1;
			
				}
			}
			System.out.println("Autorellenado de B...");
			scanner= new Scanner(System.in);
			 matrixB= new int[3][3];
				for(int f=0; f< matrixB.length;f++) {
					for (int c=0; c<matrixB[f].length;c++) {
				matrixB[f][c]=rnd.nextInt(8)+1;
				
					}
				}
	}//rellenar
	
	public void imprimir() {
		System.out.println();
		System.out.println("\nLa matriz de A queda asi impresa");
		for(int f=0; f<matrixA.length;f++) {
			System.out.println();
			for (int c=0; c<matrixA[f].length;c++) {
				System.out.print(matrixA[f][c] + " ");
			}
		}
		System.out.println();
		System.out.println("\nLa matriz de B queda asi impresa");
		for(int f=0; f<matrixB.length;f++) {
			System.out.println();
			for (int c=0; c<matrixB[f].length;c++) {
				System.out.print(matrixB[f][c] + " ");
			}
		}
	}
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		matrixSumaAB=new int [3][3];
		for (f=0; f<3;f++) {
			for(c=0;c<3;c++) {
				matrixSumaAB[f][c]=matrixA[f][c]+matrixB[f][c];
			}
		}
		
		System.out.println();
		System.out.println("\nLa matriz SumaAB queda asi impresa");
		for (f=0; f<3;f++) {
			System.out.println();
			for(c=0;c<3;c++) {
				System.out.print(matrixSumaAB[f][c] + " ");
			}
		}
    }
		
	public static void main(String[] args) {
		ejeMatrices13 matrix = new ejeMatrices13();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
	}
}
