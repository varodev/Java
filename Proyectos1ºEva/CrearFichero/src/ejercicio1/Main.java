package ejercicio1;
import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		String path1 = "src/archivo1.txt"; //1ºparte CREAR EL OBJETO FILE
		File file1= new File(path1); //file1 se almacena en path1
		
		if (file1.createNewFile()) //2º parte CREAMOS EL ARCHIVO
		System.out.println("Archivo creado correctamente");
		
		else 
			System.out.println("No se ha podido crear, el archivo ya existe");
		
		
		BufferedWriter bw1; //3ºparte ESCRIBIR EN EL ARCHIVO
		if(file1.exists()) {
			bw1 = new BufferedWriter (new FileWriter(file1)); 
				bw1.write("Hola.\n"); //"\n\" Indica un salto de linea
				bw1.write("Adios.\n");
				bw1.close();// al cerrar se desbloquea el fichero
			}
		
		FileReader reader1 = new FileReader(file1); //4ºParte LEER EL ARCHIVO
		BufferedReader bw2 = new BufferedReader(reader1);
		System.out.println("Contenido del fichero:");
		String line1;
		while ((line1=bw2.readLine())!=null ){ //Mientras haya algo que leer guardalo en line1
				System.out.println(line1);
		}
		
		bw2.close(); // Al cerrarlo se desbloque el fichero
		
		 
		//5º Parte, metodos de la clase file :
		
		System.out.println("Nombre del archivo: " + file1.getName());
		System.out.println("Ruta relativa: " + file1.getPath());
		System.out.println("Ruta absoluta: " + file1.getAbsolutePath());
		System.out.println("Se puede escribir: " +  file1.canWrite());
		System.out.println("Se puede leer: " +  file1.canRead());
		System.out.println("Tamaño del fichero: " + file1.length());
		
		
		//6 º Parte, eliminar ficheros :
		
		file1.delete(); /*cada vez que ejecutemos se crea y se elimina, por lo que siempre 
		 					mostrará "archivo creado correctamente"*/
	}
	
}

/*1º PARTE : (creación del objeto)
 *Variable String llamada path1.
 *Lo vamos a meter en el scr el  archico1 con extension txt.
 *Ruta relativa y ruta absoluta va a depender de cómo pongamos la \
 *Se crea el objeto file1, recoge el valor del constructor, que es la ruta del fichero.
 *Lo que metamos en el "src/ creará automaticamente el objeto del path , ejemplo : src/carpetafiles/archivo.txt
 *2º PARTE : (creación del fichero)
 *Creación del fichero. Lo vamos a crear usando el método "create NewFile)
 *3º PARTE: escribir en el fichero :
 *"Existe" permite comprobar si existe el fichero.
 *4º PARTE leer el fichero:
 *Podemos volver a leer el bw1, pero lo hemos cerrado, podemos crear el bw2 para poder leerlo.
 *Hemos llamado line1 como variable, para leer por lineas tantaS como podamos necesitar
 *Mientras haya lineas que leer se ejecutará el while
 *Declaramos String como line porque coge toda la información*
 **/
 