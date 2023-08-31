package pooFicheros;
import java.io.*;
public class ejeFicheros9 {

	public static void main(String[] args) throws Exception {
		mostrarFichero();
	}
	
	 public static void mostrarFichero() throws Exception {
	     File f = new File("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\numeros.txt"); 
		 BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader(f));
	           
	            int num;
	            int suma = 0;
	            
	            String linea;		 
		        while ((linea= br.readLine()) != null) {
		        	num = Integer.valueOf(linea);//tambine valdria Integer.parseInt()
		            suma += num;
		        }
		        System.out.println("La suma de los numeros es: " + suma);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        } 
	            br.close();
	  }
}
