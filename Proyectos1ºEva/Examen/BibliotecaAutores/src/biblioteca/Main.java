package biblioteca;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;


	public class Main {
		Scanner sc = new Scanner (System.in);
		
			//1 CREAMOS UNA CLASE MENU CON LOS OPCIONES DEL SWITCH
		
		   public void menu() throws Exception {
			System.out.println("Biblioteca de autores");
			System.out.println("                      ");
			System.out.println("Selecciona una opción");
			System.out.println("1. Comprobar si el fichero de autores existe");
			System.out.println("2. Introducir un autor en el fichero");
			System.out.println("3. Mostrar los autores contenidos en el fichero");
			System.out.println("4. Borrar un fichero");
			System.out.println("5. Salir");
			int opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				comprobar();
				menu(); {
				break;
			}
			case 2:
				escribir();
				menu(); {
				break;
			}
			case 3:
				mostrar();
				menu(); {
				break;
				}
		
			case 4:
				borrar();
				menu(); {
				break;
			}
		
			case 5:
				salir();
				menu(); {
				break;
			}
			default:
				System.err.println("Opcion incorrecta");
			}// switch
		}// menu
		   
		   
		   public void comprobar() throws Exception {

				System.out.println("ESTAMOS EN EL METODO COMPROBAR");
			
				System.out.println("Dame la ruta para comprobar si existe el fichero");
				String ruta = sc.next();
				System.out.println("Dame el nombre del fichero");
				String nombre = sc.next();

				File f = new File(ruta, nombre);

				if (f.exists()) {
					System.out.println("El fichero existe");

				} else {
					System.out.println("El fichero no existe, pero lo vamos a crear, para verlo vuelve a ejecutar");
					f.createNewFile();
				}

			}

			public void escribir() throws Exception {

				System.out.println("ESTAMOS EN EL METODO INTRODUCIR AUTORES");
				
				System.out.println("Dame la ruta donde esta el fichero donde quieres escribir");
				String ruta = sc.next();
				System.out.println("Dame el nombre del fichero");
				String nombre = sc.next();

				File f = new File(ruta, nombre);
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);

				String nombresAutores;

				if (f.exists()) {

					System.out.println("Vamos a introducir 5 nombres de autores");
					for (int i = 0; i < 5; i++) {
						System.out.println("Dame los nombres:" + (i + 1));
						nombresAutores = sc.next();

						bw.write(nombresAutores);
						bw.newLine();
					}

				
					bw.flush();
					bw.close();
				} else {
					System.out.println("Fichero o ruta no encontrado");
				}
			}
			
			public void mostrar() throws Exception {

				System.out.println("ESTAMOS EN EL METODO MOSTRAR");
			
				System.out.println("Dame la ruta del fichero a mostrar");
				String ruta = sc.next();
				System.out.println("Dame el nombre del fichero a mostrar");
				String nombre = sc.next();

				File f = new File(ruta, nombre);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr); /* Para mostrar, que es leer, siempre necesitaremos el BR */

				String linea;

				if (f.exists()) {

					System.out.println("El contenido del fichero es el siguiente");

					while ((linea = br.readLine()) != null) {

						System.out.println(linea);

					}

				} else {
					System.out.println("El fichero no tiene contenido");
				}

			}
			
			public void borrar() {

				/*
				 * VAMOS A PASARLE EL NOMBRE DE UN FICHERO Y SI LO DETECTA LO BORRA, SI NO SALE
				 * AL ELSE
				 */

				System.out.println("ESTAMOS EN EL METODO BORRAR");
			
				System.out.println("Dame la ruta donde esta el fichero a borrar");
				String ruta = sc.next();
				System.out.println("Dame el nombre del fichero a borrar");
				String nombre = sc.next();

				File f = new File(ruta,nombre);

				if (f.exists()) {
				
					System.out.println("El fichero existe y como existe lo vamos a borrar " + f.delete());
					
				} else {
					System.out.println("La ruta, o el fichero no se ha encontrado, no borrado");
				}
			}

	

	public void salir() throws Exception {

		System.out.println("!! Has pulsado salir!!");
		menu();
	}

	public static void main(String[] args) throws Exception {

		Main objeto = new Main();
		objeto.menu();

	}// main

}// clase
			
			


