
package vectores;
import java.util.*;
public class ejeArray15 {

		Scanner scanner;
		
		int array1[];
		int array2[];
		int n;
		int comodin;
				
		public void Guardar() {
			scanner=new Scanner(System.in);
			System.out.println("introduce los n elementos");
			int n = scanner.nextInt();
			array1 = new int[n];	
			array2 = new int[n];
				for (int i=0; i<n;i++) {
					System.out.println("Escribe número del primer vector " + (i+1));
					array1[i]=scanner.nextInt();
					
					System.out.println("Escribe número del segundo vector " + (i+1));
					array2[i]=scanner.nextInt();
                }
		}//Guardar
		
		public void comodin() {		
				for (int i=0; i<array1.length;i++) {
					comodin=array1[i];
					array1[i]=array2[i];
					array2[i]=comodin;
				}
		}//comodin
		
		public void imprimir() {
			for (int i=0; i<array1.length;i++) {
				System.out.print(array1[i] + "\t");
			}
			System.out.println(" ");
			for (int i=0; i<array2.length;i++) {
				System.out.print(array2[i] + "\t");
			}
			System.out.println(" ");
		}//imprimir
	
 public static void main(String[] args) {
	 ejeArray15 eje= new ejeArray15();
		eje.Guardar();
		eje.imprimir();
		eje.comodin();
		System.out.println("Dar la vuelta");
		eje.imprimir();
 }//main
}//ejeArray15
