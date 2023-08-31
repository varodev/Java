package pooFicheros;
import java.io.*;
public class EjemploFicherosArray3 {
	//Vamos a tener un vector con nombres, vamos a escribir dichos nombres en un fichero y los visualizaremos
	
	public static void main(String[] args) throws Exception {
		String ruta="C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros";
		String fichero="ficheroArray3.txt";
		File f=new File(ruta,fichero);
		BufferedWriter bw=null;
		BufferedReader br=null;
		
		String[]nombres={"Pilar","Jesus","Cristian","Victor","Maria"};

			 bw =new BufferedWriter(new FileWriter(f));
			 br=new BufferedReader(new FileReader(f));
		if(f.exists()) {//escribir
		System.out.println("fichero ya existe");
			for (int i=0;i<nombres.length;i++){
				bw.write(nombres[i]+"\r\n");
			}
			
			bw.flush();
			String cadena;//leer
			while ((cadena=br.readLine())!=null){
				System.out.println(cadena);
			}
		}else {
				System.out.println("El fichero no existe");
			}
		bw.close();	
		br.close();
	}
}
