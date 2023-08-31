package vectores;
public class ejeArray3 {
	public static void main(String[] args) {

		int numero = 1;
		
	String matrix[] = new String [10];
	
	for (int i = 1; i < matrix.length; i++) {
		matrix[0]="Madrid";
		matrix[1]="Lisboa";
		matrix[2]="Paris";
		matrix[3]="Londres";
		matrix[4]="Atenas";
		matrix[5]="Berlin";
		matrix[6]="Viena";
		matrix[7]="Varsovia";
		matrix[8]="Dublin";
		matrix[9]="Praga";
	}//for
	
	for (String e: matrix) {
		System.out.println(numero++ + ". " + e);
	}//for each
	}//main
}//ejeArray3
