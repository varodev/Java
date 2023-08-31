package ev3.ejercicios.colegio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		Alumno alumno = crearAlumno();
		
		System.out.println();
		System.out.println("El nombre del alumno es: " + alumno.getNombreCompleto());
		
		alumno.setNombreCompleto("Pedro Jimeno Pérez");
		
		System.out.println("El nombre del alumno es: " + alumno.getNombreCompleto());
		
//		alumno.ti
	}
	
	public static Alumno crearAlumno() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre completo del alumno:");
		String nombreCompleto = scanner.nextLine();
		
		System.out.println("Introduzca la titulación en la que va a ser matriculado:");
		String titulacion = scanner.nextLine();
		
		System.out.println("Introduzca el curso del alumno:");
		int curso = scanner.nextInt();
		scanner.nextLine();
		
		Alumno alumno = null;
		
		try {
			
			alumno = new Alumno(nombreCompleto, titulacion, curso);
			
		} catch(RuntimeException e) {

			System.out.println("Por favor vuelva a introducir el nombre del alumno:");
			
			while(nombreCompleto.length() < 7) {
				
				System.out.println("Introduzca un nombre con más de 7 caracteres:");
				nombreCompleto = scanner.nextLine();
			}
			
			alumno = new Alumno(nombreCompleto, titulacion, curso);
		}
		
		return alumno;
	}

}
