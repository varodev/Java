package poo;
import java.util.*;
 public class poo7_main {
	 poo7 cante=new poo7();
	Scanner scanner = new Scanner (System.in);
	
	public void menu() {
		System.out.println("Elige una opcion del menu");
		System.out.println("1.Agregar nombres");
		System.out.println("2.Modificar nombres");
		System.out.println("3.Borrar nombres");
		System.out.println("4.Buscar nombres y en que posicion esta");
		System.out.println("5.Viscar nombre");
		System.out.println("6.Cantidad de cantantes");
		System.out.println("7.Salir");
		comenzar();
		
	}
	
	public void comenzar() {
		System.out.println("Elige opcion");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case 1: cante.agregaNombre(); menu(); break;
		case 2: cante.modificarNombre(); menu(); break;
		case 3: cante.borrarNombre(); menu(); break;
		case 4: cante.buscaposicion(); menu(); break;
		case 5: cante.visualizarNombres(); menu(); break;
		case 6: cante.cantidadCantnates(); menu(); break;
		case 7: cante.salir(); break;
				
		}
	}
	
	public static void main(String[] args) {
		poo7_main obj = new poo7_main();
		obj.menu();
		

	}
}
