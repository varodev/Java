package vectores;
import java.util.*;
public class ejeArray30 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int sitio_num=0;
	int i=0;
	int j=0;
	
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[6];
	
	for(int i=0;i<5;i++) {
		System.out.println("Introduce número (ordenado  de manera creciente)");
		matrix[i]=scanner.nextInt();
	}
	}//rellenar
	
	public void comprobar() {
	//buscaremos el sitio donde deberia ir num
		while(matrix[i]<num && j<=4) {
			sitio_num++;
			j++;
		}
		//desplazaremos los elementos desde el sitio_num hasta final
		//asi haremos un hueco para num
		for (i=4;i>=sitio_num;i--) {
			matrix[i+1]=matrix[i];
		}
		//poner num en su sitio(todo siga ordenado)
		matrix[sitio_num]=num;
		
		System.out.println("La nueva serie ordenada queda: ");
		for(i=0;i<5+1;i++) {
			System.out.println(matrix[i]);
		}
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray30 nomb = new ejeArray30();
		nomb.rellenar();
		nomb.comprobar();
  }//main
}//ejeArray30
