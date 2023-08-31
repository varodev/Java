package vectores;
import java.util.*;
public class ejeArray31 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int posicion;
	int i=0;
		
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[10];
	System.out.println("Autorelleno");
	for(int i=0;i<10;i++) {
		matrix[i]=rnd.nextInt(8)+1;
	}
	System.out.println("Queda asi");
	for(int i=0;i<10;i++) {
		System.out.print(matrix[i] + " ");
	}
	}//rellenar
	
	public void comprobar() {
	System.out.println("\nPosición a eliminar");
	posicion=scanner.nextInt();
	
	for (int i=posicion;i<9;i++) {
	matrix[i]=matrix[i+1];//accion de sobreescribir	
	}
	
	System.out.println("La tabla queda: ");
	for(int i=0;i<9;i++) {
		System.out.print(matrix[i] + " ");
	}
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray31 nomb = new ejeArray31();
		nomb.rellenar();
		nomb.comprobar();
  }//main
}//ejeArray31
