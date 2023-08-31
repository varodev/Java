package matrices;
import java.util.*;
public class ejeMatrices1 {
	Scanner scanner;
	int NUM[][];
	Random rnd=new Random();
	int nMenor=9;
		
	public void rellenar(){
		scanner= new Scanner(System.in);
		NUM= new int[10][20];
			for(int f=0; f<10;f++) {
				for (int c=0; c<20;c++) {
					NUM[f][c]=rnd.nextInt(8)+1;
				}
			}
	}//rellenar
	
	public void mostrar() {
		for(int f=0; f<10; f++) {
			for(int c=0;c<20;c++) {
				System.out.print(NUM[f][c]+" ");
			}
			System.out.println();
		}
	}//mostrar
	
	public void menor() {
		for(int c=0; c<20;c++) {
			for (int f=0; f<10;f++) {
				if(nMenor>NUM[f][c]) {
					nMenor=NUM[f][c];
				}
			}
			System.out.println("El valor menor de la columna " + (c+1) + " es " + nMenor);
			}
	}//menor
			
	public static void main(String[] args) {
		ejeMatrices1 matrix = new ejeMatrices1();
			matrix.rellenar();
			matrix.mostrar();
			matrix.menor();
	}
}
