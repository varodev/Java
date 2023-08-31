package pooFicheros;
import java.io.*;
import java.util.*;
public class ejeFicheros4 {

	private static BufferedWriter bw;

	public static void main(String[] args) throws Exception {
		menu();
	}
	
	@SuppressWarnings("resource")
	public static void menu () throws Exception {
		Scanner scanner = new Scanner(System.in);
        int opcion;
  
            System.out.println("1.Generar un fichero con un nombre dado por teclado.");
            System.out.println("2.Escribir en un fichero preguntando en que fichero quieres escribir.");
            System.out.println("3.Eliminar un fichero indicando el nombre y la ruta.");
            System.out.println("4.Mover un fichero indicando el nombre del fichero y la ruta donde quiere el fichero.");
 
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    crearFichero();menu();
                    break;
                }
                case 2: {
                	escribirFichero(bw);menu();
                    break;
                }
                case 3: {
                    eliminarFichero();menu();
                }
                case 4: {
                	moverFichero();menu();
                }
                default: {
                    System.out.println("Opcion incorrecta"); menu();
                }
             }
    }
	
	public static void crearFichero() throws Exception {	
		try (Scanner scanner = new Scanner(System.in)) {
			String ruta="C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros";
			System.out.println("introduce el nombre del archivo");
			String fichero=scanner.next();
				File f = new File(ruta,fichero);
				BufferedWriter bw = null;// se declara porque se para por parametro al metodo escribir()
			try {
				bw = new BufferedWriter(new FileWriter(f));
			 escribirFichero(bw);
			bw.flush();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				bw.close();
			}
		}
	}
	
	public static void escribirFichero(BufferedWriter bw) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escribe algo");
				String escribir = scanner.next();
			bw.write(escribir);
		}
		bw.newLine();
	}
	
	@SuppressWarnings("resource")
	public static void eliminarFichero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame nombre ruta");
		String ruta = scanner.nextLine();
		System.out.println("Dame nombre fichero");
		String fichero = scanner.nextLine();
		File f = new File(ruta, fichero);
			f.delete();
			if(f.delete()) {
				System.out.println("Fichero borrado");
			}else {
				System.out.println("El fichero no se pudo borrar");
			}
	}
	
	@SuppressWarnings("resource")
	public static void moverFichero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame nombre ruta origen");
		String rutaO = scanner.next();
		System.out.println("Dame nombre ruta destino");
		String rutaD = scanner.next();
		System.out.println("Dame nombre del fichero");
		String fichero = scanner.next();
		
		File f_origen = new File(rutaO, fichero);
		File f_destino = new File(rutaD, fichero);
		
		if(f_destino.exists()) {
			System.out.println("Fichero en la ruta, no hace falta mover");
		}else {
			f_origen.renameTo(f_destino);
			System.out.println("Fichero movido");
		}
	}
	}
