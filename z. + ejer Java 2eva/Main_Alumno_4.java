package clases;

public class Main_Alumno_4 {

	public static void main(String[] args) {

		Alumno_4 alumno1 = new Alumno_4("Blanca", 21);
		Alumno_4 alumno2 = new Alumno_4("Pepe",24);
		Alumno_4 alumno3 = new Alumno_4("Manolo", 19);

		//Vamos a hacer más mayor a Blanca y cambiarla el nombre
		alumno1.nombre="Blanca Paloma";
		alumno1.edad=27;
		
		System.out.println("Los nombres de los alumnos son:");
		System.out.println("- "+alumno1.nombre);
		System.out.println("- "+alumno2.nombre);
		System.out.println("- "+alumno3.nombre);
		double media = (double)(alumno1.edad+alumno2.edad+alumno3.edad)/3;
		
		System.out.println("La media de edad es "+ media);
		
	}

}
