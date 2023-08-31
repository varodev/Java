package vectores;
import java.util.*;
public class ejeArray22 {
    Scanner scanner = new Scanner(System.in);
	int  num;//scanner.nextLine();
	
	int []matrix;
	
	public void rellenar() {
		
	matrix=new int[5];
		for(int i=0;i<matrix.length;i++) {
			System.out.println("introduce el " + (i+1) + " número");
			matrix[i]=scanner.nextInt();
		}
	}//name
	
	public void inverso() {
		for(int i=matrix.length-1;i>=0;i--) {
		System.out.print(matrix[i] + " ");
		}
	}
			
 public static void main(String[] args) {
	ejeArray22 nomb = new ejeArray22();
     nomb.rellenar();
	 nomb.inverso();
 }//main
}//ejeArray22
