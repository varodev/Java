package BucleFor;
import java.util.*;
public class ejeFor11 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	int aprobados = 0;
	int suspensos = 0;
	int condicionados = 0;
	
		for (i=1; i<6; i++) {
			System.out.println("introduce la nota");
			int nota = scanner.nextInt();
			
				if (nota == 4) {
					condicionados++;
				}
				if (nota >= 5) {
					aprobados++;
				}
				if (nota < 4) {
					suspensos++;
				}
		}//for
		System.out.println("cantidad de aprobados: " + aprobados );
		System.out.println("cantidad de suspensos: " + suspensos );
		System.out.println("cantidad de condicionados: " + condicionados);
}//try
    }//main
}//ejeFor11
