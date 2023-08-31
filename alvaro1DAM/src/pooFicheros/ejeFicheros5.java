package pooFicheros;
import java.io.*;
public class ejeFicheros5 {

	public static void main(String[] args) throws Exception {
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros";
		File f = new File(directorio);
		
		if(f.exists()) {
			File[] ficheros = f.listFiles();
				for(int i=0; i<ficheros.length;i++) {
				System.out.println(ficheros[i].getName());	
				}
		}else {
			System.out.println("No existen directorios");
		}

	}

}
