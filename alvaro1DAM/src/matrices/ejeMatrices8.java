package matrices;
import java.util.*;
public class ejeMatrices8 {
	Random rnd = new Random();
	int f;
	int c;
	int array[][];
	int vector[];
	int counter=0;
	int tamVector;
	int posicion;
	int i=0;
			
	public void rellenar(){
		System.out.println("Autorellenado...");
		array= new int[5][5];
		vector=new int[tamVector];
		
		for(int f=0; f< array.length;f++) {
				for (int c=0; c<array[f].length;c++) {
					array[f][c]=rnd.nextInt(3);
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<array.length;f++) {
			System.out.println();
			for (int c=0; c<array[f].length;c++) {
				System.out.print(array[f][c] + " ");
			}
		}
	}//imprimir
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f< array.length;f++) {
			for (int c=0; c<array[f].length;c++) {
				if (array[f][c]!=0) {
					counter++;
				}
			}
		}
		tamVector=counter*3;//es por 3 por filas, columnas y posicion(indices)
				
		for (int f=0; f< array.length;f++) {
				for (int c=0; c<array[f].length;c++) {
					if(array[f][c]!=0) {
						vector[i]=f;//introducir fila vector
						i++;
						vector[i]=c;//introducir columna vector
						i++;
						vector[i]=array[f][c];//valor de la matriz en el vector
						i++;
					}
				}
		}
		//vector=new int[tamañoVector];
		for (int i=0; i<tamVector; i++) {
			System.out.print(vector[i] + " ");
		}
	}//operar	
		
	public static void main(String[] args) {
		ejeMatrices8 matrix = new ejeMatrices8();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
	}
}
