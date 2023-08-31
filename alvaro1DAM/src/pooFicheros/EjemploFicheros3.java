package pooFicheros;
import java.io.*;
public class EjemploFicheros3 {

	public static void main(String[] args) throws IOException {
	File fileIn = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroprueba.txt");
	FileReader in = new FileReader(fileIn);//para leeer
	
	String linea;
	int l,c,i;
	i=1;
	while((c=in.read())!=-1) {
		l=1;
		linea=""+(char)c;
		while((char)c !='\n') {
			if(c==' ') {
				l++;
			}
			c=in.read();
			linea=linea+(char)c;
		}
		System.out.println("En la linea " + i + "hay" + l + " palabras");
		i++;
		System.out.println("linea " + linea);
	}
	in.close();
	}
}
