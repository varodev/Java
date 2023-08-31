package ejerciciosRepaso;
import java.util.*;
public class repaso9 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("introduce dia");
		int dia = scanner.nextInt();
		System.out.println("introduce mes");
		int mes = scanner.nextInt();
		System.out.println("introduce año");
		int anno = scanner.nextInt();
	
		if (dia >= 1 && dia < 31 && mes >=1 && mes <13 && anno !=0 ) {
			System.out.println("Fecha correcta");
			System.out.println(dia + "." + mes + "." + anno);
		}
		else {
			System.out.println("Algo mal estas haciendo");
		}
scanner.close();
    }//main
}//repaso9