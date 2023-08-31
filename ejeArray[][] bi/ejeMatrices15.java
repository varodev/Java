package matrices;

public class ejeMatrices15 {
	
	int [][] matrix;
	int f,c;
	
	
	
	
	public void rellenar(){
		System.out.println("Autorellenado...");
		
		 matrix= new int[7][7];
			for(int f=0; f< matrix.length;f++) {
				for (int c=0; c<matrix[f].length;c++) {
					if(f==c) {
						matrix[f][c]=1;
					}
					else {
						matrix[f][c]=0;
					}
					
					
			
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
		

			
	public static void main(String[] args) {
		ejeMatrices15 matrix = new ejeMatrices15();
			matrix.rellenar();
			matrix.imprimir();
			
			
	}

}
