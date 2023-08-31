package vectores;
import java.util.*;
public class ejeArray29 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int n;
	int ultimo;
	int vueltas;
	
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[10];
	System.out.println("Autorellenado");
	for(int i=0;i<10;i++) {
		matrix[i]=rnd.nextInt(8)+1;
		System.out.print(matrix[i]);
	}
	}//rellenar
	
	public void comprobar() {
		System.out.println("\n" + "Posicion a desplazar: ");
		n=scanner.nextInt();
		
	//Si repetimos el proceso n veces, conseguiremos desplazar n veces
		
		for(int vueltas=1; vueltas<=n;vueltas++) {
		ultimo=matrix[9];	
		}
		//matriz igual a 8 por modificamos el primero y últimos
		for (int i=8;i>=0;i--) {
		matrix[i+1]=matrix[i];	
		}
		
		matrix[0]=ultimo;
		
		System.out.println("La tabla queda: ");
		for (int i=0;i<10;i++) {
			System.out.print(matrix[i]);
		}
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray29 nomb = new ejeArray29();
		nomb.rellenar();
		nomb.comprobar();
   }//main
}//ejeArray29
