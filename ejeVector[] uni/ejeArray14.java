package vectores;
import java.util.*;
public class ejeArray14 {

		Scanner scanner;
		int numb[];
					
		public void Guardar() {
			scanner=new Scanner(System.in);
			numb = new int[5];	
			    for (int i=0; i<numb.length;i++) {
					System.out.println("Escribe número " + (i+1));
					numb[i]=scanner.nextInt();
				}
		}//Guardar
		
		public void verPosicion() {
			System.out.println("introduce nuevo numero a comprar en el vector");
			int numero = scanner.nextInt();
				for (int i=0; i<numb.length;i++) {	
					if (numero==numb[i]) {
					System.out.println("Esta en el vector, posicion " + i);	
					}else {
						System.out.println("No esta en el vector");
					}
                }//for
		}//verPosicion
	
    public static void main(String[] args) {
      ejeArray14 eje= new ejeArray14();
		eje.Guardar();
		eje.verPosicion();
	}//main
}//ejeArray14
