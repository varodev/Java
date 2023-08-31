package pooFicheros;
import java.io.*;
public class ejeFicheros6 {

	public static void main(String[] args) {
		/*String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\vacio";
		File f = new File(directorio);

		if (f.delete())
			 System.out.println("El fichero " + directorio + " ha sido borrado correctamente");
			else
			 System.out.println("El fichero " + directorio + " no se ha podido borrar");
	}*/ // para borrar un directorio vacio
	
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\die";
		File f = new File(directorio);
		
		borrarDirectorio(f);
		
		if (f.delete()) {
			 System.out.println("El fichero " + directorio + " ha sido borrado correctamente");
		}else {
			 System.out.println("El fichero " + directorio + " no se ha podido borrar");
		}	 
	}
	
	public static void borrarDirectorio(File f) {
		File[] ficheros = f.listFiles();
		for(int i=0; i<ficheros.length;i++) {
			if(ficheros[i].isDirectory()) {
				borrarDirectorio(ficheros[i]);
			}
			ficheros[i].delete();
		}
	}
		
}
