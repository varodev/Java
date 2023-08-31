package vectores;
import java.util.*;
public class ejeArray11 {

		Scanner scanner;
		int arrayNotas[];
		double media;
		int suma;
		
		public ejeArray11() {//constructor
			scanner = new Scanner(System.in);
		}
		
		public void vect () {
			arrayNotas=new int[10];
			for(int i=0;i<10;i++) {
				System.out.println("dime la " + (i+1) + " nota");
				arrayNotas[i]=scanner.nextInt();	
				suma = suma + arrayNotas[i];
			}
		}//vect
	
		public void imprimir() {
			for (int i=0;i<10;i++) {
				media = suma/10;
			}
			System.out.println(media);
		}//imprimir
		
	public static void main(String[] args) {
        ejeArray11 alumno= new ejeArray11();
		alumno.vect();
		alumno.imprimir();
	}//main
}//ejeArray11
