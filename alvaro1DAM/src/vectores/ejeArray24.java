package vectores;
import java.util.*;
public class ejeArray24 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextLine();
	int []matrix1;
	int []matrix2;
	int []matrix3;
	
	public void rellenar() {
		
	matrix1=new int[10];
	matrix2=new int[10];
	matrix3=new int[20];
	System.out.println("Primera tabla:");
	for(int i=0;i<matrix1.length;i++) {
		matrix1[i]=rnd.nextInt(8)+1;
		System.out.print(matrix1[i] + " ");
	}
	System.out.println("\n" +"Segunda tabla:");
	for(int i=0;i<matrix2.length;i++) {
		matrix2[i]=rnd.nextInt(8)+1;
		System.out.print(matrix2[i] + " ");
	}
	//asignaremos los elementos de la tabla c
	
	int j=0;//La j se incrementara cada vez que se añade un elemento a la tabla c
	for (int i=0; i<10; i++) {
		matrix3[j]=matrix1[i];
		j++;
		matrix3[j]=matrix2[i];
		j++;
	}
	System.out.println("\n" +"La tercer tabla queda: ");
	for (j=0; j<20;j++) {
		System.out.print(matrix3[j]+ " ");
	}
	}//rellenar
			
  public static void main(String[] args) {
	ejeArray24 nomb = new ejeArray24();
	 nomb.rellenar();
	 //nomb.operacion();
  }//main
}//ejeArray24
