package arrayLits;
import java.util.*;
public class EjeArrayList8 {
	Scanner scanner = new Scanner(System.in);
	int i;
	int opcion;
	int meteCantidad;
	String meteNombre;
	String cambiaNombre;
	String opcionesMas;
	String nombre;
	int posicion;
		
	ArrayList <String> op= new ArrayList<String>();
	
	public void menu() {
		System.out.println("\nSelecciona una opcion del menu");
		System.out.println("1. Agregar Nombres.");
		System.out.println("2. Modificar nombre.");
		System.out.println("3. Borrar Nombres.");
		System.out.println("4. Visualizar un Nombre.");
		System.out.println("5. Visualizar todos Nombres.");
		System.out.println("6. Salir.");
		System.out.println("introduce opcion");
		opcion=scanner.nextInt();
			
	switch(opcion) {
	
		case 1:agregarNombre();break;
		case 2:modificarNombre();break;
	    case 3:borrarNombres();break;
		case 4:visualizarNombres();break;
		case 5:visualizarAll();break;
	    case 6:salir();break;	
   }
	}//menu
	
	public void agregarNombre() {
		System.out.println("Agregar Nombres");
		System.out.println("introduce cuantos nombres quieres rellenar");
		meteCantidad=scanner.nextInt();
		
		for(int i=0;i<meteCantidad;i++) {
		System.out.println((i+1) + " nombre");
		op.add(scanner.next());
		}
		menu();
	}//agregarNombre()
	
	public void modificarNombre() {
		System.out.println("Modificar nombre");
		
		for(int i=0;i<op.size();i++) {
		System.out.println("Los elementos guardados son");
		System.out.print(op);
		System.out.println();
		System.out.println("\nNombre a modificar: ");
		cambiaNombre=scanner.next();
		op.contains(cambiaNombre);	
		
			if (op.contains(cambiaNombre)) {
				System.out.println("dame nombre nuevo para modificar");
				meteNombre=scanner.next();
				op.set(i,meteNombre);
			}
			menu();
		}
	}//modificarNombre()
	
  public void borrarNombres() {
		System.out.println("Borrar Nombres");
		
	for(int i=0;i<op.size();i++) {
		System.out.println("Elige borrar por posicion o nombre");
		opcionesMas=scanner.next();
		
		if (opcionesMas.equalsIgnoreCase("posicion")) {
			System.out.println("dame posicion a eliminar");
			posicion=scanner.nextInt();
				if(posicion>=0 && posicion<op.size()) {
					System.out.println("Se elimina a: ");
					System.out.println(op.remove(posicion));
					System.out.println("Eliminando....");
				}else {
					System.out.println("posicion erronea");
				}
		}
		
		if (opcionesMas.equalsIgnoreCase("nombre")) {
			System.out.println("dame nombre a eliminar");
			nombre=scanner.next();
				if (nombre.equalsIgnoreCase(op.get(i))) {
					op.remove(nombre);
					System.out.println("Eliminando...");
				}else {
					System.out.println("nombre erroneo");
				}
		}
	}	 
		menu();
  }//borrarNombres()
	
	public void visualizarNombres() {
		System.out.println("Visualizar un Nombree");
		System.out.println("Introduce la posicion a visualizar");
			posicion=scanner.nextInt();
			if(posicion>=0 && posicion<op.size()) {
			   System.out.print(op.get(posicion));
			   
			}
            menu();
	}//visualizarNombres()
	
	public void visualizarAll() {
		System.out.println("Visualizar todos Nombres");
		for(int i=0;i<op.size();i++) {
			System.out.print(op.get(i) + " ");
		}
		menu();
	}//visualizarAll()
	
	public void salir() {
		System.out.println("Hasta luego. Vuelva pronto!");
		System.exit(0);
	}//salir()
}//EjeArrayList8
