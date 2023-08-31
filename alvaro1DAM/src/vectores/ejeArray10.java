package vectores;
import java.util.*;
public class ejeArray10 {
		Scanner scanner = new Scanner(System.in);
		int numero[];
				
		public void cargar () {
			System.out.println("dime el tamaño del array");
			int tam = scanner.nextInt();
		numero = new int[tam];
						
			for (int i=0;i<tam;i++) {
				System.out.println("dime el numero " + (i+1));
				numero[i]=scanner.nextInt();
			}//for
		}//cargar
		
		public void imprimir() {//setter
			for (int i=0;i<numero.length;i++) {
				System.out.print(numero[i] + " ");
			}
		}//imprimir
	
	public static void main(String[] args) {
		ejeArray10 num1= new ejeArray10();
		num1.cargar();
		num1.imprimir();
	}//main
}//ejeArray10
