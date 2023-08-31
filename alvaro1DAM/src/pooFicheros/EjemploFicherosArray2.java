package pooFicheros;
import java.io.*;
public class EjemploFicherosArray2 {
	/*Tenemos  un archivo .txt con el formato:
	123456789
	
	en donde cada numero tengo que pasarlo a una posición de un vector ej:

	vector[0]=1
	vector[1]=2
	.......*/
	public static void main(String[] args) throws IOException {
		char[] datos = new char[10];
		int n = 0;
		BufferedReader br=null;
		try {
			 br = new BufferedReader(new FileReader("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroArray2.txt"));
			int read = br.read();

			while (read != -1) {
				if(read!='\n'&& read!='\r'){
				datos[n] = (char) read;
				n++;
				}
				read = br.read();

			}
			for (int i = 0; i < datos.length; i++) {
				System.out.print(datos[i] + "  ");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("se sale del array" + e);
		} catch (IOException e) {
			System.out.println("error E/S" + e);
		}
		br.close();
	}
}
