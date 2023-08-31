package arrayLits;
import java.util.*;
public class EjeArrayList9 {
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<int[]> notas = new ArrayList<int[]>();
	
	public void alta() {
	System.out.println("Dame nombre");
	nombres.add(scanner.next());
	int [] notasAlumno = new int [3];
		for (int i=0; i<3;i++) {
			System.out.println("Dame una nota");
			notasAlumno[i]=scanner.nextInt();
	    }
		notas.add(notasAlumno);//mete el vector en el arrayList
		menu();
	}//alta
		
	public void baja() {
		System.out.println("dame el nombre del alumno xa darle de baja");
		String nombre=scanner.next();
			if (nombres.contains(nombre)) {//si lo contiene
				int posicion=nombres.indexOf(nombre);//sacar posicion
				notas.remove(posicion);
				nombres.remove(nombre);	
				System.out.println("Alumnos y notas borradas");
			}else {
			System.out.println("El alumno no existe");
			}
			menu();	
	}
	
	public void modificar() {
		System.out.println("Dame el alumno a modificar");
		String nombre = scanner.next();
			if (nombres.contains(nombre)) {//si lo contiene
				int[] notasAlumno = new int[3];
					for (int i=0; i<3;i++) {
						System.out.println("dame una nota");
						notasAlumno[i]=scanner.nextInt();
			
					}
			int posicion=nombres.indexOf(nombre);//sacar posicion
			notas.set(posicion, notasAlumno);
			}else {
			System.out.println("Alumno no existe");
			}
			menu();
	}
	
	public void consulta() {
		System.out.println("Dame el nombre del alumno a consultar");
		String nombre =scanner.next();
		int [] notasAlumno= new int[3];
			if (nombres.contains(nombre)) {//si lo contiene
				int posicion=nombres.indexOf(nombre);//sacar posicion
				notasAlumno=notas.get(posicion);//me vaya al AL y me lo lleve a otro vetor
			
					for (int j=0; j<3;j++) {
						System.out.print(notasAlumno[j]);
					}
					}else {
						System.out.println("el alumno no existe");
					}
					menu();
	}
	
	public void listar() {
		int notasAlumno[]= new int[3];;//vector para poderle visualizar
			for (int i=0; i<nombres.size();i++) {//recorrer el arrayList
				System.out.print("\n"+ nombres.get(i)+"\t");
				notasAlumno=notas.get(i);
					
				for (int j=0; j<3;j++) {
					System.out.print(notasAlumno[j]);
				}
			}
			menu();
	}
	
	public void menu() {
		System.out.println("\nMenu");
		System.out.println("1. ALTA");
		System.out.println("2. BAJA");
		System.out.println("3. MODIFICAr");
		System.out.println("4. CONSULTA");
		System.out.println("5. LISTAR");
		System.out.println("6. SALIR");
		System.out.println("Introduce opcion");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:alta(); break;
		case 2:baja(); break;
		case 3:modificar(); break;
		case 4:consulta(); break;
		case 5:listar(); break;
		case 6:break;
		default: menu();
		}
	}//menu
}//EjeArrayList9
