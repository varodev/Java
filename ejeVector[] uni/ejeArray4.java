package vectores;
public class ejeArray4 {
	public static void main(String[] args) {
    
	int matrix[][] = new int [4][5];
	
		matrix[0][0]= 6;
		matrix[0][1]= 9;
		matrix[0][2]= 10;
		matrix[0][3]= -9;
		matrix[0][4]= 4;
	
		matrix[1][0]= 6;
		matrix[1][1]= 7;
		matrix[1][2]= 8;
		matrix[1][3]= -9;
		matrix[1][4]= 11;
	
		matrix[2][0]= 45;
		matrix[2][1]= 46;
		matrix[2][2]= 8;
		matrix[2][3]= 7;
		matrix[2][4]= 7;
		
		matrix[3][0]= 1;
		matrix[3][1]= 2;
		matrix[3][2]= 3;
		matrix[3][3]= 4; 
		matrix[3][4]= 10;
		
		for (int i = 0; i <4; i++) {//int[] fila:matrix
			System.out.println(" ");
			for (int j = 0; j <5; j++) {//int columna:fila
				System.out.print(matrix[i][j] + " ");
			}//for j
		}//for i
	}//main
}//ejeArray4
