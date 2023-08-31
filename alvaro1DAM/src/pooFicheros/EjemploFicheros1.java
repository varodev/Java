package pooFicheros;
import java.io.*;
public class EjemploFicheros1 {

	public static void main(String[] args ) throws IOException {
		File f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros");
		System.out.println("Nombre: " + f.getName() );
		System.out.println("Camino: " + f.getPath() );

		if(f.exists()) {
			System.out.println( "Fichero existente " ); 
			
			System.out.println(f.canRead()? " y se puede Leer:":"");
			System.out.println(f.canWrite()? " y se puede Escribir":"");
			System.out.println( "La longitud del fichero " + f.length() + " bytes" );
			//f.delete(); borrar el fichero
		}else {
			System.out.println("El fichero no existe. Se creará");
			f.createNewFile();
		}
		
	}
}

