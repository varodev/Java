package pooFicheros;
import java.io.*;
public class EjemploFicheros4 {
	/**
	 * Este programa lee un archivo cancion.txt y cuenta cuantas palabras hay en
	 * cada linea del archivo luego copia el archivo de entrada en un archivo de
	 * salida cancionCopia.txt
	 * @throws IOException 
	 * @throws IOException 
	 **/

	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficherocancion.txt");
		FileReader fr = new FileReader(inputFile); // lee
		File outputFile = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficherocancionCopia.txt");
		FileWriter fw = new FileWriter(outputFile);// escribe
		String linea;
		int l, c, i;
		
		i = 1;
		while ((c = fr.read()) != -1) {
			l = 1;
			linea = "" + (char) c;
			while ((char) c != '\n') { 
				if (c == ' ')
					l++;
				c = fr.read();
				linea = linea + (char) c;
			}
			System.out.println("En la linea " + i + " hay " + l + " palabras");
			i++;
			System.out.println("Linea: " + linea);
			fw.write(linea);
		}
		fr.close();
		fw.close();
	}
}


