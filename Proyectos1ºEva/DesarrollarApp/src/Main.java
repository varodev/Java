import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("BIBLIOTECA DE AUTORES\n");
		System.out.println("Selecciona una opción :");
		System.out.println("1. Ver autores");
		System.out.println("2. Incluir nuevos autores");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 1 : show();{
			break;
		}
		
		case 2 : get() ;{
			break;
		}
		
		default : System.out.println("Opcón no disponible");
		
		
		}
	}
	
	public static void show() throws IOException {
		
		String rutaAutores = "src/archivo2.txt"; 
		File file1= new File(rutaAutores);
		
		if (file1.createNewFile()) 
		System.out.println("Archivo creado correctamente");
		
		else 
			System.out.println("No se ha podido crear, el archivo ya existe");
		
	
	BufferedWriter bw1; 
	if(file1.exists()) {
		bw1 = new BufferedWriter (new FileWriter(file1)); 
			bw1.write(".\n");
			bw1.write(".\n");
			bw1.close();
	}
	}
	
	private static void get() {
	
		
	}



}
