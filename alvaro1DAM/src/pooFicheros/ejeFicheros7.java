package pooFicheros;
import java.io.*;
public class ejeFicheros7 {

	public static void main(String[] args) throws Exception{
		
        try {
        @SuppressWarnings("resource")
		FileReader fr=new FileReader ("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero7.txt");
 
            int valor=fr.read();
            
            while(valor!=-1){
                //Si el caracter es un espacio no lo escribe
                if(valor!=32){
                    System.out.print((char)valor);
                }
                valor=fr.read();
            }
        }catch(IOException e){
            System.out.println("Error inesperado "+e.toString());
        }
    }
}
