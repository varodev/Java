package matrices;
public class ejeMatrices18 {

	int matrix[][];
	int f,c;
	
	public void rellenar(){
		System.out.println("Autorellenado matriz...");
		
		 matrix= new int[8][6];
		    for(int f=0; f< 8;f++) {
				for (int c=0; c<6;c++) {
					matrix[f][c]=0;
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz de A queda asi impresa");
		for(int f=0; f<8;f++) {
			System.out.println();
			for (int c=0; c<6;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
	}//imprimir
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f<8;f++) {
			for (int c=0; c<6;c++) {
				if (f==0||f==7) {
					matrix[f][c]=1;
				}
				if (c==0||c==5) {
					matrix[f][c]=1;
				}
			}
		}
		
		System.out.println("\nLa matriz de B queda asi impresa ");
		for (int f=0;f<8;f++) {
			System.out.println();
			for(int c=0;c<6;c++) {
				System.out.print(matrix[f][c] + " ");
			}
		}
	}
		
	public static void main(String[] args) {
		ejeMatrices18 matrix = new ejeMatrices18();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
	}
}
