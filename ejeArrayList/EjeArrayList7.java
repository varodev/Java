package arrayLits;
import java.util.*;
public class EjeArrayList7 {
	Scanner scanner = new Scanner(System.in);
	int i;
	String nombre = " ";
		
	ArrayList <String> animal = new ArrayList<String>();
	
	public void rellenar() {
	System.out.println("introduce nombres de animales");
		
	while (!nombre.equalsIgnoreCase("salir")) {
			System.out.println("introduce un nombre");
				nombre = scanner.nextLine();
				if (!nombre.equalsIgnoreCase("salir"))
				animal.add(nombre);
	}//while
		for (i = 0; i<animal.size(); i++) {
			System.out.println("los animales son " + animal.get(i));
		}
	}
	
	 public static void main(String[] args) {
		EjeArrayList7 Obj =new EjeArrayList7();
		Obj.rellenar();	
	}
}
