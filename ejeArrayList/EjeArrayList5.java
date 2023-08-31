package arrayLits;
import java.util.*;
public class EjeArrayList5 {
	
	    public ArrayList<String> nombres=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		
		//Añadir un nombre al ArrayList
		public void añadirNombre() {
		System.out.println("Cuantos nombres quieres añadir");
			int aux=scanner.nextInt();
			scanner.nextLine();
			   for(int i=0;i<aux;i++) {
				   System.out.println("dame un nombre");
				   nombres.add(scanner.nextLine());
			}
		}
		//Obtener el nombre en la posición solicitada
		public void obtenerNombre() {
		System.out.println("dame posicion");
		int posicion=scanner.nextInt();
			if(posicion>=0 && posicion<nombres.size()) {
				String nombre=nombres.get(posicion);
				System.out.println(nombre);
			}else {
				System.out.println("posicion no esta en rango");
			}
		}
		//Borrar el nombre situado en la posición solicitada
		public void eliminarNombre() {
		System.out.println("Introduzca la posición a borrar");
		int posicion=scanner.nextInt();
			if(posicion>=0 && posicion<nombres.size()) {
				nombres.remove(posicion);
				System.out.println("Nombre borrado");
				System.out.println(nombres);
			}else {
				System.out.println("NO se puede borrar, posición incorrecta");
			}
		}	
	
}
