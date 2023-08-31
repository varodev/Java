package exam2eva;
import java.util.*;

public class Menu {
	Scanner scanner = new Scanner (System.in);
	ArrayList<String>Empleados = new ArrayList<String>();
	int[]SalarioEmpleados = new int[6];
	
	public int menu() {
		@SuppressWarnings("unused")
		int opcion;
		System.out.println("introduce la opcion de menu correspondiente");
		System.out.println("1.altas");
		System.out.println("2.bajas");
		System.out.println("3.modificaciones");
		System.out.println("4.consultas");
		System.out.println("5.listado");
		System.out.println("6.salir");
		return opcion =scanner.nextInt();
	}
	
	public void menuOpcion() {
		int opcion = menu();
		switch (opcion) {
		case 1:
			altas(); menuOpcion();
		break;
		case 2:
			bajas(); menuOpcion();
		break;
		case 3:
			modificaciones(); menuOpcion();
		break;
		case 4:
			consultas(); menuOpcion();
		break;
		case 5:
			listado(); menuOpcion();
		break;
		case 6:
			System.out.println("Adios!");
			System.exit(0);
		default:
			menuOpcion();
		}
	}
	
 	public void altas() {
 		System.out.println("introduce el nombre del usuario");
 		String nombre = scanner.next();
 		Empleados.add(nombre);
 		int posicion=Empleados.indexOf(nombre);
 		System.out.println("introduce salario");
 		int salario = scanner.nextInt();
 		SalarioEmpleados[posicion]=salario;
 	}
	
 	public void bajas() {
 		System.out.println(Empleados);
 		System.out.println("introduce empleado a borrar");
 		String nombreEliminar = scanner.next();
 			if(Empleados.contains(nombreEliminar)) {
 				int posicion = Empleados.indexOf(nombreEliminar);
 				Empleados.remove(posicion);
 				
 				int tam= Empleados.size();
 				
 				for (int i=posicion; i<tam; i++) {
 					SalarioEmpleados[i]= SalarioEmpleados[i+1];
 				}
 				SalarioEmpleados[posicion]=0;
 				System.out.println("usuario borrado");
 			}else {
 				System.out.println("No esta");
 			}
 	}
 	
 	public void modificaciones() {
 	 System.out.println("modificacion de datos: nombre o salario");
 		String opcion = scanner.next();
 		
 		if (opcion.equalsIgnoreCase("nombre")) {
 			System.out.println(Empleados);
 			System.out.println("Dame nombre a modificar");
 			String nombre=scanner.next();
 				if (Empleados.contains(nombre)) {
 					int posicion = Empleados.indexOf(nombre);
 					System.out.println("Dame nuevo nombre");
 					String nuevoNombre = scanner.next();
 					Empleados.set(posicion, nuevoNombre);
 					System.out.println("Empleado modificado");
 				}else {
 					System.out.println("No existe Empleado");
 				}
 		}
 		
 		if (opcion.equalsIgnoreCase("salario")) {
 			System.out.println(Empleados);
 			System.out.println("Dame nombre a modificar");
 			String nombre=scanner.next();
 				if(Empleados.contains(nombre)) {
 					int posicion=Empleados.indexOf(nombre);
 					System.out.println("dame nuevo salario");
 					int salarioNuevo = scanner.nextInt();
 					SalarioEmpleados[posicion]= salarioNuevo;
 					System.out.println("Salario modificado");
 				}else {
 					System.out.println("No existe Empleado");
 				}
 		}
 	}
 	
 	public void consultas() {
 		System.out.println(Empleados);
 		System.out.println("dame nombre a consultar");
 		String nombre = scanner.next();
 			if (Empleados.contains(nombre)) {
 				int posicion = Empleados.indexOf(nombre);
 				System.out.println("Salario: " + SalarioEmpleados[posicion]);
 			}else {
 				System.out.println("No existe Empleado");
 			}
 	}
 	
 	public void listado() {
 	System.out.println("vamos a listar a los empleados junto con sus sueldos");
 		for (int i=0; i<Empleados.size(); i++) {
 			System.out.println(Empleados.get(i));
 			System.out.println("Salario:" + SalarioEmpleados[i]);
 		}
 	}
}
