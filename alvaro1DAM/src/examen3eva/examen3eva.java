package examen3eva;
import java.io.*;
import java.util.*;
public class examen3eva {
	

	public static void main(String[] args) throws Exception {
		
		menu();
	}
	
	public static void menu() throws Exception {
		Scanner scanner = new Scanner (System.in);
			System.out.println("Hola bienvenido, introduce la opci�n del menu");
			System.out.println("1. Comprobar si dicho fichero existe");
			System.out.println("2. Escribir en fichero de texto");
			System.out.println("3. Mostrar por pantalla el contenido");
			System.out.println("4. Mostrar el contenido de un Directorio");
			System.out.println("5. Borrar un fichero");
			System.out.println("6. Borrar un directorio");
			System.out.println("7. Salir");
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1: comprobarExiste(); menu();
			case 2: escribirFichero(); menu();
			case 3: mostrarContenidoF(); menu();
			case 4: mostrarContenidoD(); menu();
			case 5: borrarF();menu();
			case 6: borrarD();menu();
			case 7: salir();
			default:
				System.out.println("opcion incorrecta, intentenlo de nuevo"); menu();
			}//switch
		
	}//menu()
	
	public static void comprobarExiste() {
		Scanner scanner = new Scanner (System.in);
			System.out.println("Ha elegido: 1. Comprobar si dicho fichero existe");
			
			String ruta = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
			System.out.println("dame nombre de un fichero a consultar");
			String fichero = scanner.next();
			
			File f = new File(ruta,fichero);
			
			if(f.exists()) {
				System.out.println("fichero existente");
			}else {
				System.out.println("fichero inexistente");
			}	
		
	}//comprobarExiste()
	
	public static void escribirFichero() throws Exception {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ha elegido: 2. Escribir en fichero de texto");
			System.out.println("dame una ruta");
			String ruta = scanner.next();
			System.out.println("dame nombre de un fichero donde quieras escribir");
			String fichero = scanner.next();
			
			File f = new File(ruta,fichero);
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			
			System.out.println("Vamos a escribir en el fichero 5 nombres y apellidos");
			for (int i=0; i<5;i++) {
			   System.out.println("nombre y apellido " + (i+1));
				//String nombre = scanner.next();
				bw.write(scanner.next());
				System.out.println("siguente...");
				bw.newLine();
			}
			bw.flush();
			bw.close();
			System.out.println("archivo escrito");
			
		
	}//escribirFichero()
	
	public static void mostrarContenidoF() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ha elegido: 3. Mostrar por pantalla el contenido");
			System.out.println("dame una ruta");
			String ruta = scanner.next();
			System.out.println("dame nombre de un fichero donde quieres leer");
			String fichero = scanner.next();
			
			File f = new File(ruta,fichero);
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String linea=null;
			
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
			System.out.println("archivo leido");
			br.close();
		
	}//mostrarContenidoF()
	
	public static void mostrarContenidoD() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ha elegido: 4. Mostrar el contenido de un Directorio");
			System.out.println("dame una ruta donde quieras mostrar el contenido de un directorio");
			String ruta = scanner.next();
			
			File f = new File(ruta);
			
				if(f.exists() && f.isDirectory()) {
				File[] ficheros = f.listFiles();//array donde se guarda el contenido del directorio
				System.out.println("Contiene...");	
				for(int i=0; i<ficheros.length;i++) {
					  System.out.println(ficheros[i].getName());//se visualiza el interior	
					}
				}else {
					System.out.println("No existen directorios");
					}
		
	}//mostrarContenidoD()
	
	public static void borrarF() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ha elegido: 5. Borrar un fichero");
		String ruta = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
			System.out.println("dame nombre de un fichero a borrar");
			String fichero = scanner.next();
			
			File f = new File(ruta,fichero);
			
				
			//f.delete();    
			
				if(f.delete()) {
					System.out.println("El fichero ha sido borrado");
				}else {
					System.out.println("El fichero no se ha podido borrar");
				}
		
	}
		
	public static void borrarD() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ha elegido: 6. Borrar un directorio");
		System.out.println("dame una ruta");
		String ruta = scanner.next();
				
		File f = new File(ruta);
		 borrarDire(f);
		  if (f.delete()) {
			  System.out.println("El directorio ha sido borrado");
		  }else {
			  System.out.println("El directorio no se ha podido borrar");
		  }
		 
		}//borrarD()
			
		 public static void borrarDire(File f) {//como no se puede borrar un directorio con ficheros, se ha de hacer un m�todo que lo liste primero en un array, es una medida de seguridad de Java
		  File[] ficherosB = f.listFiles();
		   for(int i=0; i<ficherosB.length;i++) {
			   if(ficherosB[i].isDirectory()) {
				   borrarDire(ficherosB[i]);
			   }
			   ficherosB[i].delete();
			}
	}
		 public static void salir() {
			 System.out.println("Ha elegido: 7. Salir");
			 System.out.println("Garcias por usar la aplicacion, adios");
			 System.exit(0);
		 }
}
