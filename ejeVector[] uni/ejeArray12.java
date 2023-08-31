package vectores;
import java.util.*;
public class ejeArray12 {

		Scanner scanner = new Scanner(System.in);
		int n;
		int suma=0;
		double multi=1;
		int array[];
		
		public void cargar () {
		System.out.println("ingresa los elementos del vector");
			n = scanner.nextInt();
		array = new int [n];
			for (int i=0;i<n;i++) {
				System.out.println("introduce " + (i+1) + " numero");
				array[i] = scanner.nextInt();
			}//for
		}//cargar
			
		public void imprimir () {
			for (int i=0;i<array.length;i++) { 
				if (array[i]%2==0) {
					multi=multi*array[i];
				}else{
					suma=suma+array[i];
				}
			}
			System.out.println("La suma es " + suma);
			System.out.println("La multiplicacion es " + multi);
		}
	public static void main(String[] args) {
        ejeArray12 num1= new ejeArray12();
		num1.cargar();
		num1.imprimir();
	}//main
}//ejeArray10
