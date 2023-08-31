package pooFicheros;
import java.io.*;

public class EjemploFicherosMoverFicheros {
	public static void main(String[] args) {
			String ruta = "C:\\Users\\Alumno\\Desktop\\pilar\\PROGRAMACION";
			String rutaMovido = "C:\\Users\\Alumno\\Desktop\\pilar\\PROGRAMACION\\mover";
			String NombreF = "cancionMovida.txt";
				
			    File archivo = new File(ruta,NombreF);
				File archivoMovido = new File (rutaMovido,NombreF);
					if(archivoMovido.exists()) {
						System.out.println("Fichero en la ruta, no hace falta mover");
					}else {
						archivo.renameTo(archivoMovido);
						System.out.println("Fichero movido");
					}
	}
}
