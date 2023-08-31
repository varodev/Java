package BucleFor;
import java.util.*;
public class ejeFor7 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	int mediaEdad=0;
	int sumEdad=0;
	int mayEdad=0;
	double mayor175=0;
	double media_alt=0;
	double sum_alt=0;
	
	for (i=1; i<5; i++) {
		System.out.println("Alumno " + i);
		System.out.println("Introduce edad: ");
		int edad = scanner.nextInt();
		System.out.println("Introduce altura");
		double altura = scanner.nextDouble();
		
		if (edad > 18) {
			mayEdad++;
		}
		if (altura > 1.75) {
			mayor175++;
		}
		sumEdad = sumEdad + edad;
		sum_alt = sum_alt + altura;
	}//for

	mediaEdad = sumEdad/5;
	media_alt = sum_alt/5;
	
	System.out.println("La media de edad es: " + mediaEdad);
	System.out.println("La media de altura es: " + media_alt);
	System.out.println("Cantidad de alumnos con 18 años: " + mayEdad);
	System.out.println("Cantidad de alumnos que mide más de 1.75: " + mayor175);
}//try
    }//main
}//ejeFor7
