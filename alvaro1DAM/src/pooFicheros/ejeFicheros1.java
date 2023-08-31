package pooFicheros;
import java.io.*;
public class ejeFicheros1 {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero1.txt");
		FileReader in = new FileReader(f);//para leeer
		
		String linea;
		int l,c,i;
		i=1;
		while((c=in.read())!=-1) {
			l=1;
			linea=""+(char)c;
			
			System.out.println("En la linea " + i + "hay" + l + " letra");
			i++;
			System.out.println("linea " + linea);
		}
		in.close();
	}
}
