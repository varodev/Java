package vectores;
public class ejeArray2 {
	public static void main(String[] args) {
		int numero =0;
	int matrix[] = new int [150];
	
	for (int i = 0; i < matrix.length; i++) {
		matrix[i]=(int)Math.round(Math.random()*100);
	}//for
	
	for (int e: matrix) {
		numero++;
		System.out.println(numero + ". " + e);
	}//for each
	}//main
}//ejeArray2
