import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
		
		Scanner sc = new Scanner (System.in);
		
		//1 CREAMOS UNA CLASE MENU CON LOS OPCIONES DEL SWITCH
	
	   public void menu() throws Exception {
		System.out.println("Trabajamos con ficheros");
		System.out.println("                      ");
		System.out.println("Selecciona una opción");
		System.out.println("1. Crear fichero");
		System.out.println("2. Escribir en el fichero");
		System.out.println("3. Leer el fichero");
		System.out.println("4. Borrar el fichero");
		System.out.println("4. Salir");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			crear();/*METODO PARA CREAR EL FICHERO*/
			menu(); {
			break;
		}
		case 2:
			escribir();/*METODO PARA ESCRIBIR EN EL FICHERO*/
			menu(); {
			break;
		}
		case 3:
			leer();/*METODO PARA MOSTRAR EL FICHERO*/
			menu(); {
			break;
			}
	
		case 4:
			borrar(); /*METODO PARA SALIR DEL MENU*/
			menu(); {
			break;
		}
			

		case 5:
			salir(); /*METODO PARA SALIR DEL MENU*/
			menu(); {
			break;
		}
		default:
			System.err.println("Opcion incorrecta");
		}// switch
	}// menu
		
	
	public void crear() throws IOException {
		
	
		String path1 = "src/archivo1.txt";
		 File file1 = new File(path1);
		 if (file1.createNewFile()) // Creación del fichero
		 System.out.println("Archivo creado correctamente.");
		 else
		 System.out.println("No se ha podido crear, el archivo ya existe.");

	   }

	   public void escribir() throws IOException {
		String path1 = "src/archivo1.txt";
		File file1 = new File(path1);
	
	  BufferedWriter bw1;
	  if(file1.exists()) {
	  bw1 = new BufferedWriter(new FileWriter(file1));
	  bw1.write("Hola.\n"); // “\n” indica un salto de línea
	  bw1.write("Adios.");
	  
	  
	  bw1 = new BufferedWriter(new FileWriter(file1, true));
	// newLine añade una nueva línea antes del nuevo contenido
	bw1.newLine();
	//bw1.write(file1);
	  
	  bw1.close(); // El cerrarlo se desbloquea el fichero
	  
	  System.out.println("Nombre del archivo: " + file1.getName());
	  System.out.println("Ruta relativa: " + file1.getPath());
	  System.out.println("Ruta absoluta: " + file1.getAbsolutePath());
	  System.out.println("Se puede leer: " + file1.canRead());
	  System.out.println("Se puede escribir: " + file1.canWrite());
	  System.out.println("Tamaño: " + file1.length());
	  
		 
	
	   }
	   }
	   public void leer() throws IOException {
			String path1 = "src/archivo1.txt";
			File file1 = new File(path1);
		   FileReader reader1 = new FileReader(file1);
		   BufferedReader bw2 = new BufferedReader (reader1);
		   System.out.println("Contenido del fichero:");
		   String line1;
		   while((line1=bw2.readLine()) != null) {
		   System.out.println(line1);
		   }
		   bw2.close(); // Al cerrarlo se desbloquea el fich
		   
	   }
	   
	   private void borrar() {
		   String path1 = "src/archivo1.txt";
		   File file1 = new File(path1);
		   file1.delete();
	   }
	   
	   
	   private void salir() {
		// TODO Auto-generated method stub
		
	}
	   
	  public static void main (String []args) throws Exception {
		  
	
		  
		  Main objeto = new Main();
			  objeto.menu();
		  
	  }
	  
	   }
		 
		

	

