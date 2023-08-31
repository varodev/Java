package matrices;
import java.util.*;
public class ejeMatrices16 {
Scanner scanner = new Scanner(System.in);
Random rnd = new Random();
	int [][] matrix;
	int f,c;
	int sumFila, sumColumna;
	final int tamaño=4;
	
	public void rellenar(){
		System.out.println("Autorellenado...");
		
		 matrix= new int[tamaño][tamaño];
			for(int f=0; f< tamaño;f++) {
				for (int c=0; c<tamaño;c++) {
					matrix[f][c]=rnd.nextInt(8)+1;
						
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<tamaño;f++) {
			System.out.println();
			for (int c=0; c<tamaño;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
	}//imprimir
	
	public void sumFila() {
		System.out.println();
		System.out.println();
		for(f=0;f<tamaño;f++) {
			sumColumna=0;
			for(c=0;c<tamaño;c++) {
				sumFila=sumFila+matrix[f][c];
			}
			System.out.println("La suma de la fila " + (f+1) +  " es " + sumFila);
		}
	} 
	
	public void sumColumna() {
	    	System.out.println();
			for (c=0;c<tamaño;c++) {
				sumFila=0;
				for(f=0; f<tamaño;f++) {
					sumColumna=sumColumna+matrix[f][c];
				}
				System.out.println("La suma de la columna " + (c+1)   + " es " + sumColumna);
			}
		}
	
	public static void main(String[] args) {
		ejeMatrices16 matrix = new ejeMatrices16();
			matrix.rellenar();
			matrix.imprimir();
			matrix.sumFila();
			matrix.sumColumna();
			
			
			
			
			
	}

}
