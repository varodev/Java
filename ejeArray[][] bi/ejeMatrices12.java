package matrices;
import java.util.*;
public class ejeMatrices12 {
	Scanner scanner= new Scanner(System.in);
	Random rnd = new Random(); 
	int [][] matrix;
	
	boolean simetrica;
	
	public void rellenar(){
		System.out.println("Autorellenado...");
		scanner= new Scanner(System.in);
		 matrix= new int[4][4];
			for(int f=0; f< matrix.length;f++) {
				for (int c=0; c<matrix[f].length;c++) {
			matrix[f][c]=rnd.nextInt(8)+1;
			//matrix[f][c]=1;
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
for(int f=0; f<4;f++) {
			
	for (int c=0; c<4;c++) {
		while(f<4) {
			simetrica=true;
		
			while(c<f && simetrica==true) {
				if(matrix[f][c]!=matrix[c][f]) {
					simetrica=false;
					
				}
				c++;
			}
			f++;
		}
	}
}	
				if(simetrica==true) {
					System.out.println("Es simetrica");
				}else {
					System.out.println("No es simetrica");
				}
		

	}
		
	public static void main(String[] args) {
		ejeMatrices12 matrix = new ejeMatrices12();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
			
	}

}
