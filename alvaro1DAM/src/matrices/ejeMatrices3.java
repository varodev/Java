package matrices;
import java.util.*;
public class ejeMatrices3 {
	Scanner scanner= new Scanner(System.in);
	Random rnd = new Random(); 
	int f;
	int c;
	int i;
	int NUM[][];
	int TOTAL[];
	int TOTAL2[];
	int sumFilas;
	int sumColumnas;
			
	public void rellenar(){
		System.out.println("Autorellenado...");
		scanner= new Scanner(System.in);
		NUM= new int[10][15];
		TOTAL = new int[10];
		TOTAL2 = new int[15];
			for(int f=0; f< 10;f++) {
				for (int c=0; c<15;c++) {
					NUM[f][c]=rnd.nextInt(8)+1;
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<10;f++) {
			System.out.println();
			for (int c=0; c<15;c++) {
				System.out.print(NUM[f][c] + " ");
			}
		}
	}
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int f=0; f< 10;f++) {
			for (int c=0; c<15;c++) {
				sumFilas=sumFilas+NUM[f][c];
			}
			TOTAL[f]=sumFilas;
			sumFilas=0;
		}
		for ( f=0; f<10;f++) {
			System.out.print(TOTAL[f] + " ");
		}
	}
	
	public void operar2() {
		System.out.println();
		System.out.println("\nOperando...");
		for(int c=0; c< 15;c++) {
			sumColumnas=0;
			for (int f=0; f<10;f++) {
				sumColumnas=sumColumnas+NUM[f][c];
			}
			TOTAL2[c]=sumColumnas;
			sumColumnas=0;
		}
		for ( c=0; c<15;c++) {
			System.out.print(TOTAL2[c] + " ");
		}
	}
				
	public static void main(String[] args) {
		ejeMatrices3 matrix = new ejeMatrices3();
			matrix.rellenar();
			matrix.imprimir();
			matrix.operar();
			matrix.operar2();
	}
}
