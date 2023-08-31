package vectores;
import java.util.*;
public class ejeArray28 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int elemento;
	int ultimo;
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[10];
	System.out.println("Autorellenado");
	for(int i=0;i<10;i++) {
		matrix[i]=rnd.nextInt(8)+1;
		System.out.println("La posicion " + i + " es " + matrix[i]);
	}
	
	}//rellenar
	public void comprobar() {
		//guardamos el último elemento de la tabla
		ultimo=matrix[9];
		
		//desplazamos hacia abajo (0 a última posición)
		//al desplazar perdemos el último valor xo guardad en la variable último
	for(int i=8;i>=0;i--) {//es de 8 por se varia la primera y última
		matrix[i+1]=matrix[i];
	}
	matrix[0]=ultimo;
	
	System.out.println("\n" + "La tabla queda: ");
	for (int i=0; i<10;i++) {
		System.out.println("La nueva posicion " + i + " es " + matrix[i]);
	}
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray28 nomb = new ejeArray28();
		nomb.rellenar();
		nomb.comprobar();
  }//main
}//ejeArray28
