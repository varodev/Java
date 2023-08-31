package pooFicheros;
import java.io.*;
import java.util.*;
public class EjemploFicherosArray1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numPersonas = 5;

		int[] edad = new int[numPersonas];
		String[] nombre = new String[numPersonas];
		String[] apellido = new String[numPersonas];

		try {
			FileWriter fw = new FileWriter("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroArray1.txt");
			PrintWriter pw = new PrintWriter(fw);
			FileReader fr = new FileReader("C:\\Amorapa\\Informática\\DAM+DAW\\DAM AÑO1\\Programación\\0.PROGRAMACION 3eva\\ejercicios 3eva\\ejePOO Ficheros\\ficheroArray1.txt");
			BufferedReader br = new BufferedReader(fr);
						
			for (int i = 0; i < numPersonas; i++) {
				System.out.print("\nDime el nombre del usuario " + (i + 1) + ": ");
				nombre[i] = scanner.next();

				System.out.print("Dime el apellido del usuario " + (i + 1) + ": ");
				apellido[i] = scanner.next();

				System.out.print("Dime la edad del usuario " + (i + 1) + ": ");
				edad[i] = scanner.nextInt();

				pw.println("\nUsuario " + (i + 1) + "\tNombre: " + nombre[i] + "\tApellido: " + apellido[i] + "\tEdad: "
						+ edad[i]);
			}
			pw.flush();
		   String linea = br.readLine();
            System.out.println();
		while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
		}
            pw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
