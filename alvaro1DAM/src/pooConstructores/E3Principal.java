package pooConstructores;
import java.util.*;
public class E3Principal {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String titulo, autor;
			int ejemplares;

			//se crea el objeto libro1 utilizando el constructor con parámetros
		E3Libro libro1 = new E3Libro("El quijote", "Cervantes", 1, 0);
			//se crea el objeto libro3 utilizando el constructor por defecto
		E3Libro libro3 = new E3Libro("El quijote", "Julio", 3);

//introducir por teclado los set, faltan dos objetos
	//se asigna a libro2 los datos pedidos por teclado.
		E3Libro libro2 = new E3Libro();
			System.out.print("Introduce titulo: ");
			titulo = sc.nextLine();
			libro2.setTitulo(titulo);
			System.out.print("Introduce autor: ");
			autor = sc.nextLine();
			libro2.setAutor(autor);
			System.out.print("Numero de ejemplares: ");
			ejemplares = sc.nextInt();
			libro2.setEjemplares(ejemplares);

			//mostrar los datos del objeto libro1
			System.out.println("Libro 1:");
			System.out.println("Titulo: " + libro1.getTitulo());
			System.out.println("Autor: " + libro1.getAutor());
			System.out.println("Ejemplares: " + libro1.getEjemplares());
			System.out.println("Prestados: " + libro1.getPrestados());
			System.out.println();

			//mostrar los datos del objeto libro2
			System.out.println("Libro 2:");
			System.out.println("Titulo: " + libro2.getTitulo());
			System.out.println("Autor: " + libro2.getAutor());
			System.out.println("Ejemplares: " + libro2.getEjemplares());
			System.out.println("Prestados: " + libro2.getPrestados());
			System.out.println();
			
			//mostrar los datos del objeto libro3
			System.out.println("Libro 2:");
			System.out.println("Titulo: " + libro3.getTitulo());
			System.out.println("Autor: " + libro3.getAutor());
			System.out.println("Ejemplares: " + libro3.getEjemplares());
			System.out.println("Prestados: " + libro3.getPrestados());
			System.out.println();
			
			//se realiza un préstamo de libro1. El método devuelve true si se ha podido
			//realizar el préstamo y false en caso contrario
	if (libro1.prestamo()) {
		System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	} else {
		System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	}

			//se realiza una devolución de libro1. El método devuelve true si se ha podido
			//realizar la devolución y false en caso contrario
	if (libro1.devolucion()) {
		System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
	} else {
		System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
	}

			//se realiza otro préstamo de libro1
	if (libro1.prestamo()) {
		System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	} else {
		System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	}

			//se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
			//solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
			//pantalla el mensaje No quedan ejemplares del libro…
	if (libro1.prestamo()) {
		System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	} else {
		System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	}

		}
        System.out.println();
    }

	}


