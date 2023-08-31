import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
		
		// Crear fichero
		String path1 = "src/archivo2.txt";
		 File file1 = new File(path1);
	
		// Solicitar datos al usuario
		 System.out.println("¿Que desea hacer?\n1.-Introducir un nuevo autor\n2.-Ver autoresexistentes");
		 Scanner scn1 = new Scanner(System.in);
		 String data1 = scn1.nextLine();
		 
		 String option1 = "1";
		 if(option1.equalsIgnoreCase(data1)) {
		 System.out.println("Indique el autor: ");
		 data1 = scn1.nextLine();
		 // Escribir en el fichero
		 BufferedWriter bw1;
		 if(file1.exists()) {
		 bw1 = new BufferedWriter(new FileWriter(file1, true));
		 bw1.newLine();
		 bw1.write(data1);
		 bw1.close();
		 }
		 System.out.println("El autor ha sido guardado.\nGracias."); 
		 }
		 else{
			 // Leer el fichero
			 FileReader reader1 = new FileReader(file1);
			 BufferedReader bw2 = new BufferedReader (reader1);
			 System.out.println("Contenido del fichero:");
			 String line1;
			 while((line1=bw2.readLine()) != null) {
			 System.out.println(line1);
			 }
			 // Al cerrarlo se desbloquea el fichero
			 //bw2.close

			 scn1.close();
			 // Eliminar el fichero
			 // file1.delete();

		 }
	}

}
