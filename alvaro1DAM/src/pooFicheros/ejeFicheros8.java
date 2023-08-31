package pooFicheros;
import java.io.*;
import java.util.*;
public class ejeFicheros8 {

	public static void main(String[] args) throws Exception {
		menu();
	}
	
	@SuppressWarnings("resource")
	public static void menu() throws Exception {
		Scanner scanner = new Scanner(System.in);
		 		  
         System.out.println("1-.Crear Fichero");
         System.out.println("2-.Mostrar Fichero");
         System.out.println("3-.Salir");

         int opcion = scanner.nextInt();
         switch (opcion) {
             case 1: {
                 crearFichero();menu();
                 break;
             }
             case 2: {
                 mostrarFichero();menu();
                 break;
             }
             case 3: {
                 System.out.println("Gracias por usar el programa");
                 System.exit(0);
             }
             default: {
                 System.out.println("Opcion incorrecta");
                 menu();
            }
          }
	}
	
	public static void crearFichero() {
		PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero8.txt"));
            for (int i = 0; i < 20; i++) {
           	 if (i % 2 == 0 ) {
                   pw.println(i);
               }
           }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
    public static void mostrarFichero() {
        File f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero8.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new  FileReader(f));
            String linea;
             while ((linea= br.readLine()) != null) {
                System.out.println(linea);
             }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
