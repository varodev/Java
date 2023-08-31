package pooExcepciones;
import java.util.*;
public class ExcepcionesEjemplo4Main {

	public static void main(String[] args) {
		 try {
	            double  x = leerValor();//meter el valor leerValor() en el siguiente syso
	            System.out.println("Raiz cuadrada de " + x + " = " + Math.sqrt(x));
	     }catch (ExcepcionesEjemplo4 e) {
	                System.out.println(e.getMessage());
	     }
	}
	
	public static double leerValor() throws ExcepcionesEjemplo4{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce número mayor que 0 ");
        double n = scanner.nextDouble();
        if (n < 0) {
            throw new ExcepcionesEjemplo4("El número debe ser positivo");
            //constructor de la clase ExcepcionesEjemplo4
        }
        return n;
    }
}
