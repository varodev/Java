package vectores;
import java.util.*;
public class ejeArray25 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextLine();
	int []matrix1;
	int []matrix2;
	int []matrix3;
	
	public void rellenar() {
		
	matrix1=new int[12];
	matrix2=new int[12];
	matrix3=new int[24];
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
	int i=0;
	int j=0;
	int k=0;
	while (i<12) {
		//copiamos 3 de a
		for (j=0;j<3;j++) {
			matrix3[k]=matrix1[i+j];
			k++;
		}
		for (j=0;j<3;j++) {
			matrix3[k]=matrix2[i+j];
			k++;
		}
		//incrementar la i en 3
		i+=3;
		//La j se incrementara cada vez que se añade un elemento a la tabla c
	}
	System.out.println("\n"+"La tabla 3 queda: ");
	for(k=0;k<24;k++) {
		System.out.print(matrix3[k] + " ");
	}
	}//rellenar
			
   public static void main(String[] args) {
	ejeArray25 nomb = new ejeArray25();
		nomb.rellenar();
   }//main
}//ejeArray25
