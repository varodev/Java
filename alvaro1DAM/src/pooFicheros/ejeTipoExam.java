package pooFicheros;
import java.util.*;
import java.io.*;
public class ejeTipoExam {
	
	private static final BufferedReader BufferedReader = null;//se crea el objeto para que sirva para todo los métodos 

	public static void main(String[] args)  {
		try {
			menu();
		} catch (NoSuchElementException e) {
			e.toString();
		} catch (NullPointerException e) {
			e.toString();
		}catch (Exception e) {
			e.toString();
		}
	}
		
	public static void menu() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		System.out.println("\nBienvenido al menu de ficheros, teclee la opción deseada++++++++++++++++++");
		System.out.println("1.Comprobar que existe el fichero, sino crearlo.");
		System.out.println("2.Comprobar sí es un fichero o un directorio.");
		System.out.println("3.Cambia el nombre de un fichero.");
		System.out.println("4.Visualiza el nombre del fichero.");
		System.out.println("5.Visualiza la longitud de un fichero.");
		System.out.println("6.Guarda 10 nombres  de alumnos en el fichero, cada nombre en una línea");
		System.out.println("7.Buscar un nombre de un alumno en el fichero (si está decir en la línea");
		System.out.println("8.Visualiza el contenido de un fichero");
		System.out.println("9.Copia el contenido del fichero en un array unidimensional.");
		System.out.println("10.Copia el contenido del fichero en un ArrayList");
		System.out.println("11.Salir+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:exiteF();menu();
			break;
		case 2:fOd();menu();
			break;
		case 3:cambiaNombre();menu();
			break;
		case 4:visualizaNombreF();menu();
			break;
		case 5:visualizaLongF();menu();
			break;
		case 6:guardaNombre();menu();
		    break;	
		case 7:buscaNombre();menu();
			break;
		case 8:visualizaContenido(BufferedReader);menu();
		    break;	
		case 9:copiaAL(BufferedReader);menu();
		    break;
		case 10:copiaA(BufferedReader);menu();
		    break;
		case 11:
			System.out.println("Adios, bye bye");
			System.exit(0);
		    break;
		
		default:
			System.out.println("Opción incorrecta");
			menu();
		}
		scanner.close();
	}//menu()
	
	public static void listar() {//metodo listar() que se usa en el resto de métodos
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		File f = new File(directorio);
			if(f.exists()) {
			File[] ficheros = f.listFiles();
			System.out.println("La carpeta alberga estos ficheros, introduce el nombre con la extensión:");
				for(int i=0; i<ficheros.length;i++) {
					 System.out.println(ficheros[i].getName());	
				}
			}else {
				System.out.println("No existen directorios");
				}
	}
	
	@SuppressWarnings("resource")
	public static void exiteF() throws Exception {//1.Comprobar que existe el fichero, sino crearlo
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("Introduce el nombre del fichero, no olvide poner .txt");
		String fichero = scanner.next();
		File f = new File(directorio,fichero);
		
		if (f.exists()) {
			System.out.println("Fichero existente");
		}else {
			f.createNewFile();
			System.out.println("el fichero no se encontró, se crea");
		}
	}
	
	@SuppressWarnings("resource")
	public static void fOd() {//2.Comprobar sí es un fichero o un directorio
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("Introduce el nombre del fichero, no olvide poner .txt");
		String fichero = scanner.next();
		File f = new File(directorio,fichero);
		
		if(f.isFile()) {
			System.out.println("Es un fichero");
		}
		
		if(f.isDirectory()) {
			System.out.println("Es un directorio");
		}
	}
	
	@SuppressWarnings("resource")
	public static void cambiaNombre() {//3.Cambia el nombre de un fichero
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("Introduce el nombre del fichero a modificar");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		System.out.println("Introduce el nuevo nombre del fichero");
		String fichero2 = scanner.next();
		File f2 = new File(directorio, fichero2);
		
		boolean cambio = f1.renameTo(f2);
		
		if(cambio) {
		    System.out.println("nombre del fichero cambiado");
		}else {
			System.out.println("nombre del fichero no ha cambiado");	
		}
	}
	
	@SuppressWarnings("resource")
	public static void visualizaNombreF() {//4.Visualiza el nombre del fichero
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		
		System.out.println("El nombre elegido es " + f1.getName());
	}
	
	@SuppressWarnings("resource")
	public static void visualizaLongF() {//5.Visualiza la longitud de un fichero
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\DESCARGAS\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		
		System.out.println("la longuitud es " + f1.length());
	}
	
	@SuppressWarnings("resource")
	public static void guardaNombre() throws Exception {//6.Guarda 10 nombres  de alumnos en el fichero, cada nombre en una línea
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter(f1));
			for (int i=0; i<10;i++) {
				System.out.println("dame el nombre número " + (i+1));
				String nombre = scanner.next();
				bw.write(nombre);
				bw.newLine();
			}
			bw.flush();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			bw.close();
		}
	}
	
	@SuppressWarnings("resource")
	public static void buscaNombre() {//7.Buscar un nombre de un alumno en el fichero (si está decir en la línea
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		
		File f1 = new File(directorio, fichero1);
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader(f1));
				
		System.out.println("introduce el nombre a buscar");
		String fichero2 = scanner.next();
		
		String linea = null;
	
		int contador =0;
		while((linea=br.readLine())!=null) {
			contador++;
					if(linea.equalsIgnoreCase(fichero2)) {
					System.out.println("la palabra " + linea + " se encuentra en el fichero");
					System.out.println("Esta en la linea " + contador);
			     	}
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("resource")
	public static void visualizaContenido(BufferedReader br) {//8.Visualiza el contenido de un fichero
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		
		File f1 = new File(directorio, fichero1);
		
			try {
			br = new BufferedReader(new FileReader(f1));
			
			String linea = null;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			   }catch (Exception e) {
				System.out.println(e.toString());
			}
	}
	
	@SuppressWarnings("resource")
	public static void copiaAL(BufferedReader br) throws Exception {//9.Copia el contenido del fichero en un array unidimensional
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		String[] myarray = new String[10];
				
			br = new BufferedReader(new FileReader(f1));
		System.out.println("los nombres contenidos en el [] son:");
		for (int i=0;i<myarray.length;i++) {
			myarray[i]=br.readLine();//se copia al []
		}
		
		for (int i=0;i<myarray.length;i++) {//se visualiza
			System.out.println(myarray[i]);
		}
	}
	
	@SuppressWarnings("resource")
	public static void copiaA(BufferedReader br) throws Exception {//10.Copia el contenido del fichero en un ArrayList
		Scanner scanner = new Scanner(System.in);
		listar();
		String directorio = "C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\pruebas";
		System.out.println("introduce nombre del fichero");
		String fichero1 = scanner.next();
		File f1 = new File(directorio, fichero1);
		ArrayList <String> myAL = new ArrayList<String>();
		
		  br = new BufferedReader(new FileReader(f1));
		System.out.println("los nombres contenidos en el AL son:");
		
		String linea = null;
		while((linea = br.readLine()) != null) {
			myAL.add(linea);//se copia en el AL
			
		}
		System.out.println(myAL);//se visualiza
	}	
}


