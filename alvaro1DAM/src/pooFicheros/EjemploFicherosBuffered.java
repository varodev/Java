package pooFicheros;
import java.io.*;
public class EjemploFicherosBuffered {

	public static void main(String[] args) {
		 try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroprueba.txt",true));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroprueba.txt"));
		 	
	    escribir(bw);
	    bw.flush();//importante para poder guardar la informacion
	    leer(br);
	      }catch (IOException e) {
		  System.out.println("error E/S" + e.toString());
	      }
	}
	
	public static void escribir(BufferedWriter bw) throws IOException {
		//Escribiremos en el fichero
		bw.write("Esto es un prueba");
		bw.newLine();//salto de linea
		bw.write("Seguimos usandolo");
		bw.newLine();//salto de linea
	}
	
	public static void leer(BufferedReader br) throws IOException {
		//leemos el fichero, lo guardamos en el fichero y lo mostraremos por pantalla
		String linea ;//lea una linea
			while((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
	}
}
