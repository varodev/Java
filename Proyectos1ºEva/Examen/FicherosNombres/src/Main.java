
import java.io.*;
import java.util.*;
public class Main {
	
	Scanner sc = new Scanner (System.in);
	
	public void menu() throws Exception {
		System.out.println("Selecciona una opcion");
		System.out.println("1. Comprobar que el fichero existe, si no, crearlo");
		System.out.println("2 .Dada una ruta, comprobar si es un fichero o un directorio");
		System.out.println("3 .Cambia el nombre de un fichero");
		System.out.println("4 .Visualiza el nombre del fichero");
		System.out.println("5. Visualiza la longitud de un fichero");
		System.out.println("6. Guarda 10 nombres, cada uno en una linea");
		System.out.println("7. Buscar nombre del alumno en el fichero");
		System.out.println("8. Visualizar contenido de un fichero");
		System.out.println("9. Borrar fichero");
		System.out.println("10. listar");
		int opcion = sc.nextInt();
	
	
	switch(opcion){
	case 1:
		existenciaFicheros();
		menu(); {
		break;
	}
	case 2:
		comprobarFicheroDirec();
		menu(); {
		break;
	}
	case 3:
		cambiarNombreFichero();
		menu();
		break;
		
	case 4:
		visualizaNombreFichero();menu();{
			break;
			
		}
		
	case 5:
		visualizaLongitudFichero();menu();{
			break;
		}
	case 6:
		guardarNombres ();menu();{
			break;
		}
		
	case 7: buscarNombre();menu();{
		break;
	}
	
	case 8: visualizarContenido();menu();{
		break;
	}
	
	

	case 9: borrar();menu();{
		break;
	}
	case 12:
		listar();
		menu(); {
		break;
		}

	}//switch
	
	}//menu
	
	public void existenciaFicheros() throws Exception {
		
		System.out.println("ESTAMOS EN EL METODO UNO");
		listar();
		
		System.out.println("Introduce una ruta a comprobar");
		String ruta = sc.next();
		System.out.println("Introduce un nombre de fichero a comprobar");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre);
		
		if (f.exists()) {
			System.out.println("El fichero existe");
			System.out.println("La ruta del fichero es: " +  f.getPath());
			System.out.println("El nombre del fichero es: " + f.getName());
		}else {
			System.out.println("El fichero no existe, se creará, para ver el nuevo fichero vuelve a ejecutar");
		}	f.createNewFile();
		
	}

	public void comprobarFicheroDirec() {
		
		System.out.println("ESTAMOS EN EL METODO DOS");
		listar();
		
		System.out.println("Introduce la ruta");
		String ruta = sc.next();
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre);
		
		if(f.isFile()) {
			System.out.println("El nombre existe y es un fichero");
	}
		else if (f.isDirectory()) {
			System.out.println("El nombre existe y es un directorio");
		}else {
			System.out.println("Nombre o ruta no encontrados");
		}
		
	}
	
	public void cambiarNombreFichero() {
		
		System.out.println("ESTAMOS EN EL METODO TRES");
		listar();
		
		System.out.println("Dame la ruta de origen");
		String Rorigen = sc.next();
		System.out.println("Dame el nombre a cambiar");
		String Ncambiar = sc.next();
		
		File f = new File (Rorigen,Ncambiar);
		
		System.out.println("Dame la ruta de destino");
		String Ddestino = sc.next();
		System.out.println("Dame el nombre nuevo");
		String Dnuevo = sc.next();
		
		File g = new File (Ddestino,Dnuevo);
		
		
		boolean cambiar; 
		
		cambiar = f.renameTo(g);
		
		if (cambiar) {
			
			System.out.println("El nombre del fichero se ha cambiado");
			
		}else {
			System.out.println("El nombre del fichero no se ha cambiado");
		}
	}
	
	public void visualizaNombreFichero() {
		
		System.out.println("ESTAMOS EN EL METODO 4");
		listar();
		
		System.out.println("Dame la ruta para mostrarte su nombre");
		String ruta = sc.next();
		
		File f = new File (ruta);
		
		if (f.exists()) {
			
			System.out.println("El nombre del fichero es: " + f.getName());
		}
		
		if (f.isFile()) {
			System.out.println("Es ademas un fichero");
		}else
			System.out.println("Es ademas un directorio");
		}
		
	
	public void visualizaLongitudFichero() {
		
		System.out.println("ESTAMOS EN EL METODO CINCO");
		listar();
		
		System.out.println("Introduce la ruta");
		String ruta = sc.next();
		System.out.println("Introduce el nombre del fichero a mostrar");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre);
		
		if (f.exists()) {
			
			System.out.println("La longitud del fichero es: " + f.length() );
		}
		
		else {
			System.out.println("No hemos encontrado coincidencia");
		}
		
		
	}
	
	public void guardarNombres () throws Exception{
		
		System.out.println("ESTAMOS EN EL METODO 6");
		listar();
		
		System.out.println("Dame la ruta donde vamos a guardar");
		String ruta = sc.next();
		
		System.out.println("Dame el nombre del fichero donde quieres guardar");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre);
		FileWriter fw = new FileWriter (f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String nombreAlumnos;
		
		if (f.exists()) {
			
			System.out.println("Introduce 4 nombres");
			for (int i=0;i<4;i++) {
				System.out.println("Nombre :" + (i+1));
				nombreAlumnos =sc.next();
				
				bw.write(nombreAlumnos);
				bw.newLine();
			}
			
				bw.flush();
				bw.close();
		}
		
	}
	
	public void buscarNombre() throws Exception {
		System.out.println("ESTAMOS EN EL METODO 7");
		listar();
		
		System.out.println("Dame la ruta");
		String ruta  = sc.next();
		
		System.out.println("Dame el nombre del fichero");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre); /*SIEMPRE CON WHILE*/
		FileReader fr= new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		System.out.println("Dame el nombre a buscar");
		String nombreAlumno = sc.next();
		
		String linea;
		int contador = 0;
		
		if (f.exists()) {
			
			while ((linea=br.readLine())!=null) {
				
				if(linea.equalsIgnoreCase(nombreAlumno))
				System.out.println("Nombre encontrado en la linea :" +  contador);
				contador++;
			}
			}
			
			else {
				System.out.println("Has introducido algun datos incorrecto");
		}
	}
	
	public void visualizarContenido() throws Exception {
		
		System.out.println("ESTAMOS EN EL METODO 7");
		listar();
		
		System.out.println("Dame la ruta");
		String ruta = sc.next();
		
		System.out.println("Dame el nombre del fichero");
		String nombre = sc.next();
		
		File f = new File (ruta,nombre);
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		String linea;
		
		if (f.exists()) {
			System.out.println("Esto es lo que contiene el fichero:" );
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
				
			}
		}else {
			System.out.println("No hemos podido encontrar nada");
		}
		
	}

	
	public void listar() {

		System.out.println("¿Quieres ver primero el nombre de los ficheros : S/N");
		String respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("s")) {

			System.out.println("Dime la ruta para LISTAR sus ficheros");
			String ruta = sc.next();

			File f = new File(ruta);

			if (f.exists()) {

				File[] ficheros = f.listFiles();
				ficheros = f.listFiles();

				if (ficheros == null || ficheros.length == 0) {
					System.out.println("No se han encontrado ficheros");
				} else {
					System.out.println("Los ficheros que contiene la ruta dada son");
					for (int i = 0; i < ficheros.length; i++) {
						System.out.println(ficheros[i].getName());
					}
				}
			}

		}

	}
	
public void borrar() throws FileNotFoundException {
	
	System.out.println("ESTAMOS EN EL METODO BORRAR");
	listar();
	
	System.out.println("Dame la ruta");
	String ruta = sc.next();
	
	System.out.println("Dame el nombre del fichero");
	String nombre = sc.next();
	
	File f = new File (ruta,nombre);
	FileReader fr = new FileReader (f);
	BufferedReader br = new BufferedReader (fr);

	if (f.exists()) {
	
		System.out.println("El fichero existe y como existe lo vamos a borrar " + f.delete());
		
	} else {
		System.out.println("La ruta, o el fichero no se ha encontrado, no borrado");
	}
}


	public static void main(String[] args) throws Exception {
		Main objeto = new Main();
		objeto.menu();
		
	}//main

}//clase