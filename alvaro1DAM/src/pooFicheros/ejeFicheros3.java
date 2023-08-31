package pooFicheros;
import java.util.*;
import java.io.*;
public class ejeFicheros3 {

	public static void main(String[] args) throws Exception {
		 Menu();
	}
	
	public static void Menu() throws Exception {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        int opcion;
	  
	            System.out.println("1-.Crear Fichero, almacenandolo y muestra por pantalla");
	            System.out.println("2-.Mostrar Fichero");
	            System.out.println("3-.Salir");
	 
	            opcion = scanner.nextInt();
	            switch (opcion) {
	                case 1: {
	                    crearFichero();Menu();
	                    break;
	                }
	                case 2: {
	                    mostrarFichero();Menu();
	                    break;
	                }
	                case 3: {
	                    System.out.println("Gracias por usar el programa");
	                }
	                default: {
	                    System.out.println("Opcion incorrecta");
	               }
	             }
	    }
	 
	    @SuppressWarnings("resource")
		public static void crearFichero() {
	    	Scanner scanner = new Scanner(System.in);  
	    	PrintWriter pw = null;
	        try {
	            pw = new PrintWriter(new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero3.txt"));
	            
	            System.out.println("Introduce tu nombre");
		        String opcion1 = scanner.nextLine();
		        		pw.println(opcion1);
		        System.out.println("Introduce tus apellidos");
		        String opcion2 = scanner.nextLine();
		        		pw.println(opcion2);
		        System.out.println("Introduce tu lugar de nacimiento");
		        String opcion3 = scanner.nextLine();
		        		pw.println(opcion3);
	            pw.flush();
	            pw.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	     }
	    	 
	    public static void mostrarFichero() throws Exception {
	    	File f = new File("archivo.txt");
	        BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader(f));
	            String linea;
		        
		        while ((linea= br.readLine())!= null) {
		        	System.out.println(linea);
		        }
		        br.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } 
	 }
}
