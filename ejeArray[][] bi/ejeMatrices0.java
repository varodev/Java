package matrices;
import java.util.*;
public class ejeMatrices0 {
	Scanner scanner=new Scanner(System.in);
	int [][] ARRAY;
	Random rnd=new Random();
	int numComparar;
	int counter=0;
		
	//Rellenar una matriz de 5x5
	//Buscar un número introducido por teclado, decir cuantas veces aparece en la matriz, decir en que filas y en que columnas
	
	public void rellenar(){
		ARRAY= new int[5][5];
			for(int f=0; f<5;f++) {
				for (int c=0; c<5;c++) {
					ARRAY[f][c]=rnd.nextInt(10)+1;
				}
			}
	}//rellenar
	
	public void mostrar() {
		for(int f=0; f<5;f++) {
			for (int c=0; c<5;c++) {
				System.out.print(ARRAY[f][c]+ " ");
	        }
			System.out.println();
		}
	}
	
	public void buscar() {
		System.out.println("Introduce el numero a comparar");
		numComparar=scanner.nextInt();
		for(int f=0; f<5;f++) {
			for (int c=0; c<5;c++) {
				
				if (ARRAY[f][c]==numComparar) {
					System.out.println("Esta en la fila " + f);
					System.out.println("Esta en la columna " + c);
					counter=counter+1;
				}
			}
		}
		System.out.println("El total de veces que aparece el número " + numComparar + " son " + counter);
	}
		
	public static void main(String[] args) {
		ejeMatrices0 matrix = new ejeMatrices0();
			matrix.rellenar();
			matrix.mostrar();
			matrix.buscar();
	}

}
