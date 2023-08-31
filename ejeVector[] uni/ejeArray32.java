package vectores;
import java.util.*;
public class ejeArray32 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
	int  num;//scanner.nextInt();
	int par;
	int counterPar;
	int impar;
	int counterImpar;
	int i=0;
		
	int []matrix;
	int []matrixPar;	
	int []matrixImpar;
	
	public void rellenar() {
		
	matrix=new int[10];
	
	for(int i=0;i<10;i++) {
		matrix[i]=rnd.nextInt(8)+1;
	}
	
	System.out.println("El vector queda asi:");
	for(int i=0;i<10;i++) {
	System.out.print(matrix[i] + " ");
	}
	
	}//rellenar
	public void comprobar() {
	//contar la cantidad de pares e impares	
		for(int i=0;i<10;i++) {
			if(matrix[i]%2==0) {
				counterPar++;
			}else {
				counterImpar++;
			}
		}
	//Creación de vectores donde se guardan par e impar	
	matrixPar=new int[counterPar];
	matrixImpar=new int[counterImpar];
	
	//Volvemos a procesar para copiar cada elemento en la tabla adecuada(vaciar buffer)
	counterPar=0;
	counterImpar=0;
	
	for(int i=0;i<10;i++) {
		if(matrix[i]%2==0) {
			matrixPar[counterPar]=matrix[i];
			counterPar++;
		}else {
			matrixImpar[counterImpar]=matrix[i];
			counterImpar++;
		}
	}
	System.out.println("\nComo queda la tabla par:");
	for (int i=0; i<counterPar;i++) {
		System.out.print(matrixPar[i] + " ");
	}
	System.out.println("\nComo queda la tabla impar:");
	for (int i=0; i<counterImpar;i++) {
		System.out.print(matrixImpar[i]+ " ");
	}	
	
	}//comprobar
					
  public static void main(String[] args) {
	ejeArray32 nomb = new ejeArray32();
	   nomb.rellenar();
	   nomb.comprobar();
  }//main
}//ejeArray32
