package vectores;
import java.util.*;
public class ejeArray33 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
		
	int []matrix;
		
	public void rellenar() {
		
	matrix=new int[10];
	for(int i=0;i<matrix.length;i++) {
		System.out.println("introduce " + (i+1) + " numero");
		matrix[i]=scanner.nextInt();
	}
	for(int i=0;i<matrix.length;i++) {
		System.out.print(matrix[i] + " ");
	}
	}//rellenar
	
	public void comprobar() {
	System.out.println("introduce número a buscar");
	num=scanner.nextInt();
	int j=0;
	
	while(j<10 && matrix[j]<num) {
	j++;	
	}//finaliza while por llegue a 10 o encuentre él donde iría num en la tabla
	
	if (j==10) {
		System.out.println("No se ha encontrado nada");
	}else {//si matrix[j]<num, hemos sobrepasado el lugar donde debería estar num, sin encontrarlo
		if(matrix[j]==num) {
			System.out.println("encontado en la posición " + j);
		}else {
			System.out.println("no encontrado");
		}
	}
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray33 nomb = new ejeArray33();
	   nomb.rellenar();
	   nomb.comprobar();
  }//main
}//ejeArray33
