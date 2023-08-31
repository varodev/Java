package vectores;
import java.util.*;
public class ejeArray27 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int elemento;
	int posicion;
	
	int []matrix;
		
	public void rellenar() {
		matrix=new int[10];
	System.out.println("Autorellenado");
	for(int i=0;i<8;i++) {
		matrix[i]=rnd.nextInt(8)+1;
	}
	
	for (int i=0; i<8;i++) {
		System.out.print(matrix[i]);
	}
		
	System.out.println("\n"+"Nuevo elemento");
	elemento=scanner.nextInt();
	
	System.out.println("Posicion donde insertar (0 a 8)");
	posicion=scanner.nextInt();
		
	}//rellenar
	
	//posicion entre 0 y 8 (valor distinto daria error)
	//ahora desplazaremos los elementos de la tabla, desde posicion hasta el último (que seria el 7)
	public void comprobar() {
		for(int i=7;i>=posicion;i--) {
			matrix[i+1]=matrix[i];
			matrix[posicion]=elemento;
		}
			System.out.println("La tabla queda: ");
			for (int i=0;i<9;i++) {
				System.out.print(matrix[i]);
			}
		}//comprobar
				
  public static void main(String[] args) {
	ejeArray27 nomb = new ejeArray27();
	   nomb.rellenar();
	   nomb.comprobar();
  }//main
}//ejeArray26
