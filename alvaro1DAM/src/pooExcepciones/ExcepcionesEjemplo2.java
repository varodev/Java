package pooExcepciones;
import java.util.*;
public class ExcepcionesEjemplo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
								//Ejemplo de try anidados
			try {//n1
				System.out.println("introduce un numero n1");
				n1=scanner.nextInt();
				/*}catch (InputMismatchException e) {//n1
				scanner.next();
				n1=0;
				System.out.println("Debes introducir un numero");
			}*/
				
				try{//n2
					System.out.println("introduce otro numero n2");
					n2=scanner.nextInt();
					System.out.println(n1 + "/" + n2 + " = " + n1/(double)n2);
					
					}catch(InputMismatchException e) {//n2
					scanner.nextLine();	
					n2=0;
					System.out.println("Debe introducir un numero en n2");
					
					}catch(ArithmeticException e) {//n2
					scanner.nextLine();	
					n2=0;
					System.out.println("No se puede dividir por cero, n2 erroneo");
					}
				
			}catch (InputMismatchException e) {//n1
				scanner.nextLine();
				n1=0;
				System.out.println("Debes introducir un numero en n1");
			}
			scanner.close();
	}
}

