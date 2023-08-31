package matrices;
import java.util.*;
public class ejeMatrices14 {
	Scanner scanner= new Scanner(System.in);
	Random rnd = new Random(); 
	int [][] matrix;
	int aux;
	
	
	
	
	public void rellenar(){
		System.out.println("Autorellenado...");
		scanner= new Scanner(System.in);
		 matrix= new int[3][3];
			for(int f=0; f< matrix.length;f++) {
				for (int c=0; c<matrix[f].length;c++) {
			matrix[f][c]=rnd.nextInt(8)+1;
			
				}
			}
			
			
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<matrix.length;f++) {
			System.out.println();
			for (int c=0; c<matrix[f].length;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
		
	}
	public void operar() {
		//solo se transpondera los elementos 
		System.out.println();	
		for (int f=1; f<3;f++) {
			for(int c=0; c<f; c++) {
				aux=matrix[f][c];
				matrix[f][c]=matrix[c][f];
				matrix[c][f]=aux;
			}
		}
		//mostraremos la matriz transpuesta
		System.out.println();
		System.out.println("----------------");
		System.out.println("Matriz transpuesta");
		
		for (int f=2;f>=0;f--) {
			System.out.println();
			for(int c=0;c<3;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
		
		

	}
		
	public static void main(String[] args) {
		ejeMatrices14 matrix = new ejeMatrices14();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
			
	}

}
