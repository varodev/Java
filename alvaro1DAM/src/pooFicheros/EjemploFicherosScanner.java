package pooFicheros;
import java.io.*;
import java.util.*;
public class EjemploFicherosScanner {

	public static void main(String[] args) {
		File f = null;
		Scanner scanner = null; //leer por Scanner
		String cadena;
		
		try {
			f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroprueba.txt");
			scanner = new Scanner(f);//se crea un Scanner asociado al fichero
			 while(scanner.hasNext()) {//mientras no se alcance el final del fichero
				cadena=scanner.nextLine();//se lee una linea del fichero
				System.out.println(cadena);//se muestra por pantalla
			 }
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
}
