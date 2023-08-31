package pooFicheros;
import java.io.*;
public class ejeFicheros2 {

	public static void main(String[] args) {
		int dia=1;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero2.txt",true));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ejeFichero2.txt"));
			 	
		    escribir(dia, bw);
		    bw.flush();//importante para poder guardar la informacion
		    leer(br);
		      }catch (IOException e) {
			  System.out.println("error E/S" + e.toString());
		      }
		}
		
		public static void escribir(int dia, BufferedWriter bw) throws IOException {
			for (int i=0; i<31;i++) {//probar con whileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
				bw.write("hoy es dia " + dia++);
				bw.newLine();//salto de linea
			}
			bw.close();
		}
		
		public static void leer(BufferedReader br) throws IOException {
			//leemos el fichero y lo mostraremos por pantalla
			String linea ;//lea una linea
				while((linea= br.readLine()) !=null) {
					System.out.println(linea);
					
				}

	}

}
