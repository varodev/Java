package pooFicheros;
import java.io.*;
public class EjemploFicheros2 {
//vamos a crear un fichero que no existe. vamos a escribir en cada linea la palabra Linea y el numero que corresponde a esa linea
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null; //declaración vacia de objetos
		PrintWriter pw = null; //declaración vacia de objetos
		
		try {
			fw = new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroprueba1.txt", true);
			pw = new PrintWriter(fw);
			
			for (int i=0;i<10;i++) {
				pw.println("Linea " + i);
			}
			pw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			fw.close();
			pw.close();
		}
	}//main
}
