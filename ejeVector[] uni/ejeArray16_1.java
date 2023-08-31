package vectores;
import java.util.*;
public class ejeArray16_1 {

		Scanner scanner;
		
		String datosAlumnos[];
		int notas[];
		int notaMayor=0;
		int counterMayor;
		int notaMenor=10;
		int counterMenor;
								
		public void Guardar() {
			scanner=new Scanner(System.in);
			 datosAlumnos = new String[10];	
			 notas = new int[10];
				for (int i=0; i<10;i++) {
					System.out.println("Introduce el nombre del alumno " + (i+1));
					datosAlumnos[i]=scanner.nextLine();
					
					System.out.println("Introduce la nota del alumno " + (i+1));
					notas[i]=scanner.nextInt();
	            }
				
				for (int i=0; i<notas.length;i++) {//con empate
					if (notaMayor<notas[i]) {
						notaMayor=notas[i];
						//counterMayor=i;
					}
					if (notaMenor>notas[i]) {
						notaMenor=notas[i];
						//counterMenor=i;
					}
				}
		}//guardar
		
		public void empate() {
			for (int i=0; i<notas.length;i++) {//empate en la mayor nota
				if (notaMayor==notas[i]) {
					System.out.println( "la mayor nota es de " + datosAlumnos[i] + "con un " + notaMayor);
				}
			}
			for (int i=0;i<notas.length;i++) {//empate en la menor nota
				if(notaMenor==notas[i]) {
					System.out.println( "la menor nota es de " + datosAlumnos[i] + "con un " + notaMenor);	
				}
			}
		}//empate

  public static void main(String[] args) {
	ejeArray16_1 eje= new ejeArray16_1();
		eje.Guardar();
		eje.empate();
  }//main
}//ejeArray16
