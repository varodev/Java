package poo;
import java.util.*;
	public class poo7 {
		Scanner scanner=new Scanner (System.in);
		ArrayList<String> men = new ArrayList<String>();
		//private String nombre;

	public void agregaNombre() {
	System.out.println("Agregar Nombre");
	String nombre=scanner.next();	
			if(men.contains(nombre)) {
				System.out.println("No se puede insertar porque el nombre del actor ya existe");
			}else {
				men.add(nombre); 
			}
	}
	
	public void modificarNombre() {
			System.out.println("Los elementos guardados son");
			System.out.print(men);
			System.out.println();
			System.out.println("\nNombre a modificar: ");		
			String cambiaCantante=scanner.next();
					if(men.contains(cambiaCantante)) {
						int posicion = men.indexOf(cambiaCantante);
						System.out.println("dame nombre nuevo para modificar");
							String meteNombre=scanner.next();
									men.set(posicion,meteNombre); 
					}
	}
	
	public void borrarNombre() {
			System.out.println("Los elementos guardados son");
			System.out.print(men);
			System.out.println();
			System.out.println("\nNombre a borrar: ");	
			String borra=scanner.next();
			men.remove(borra);
			System.out.println("Nombre borrado");	
	}
	
	public void buscaposicion() {
		System.out.println("Dame un nombre a consultar");
		String nombreConsulta = scanner.next();
			if(men.contains(nombreConsulta)) {
				int posicion = men.indexOf(nombreConsulta);
				System.out.println(men.get(posicion) + "esta en la posicion " + posicion);
			}
	}
	
	public void visualizarNombres() {
		System.out.println("Visualizar nombres");
		for (int i=0; i<men.size();i++) {
			System.out.println(men.get(i));
		}
	}
	
	public void cantidadCantnates() {
		System.out.println("Visualizar cantidad nombres");
			System.out.println(men.size());
	}
	
	public void salir() {
		System.out.println("Adios");
		System.exit(0);
	}

}
