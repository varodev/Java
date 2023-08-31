package matrices;
public class ejeMatrices4_1 {
	int f;
	int c;
	int i;
	int [][] NUM;
	int [] TOTAL;
	
	//MODO ELEGANTE	
	public void rellenar(){
		System.out.println("Autorellenado...");
		NUM= new int[5][5];
			for(int f=0; f< NUM.length;f++) {
				for (int c=0; c<NUM[f].length;c++) {
					if(f==c || c==NUM[f].length-1-f ) {
						NUM[f][c]=1;
					}else {
						NUM[f][c]=0;
					}
					
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
	
	public static void main(String[] args) {
		ejeMatrices4_1 matrix = new ejeMatrices4_1();
			matrix.rellenar();
			matrix.imprimir();
		    
	}

}
