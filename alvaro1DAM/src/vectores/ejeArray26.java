package vectores;
import java.util.*;
public class ejeArray26 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextLine();
	boolean creciente = false;//indicará si estan los números de forma creciente
	boolean decreciente = false;//indicará si estan los números de forma decreciente
	/* 
	 * creciente decreciente
	 *    f           f      -->todos los num sean identicos
	 *    f           t      -->orden decrecientes
	 *    t           f      -->orden creciente
	 *    t           t      -->desordenado
	 */
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[10];
	for(int i=0;i<matrix.length;i++) {
		matrix[i]=rnd.nextInt(8)+1;
		System.out.print(matrix[i] + " ");
	}
	}//rellenar
	
	public void comprobar() {
	for(int i=0;i<9;i++) {
		if(matrix[i]>matrix[i+1]) {
			decreciente=true;
		}
		if(matrix[i]<matrix[i+1]) {
			creciente=true;
		}
	}
	//tipo de ordenacion creciente o decreciente
		if (creciente==false && decreciente ==false) {
			System.out.println("Todos los num son identicos");
		}
		if (creciente==false && decreciente ==true) {
			System.out.println("Orden decreciente");
		}
		if (creciente==true && decreciente ==false) {
			System.out.println("Orden creciente");
		}
		if (creciente==true && decreciente ==true) {
			System.out.println("Orden desordenado");
		}
	
	}//comprobar
	
  public static void main(String[] args) {
	ejeArray26 nomb = new ejeArray26();
	   nomb.rellenar();
	   nomb.comprobar();
  }//main
}//ejeArray26
