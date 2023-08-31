package pooFicheros;
import java.io.*;
public class EjemploFicherosFBReader {

	public static void main(String[] args) throws IOException {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null; //BufferedReader para poder hacer una lectura comoda con el metodo readLine()
		try {
			f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficherocancion.txt");
			fr = new FileReader(f); // lee
			br = new BufferedReader(fr);

			 String linea; // Lectura del fichero

			 while ((linea = br.readLine()) != null) {
                 System.out.println(linea);
			 }
		    } catch (Exception e) {
			System.out.println(e.getMessage());
		    } 
		    fr.close();
		    br.close();
	}
}
