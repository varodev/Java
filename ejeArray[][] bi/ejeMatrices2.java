package matrices;
import java.util.*;
public class ejeMatrices2 {
	Scanner scanner;
	int [][] NOTAS;
	int sumaNotaAlumno;
	double mediaNotaAlumno;
	int sumaNotaAsignatura;
	double mediaNotaAsignatura;
		
	public void rellenar(){
		scanner= new Scanner(System.in);
		NOTAS= new int[2][3];
			for(int f=0; f<NOTAS.length;f++) {
				for (int c=0; c<NOTAS[f].length;c++) {
					System.out.println("introduzca nota del asignaturas " + (f+1) + " y las notas de alumnos " + (c+1));
					NOTAS[f][c]=scanner.nextInt();
				}
			}
	}//rellenar
	
	public void mediaAlumno() {
		for(int f=0; f<NOTAS.length;f++) {
			for (int c=0; c<NOTAS[f].length;c++) {
				sumaNotaAlumno = sumaNotaAlumno+NOTAS[f][c];
		    }	
			
		}
		mediaNotaAlumno=sumaNotaAlumno/2;
	}
	
	public void mediaAsignatura() {
		for(int c=0; c<NOTAS.length;c++) {
			for (int f=0; f<NOTAS[c].length;f++) {
				sumaNotaAsignatura= sumaNotaAsignatura+NOTAS[f][c];//esto no se toca, siempre filas y columnas
		    }
	     }
		mediaNotaAsignatura=sumaNotaAsignatura/3;
	}
	
	public static void main(String[] args) {
		ejeMatrices2 matrix = new ejeMatrices2();
			matrix.rellenar();
			matrix.mediaAlumno();
			matrix.mediaAsignatura();
	}

}
