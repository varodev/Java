package arrayLits;
import java.util.*;
public class EjeArrayList10 {
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<int[]> notas = new ArrayList<int[]>();
	ArrayList<String> ArrayCopia = new ArrayList<String>();//arraylist copia de arraylist nombres
	ArrayList<int[]> ArrayCopiaNotas = new ArrayList<int[]>();//arraylist copia de arraylist notas
	ArrayList<String> SegmentoLista = new ArrayList<String>();//arraylist sub de arraylist nombres
	ArrayList<int[]>  SegmentoListaNotas = new ArrayList<int[]>();//arraylist sub de arraylist notas
	
	public void menu() {
		System.out.println("\nMenu");
		System.out.println("1. ALTA");
		System.out.println("2. BAJA");
		System.out.println("3. MODIFICAr");
		System.out.println("4. CONSULTA");
		System.out.println("5. LISTAR");
		System.out.println("6. VACIAR");
		System.out.println("7. HACER UNA COPIA");
		System.out.println("8. VISUALIZAR COPIA");
		System.out.println("9. SUBLISTA");
		System.out.println("10. SALIR");
		System.out.println("Introduce opcion");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 1:alta(); break;
		case 2:baja(); break;
		case 3:modificar(); break;
		case 4:consulta(); break;
		case 5:listar(); break;
		case 6:vaciar(); break;
		case 7:copia(); break;
		case 8:visualizarCopia(); break;
		case 9:sublista(); break;
		case 10:break;
		default: menu();
		}
	}//menu
	
	public void alta() {
	System.out.println("Dame nombre");
	String nombre=scanner.next();
	nombres.add(nombre);
	
	int [] notasAlumno = new int [3];
		for (int i=0; i<3;i++) {
			System.out.println("Dame una nota");
			notasAlumno[i]=scanner.nextInt();
		}
	System.out.println("el alta lo quieres eligiendo posicion o alfinal");
	String opcion=scanner.next();
						
			if (opcion.equalsIgnoreCase("alfinal")) {
				nombres.add(nombre);//mete el vector en el arrayList
				notas.add(notasAlumno);
			}else if(opcion.equalsIgnoreCase("posicion")){
				int posicion = scanner.nextInt();
					if (posicion>=0 && posicion<nombres.size()) {
						nombres.add(posicion,nombre);
						notas.add(posicion,notasAlumno);
					}else {
					System.out.println("posicion incorrecta");
					}
			}else{
				System.out.println("");
			}
			menu();
	}//alta
		
	public void baja() {
		System.out.println("dame el nombre del alumno xa darle de baja");
		String nombre=scanner.next();
			if (nombres.contains(nombre)) {//si lo contiene
				int posicion=nombres.indexOf(nombre);//sacar posicion
				nombres.remove(nombre);	
				notas.remove(posicion);
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
			if (nombres.contains(nombre)) {//si lo contiene
				int [] notasAlumno= new int[3];
				int posicion=nombres.indexOf(nombre);//sacar posicion
				notasAlumno=notas.get(posicion);//me vaya al AL y me lo lleve a otro vetor /////////////////////////////////////puente vector arrayList
			
				for (int j=0; j<3;j++) {
				System.out.print(notasAlumno[j]);
				}
			}else {
				System.out.println("el alumno no existe");
		    }
		    menu();
	}
	
	public void listar() {
		int notasAlumno[]= new int[3];//vector para poderle visualizar
			for (int i=0; i<nombres.size();i++) {//recorrer el arrayList
				System.out.print("\n"+ nombres.get(i)+"\t");
				notasAlumno=notas.get(i);/////////////////////////////////////puente vector arrayList
				
				for (int j=0; j<3;j++) {//recorrer el vector
					System.out.print(notasAlumno[j] + " ");
				}
		}
		menu();
	}
	
	public void vaciar() {
		System.out.println("Has elegido la opcion de vaciar el arrayList. Estas seguro(s/n)");
		String opcion=scanner.next();
			if(opcion.equalsIgnoreCase("s")) {
				notas.clear();
				nombres.clear();
				System.out.println("Lista vacia");
			}else {
			System.out.println("Has elegido no borrar");
		}
		menu();	
	}
	
	public void copia() {
		System.out.println("Has elegido copiar los dos arrayLits");
		ArrayCopia.addAll(nombres);
		ArrayCopiaNotas.addAll(notas);
		System.out.println("Copia realizada");
			
		menu();	
	}
	
	public void visualizarCopia() {
		System.out.println("Has elegido visualizar las copias los dos arrayLits");
		int notasAlumno[]= new int[3];//vector para poderle visualizar
			for (int i=0; i<ArrayCopia.size();i++) {//recorrer el arrayList copia
				System.out.print("\n"+ ArrayCopia.get(i)+"\t");
				notasAlumno=ArrayCopiaNotas.get(i);/////////////////////////////////////puente vector arrayList
					
				for (int j=0; j<3;j++) {//recorrer el vector
					System.out.print(notasAlumno[j]);
				}
		}
		menu();
	}
	public void sublista() {
		int tam=nombres.size();
		System.out.println("El tamaño de la lista es: " + tam);
		
		System.out.println("dime la posicion inicial a extraer");
		int posicionInicial=scanner.nextInt();
		System.out.println("dime la posicion final de la lista");
		int posicionFinal=scanner.nextInt();
		
			if ((posicionInicial>=0 && posicionFinal<SegmentoLista.size()) && (posicionInicial>=0 && posicionFinal<SegmentoListaNotas.size())) {
				SegmentoLista.addAll(nombres.subList(posicionInicial, posicionFinal));
				SegmentoListaNotas.addAll(notas.subList(posicionInicial, posicionFinal));
		
				for(String e:SegmentoLista) {
					System.out.println(e);
				}
		
					for(int[] f:SegmentoListaNotas) {
						int notas[]=f;
			
						for (int j=0; j<notas.length;j++) {
							System.out.println(f);
						}
				}
		}
		menu();
	}
}//EjeArrayList9
