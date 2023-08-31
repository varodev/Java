package ficheros2DAM;
import java.io.*;
import java.util.*;

public class eje1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Er_xi\\eclipse-workspace\\alvaro\\src\\ficheros2DAM\\fichero.txt",true));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Er_xi\\eclipse-workspace\\alvaro\\src\\ficheros2DAM\\fichero.txt"));
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aplicación para ver autores, introduce 1 si quieres ver la lista y 2 si quieres añadir autores");
		int opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Los autores de la Generación del 98 son:");
				String line1;
					while((line1=br.readLine()) !=null) {
						System.out.println(line1);
					}
					br.close();
					break;
			case 2:
				System.out.println("Ha elegido añadir más autores de la Generación del 98:");
				System.out.println("Selecciona cuantos autores quieres añadir");
				int autor = scanner.nextInt();
					for(int i=0; i<autor;i++) {
						System.out.println("Dame el " + (i+1) + " nombre");
						String auto = scanner.next();
						bw.write(auto);
						bw.newLine();
					}
					bw.flush();
					bw.close();
					break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
	}
}
