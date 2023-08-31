package agenda3Eva;
import java.io.FileNotFoundException;
import java.util.*;
public class mainAgenda {

	public static void main(String[] args) throws Exception {
		menu men = new menu();
		try {
		men.menuAgenda();
		}catch (InputMismatchException e){
			System.out.println("La opción insertada debe ser un número entero comprendido de 1 a 0 " + e.toString());
			
		}catch(FileNotFoundException e) {
			System.out.println("El nombre del fichero introducido no es correcto " + e.toString());
		
		}catch(Exception e) {
			System.out.println("Fallo inesperado " +  e.toString() );
			
		}
	}
}
