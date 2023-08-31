package matrices;
import java.util.*;
public class ejeMatrices11 {
	Scanner scanner= new Scanner(System.in);
	Random rnd = new Random(); 
	int matrix[][];
	
		
	public void rellenar(){
		System.out.println("Autorellenado...");
		scanner= new Scanner(System.in);
		 matrix= new int[5][5];
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
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f< matrix.length;f++) {
			for (int c=0; c<matrix[f].length;c++) {
				matrix[f][c]=f+c;
			}
		}
		
		System.out.println("Quedaria así");
		for (int f=4;f>=0;f--) {
			System.out.println();
			for(int c=0;c<matrix[f].length;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
	}
		
	public static void main(String[] args) {
		ejeMatrices11 matrix = new ejeMatrices11();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
			
	}

}
