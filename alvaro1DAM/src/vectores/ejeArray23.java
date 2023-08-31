package vectores;
import java.util.*;
public class ejeArray23 {
    Scanner scanner = new Scanner(System.in);
	int  num;//scanner.nextLine();
	int sum_pos=0;
	int counterPos=0;
	int sum_neg=0;
	int counterNeg=0;
	int counterZero=0;
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[5];
		for(int i=0;i<matrix.length;i++) {
		System.out.println("introduce el " + (i+1) + " número");
		matrix[i]=scanner.nextInt();
		}
	}//rellenar
	
	public void operacion() {
		for(int i=0;i<matrix.length;i++) {
			if (matrix[i]==0) {
				counterZero++;
			}
			else {
				if(matrix[i]>0) {
					sum_pos=sum_pos+matrix[i];
					counterPos++;
				}
				else {
					sum_neg=sum_neg+matrix[i];
					counterNeg++;
				}
			}
		}
		if(counterPos==0) {
			System.out.println("No se puede hacer la media positivas");
		}else {
			System.out.println("La media es " + (float)sum_pos/counterPos);
		}
		if(counterNeg==0) {
			System.out.println("No se puede hacer la media negativa");
		}else {
			System.out.println("La media es " + (float)sum_neg/counterNeg);
		}
		System.out.println("La cantidad de ceros es de " + counterZero);
	}//operacion
		
  public static void main(String[] args) {
	ejeArray23 nomb = new ejeArray23();
		nomb.rellenar();
		nomb.operacion();
   }//main
}//ejeArray22
