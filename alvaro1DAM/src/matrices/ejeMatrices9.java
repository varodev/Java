package matrices;
import java.util.*;
public class ejeMatrices9 {
	Random rnd = new Random();
	int f;
	int c;
	int  arraySueldos[][];
	String vectorEmpleados[];
	int ingresoSueldo3Meses[];
	int sum3Meses=0;
	int sumita;
	int mayorSueldo=0;
	int counterMayor;
		 			
	public void rellenar(){
		System.out.println("Autorellenado...");
		arraySueldos= new int[4][3];
		for(int f=0; f< arraySueldos.length;f++) {
				for (int c=0; c<arraySueldos[f].length;c++) {
					arraySueldos[f][c]=rnd.nextInt(700);
				}
			}
	}//rellenar
	
	public void operar() {
		System.out.println();
		System.out.println("\nOperando...");
	vectorEmpleados = new String[4];
	ingresoSueldo3Meses=new int[4];
	
		vectorEmpleados[0]="Marcos";	
		vectorEmpleados[1]="Ana";
		vectorEmpleados[2]="Luis";
		vectorEmpleados[3]="Maria";
		
		System.out.print("Los Empleados son: ");
		for (f=0;f<4;f++) {
			System.out.print(vectorEmpleados[f] + " ");
		}
		System.out.println();
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<arraySueldos.length;f++) {
			System.out.println();
			for (int c=0; c<arraySueldos[f].length;c++) {
				System.out.print(arraySueldos[f][c] + " ");
			}
		}
		
		for(int f=0; f<arraySueldos.length;f++) {
			for (int c=0; c<arraySueldos[f].length;c++) {
				sum3Meses=sum3Meses+arraySueldos[f][c];
				
			}
			ingresoSueldo3Meses[f]=sum3Meses;
			sum3Meses=0;
		}
		//punto1
		System.out.println("\n");
		System.out.println("Realizar la carga de la información mencionada");
		for(int f=0; f<arraySueldos.length;f++) {
			System.out.print("El empleado " +  vectorEmpleados[f] + " ha ganado:");
			for (int c=0; c<arraySueldos[f].length;c++) {
				System.out.print(" " + arraySueldos[f][c]);
			}
			System.out.println(" con un total en 3 meses de: " + ingresoSueldo3Meses[f]);
		}
		//punto2		
		System.out.println(" ");
		System.out.println("Generar un vector que contenga el ingreso acumulado en sueldos acumulado en los ultimos 3 meses");
		for(f=0;f<4;f++) {
			System.out.print(ingresoSueldo3Meses[f] + " ");
		}
		//punto3
		System.out.println("\n");
		System.out.println("Mostrar por pantalla el total pagado en sueldos a todos los empreadso en los 3 ultimos meses");
		for(f=0;f<4;f++) {
			sumita=sumita+ingresoSueldo3Meses[f];
		}
		System.out.println(sumita);
		
		//punto4
		System.out.println(" ");
		System.out.println("Obtener el nombre del empleado que tuvo el mayor ingreso en los últimos 3 meses");
		for(f=0;f<4;f++) {
			if(mayorSueldo<ingresoSueldo3Meses[f]) {
				mayorSueldo=ingresoSueldo3Meses[f];
				counterMayor=f;
			}
		}
		System.out.println("El sueldo mayor es de " + vectorEmpleados[counterMayor] + " con " + mayorSueldo);
			
	}//operar	
	
	public static void main(String[] args) {
		ejeMatrices9 matrix = new ejeMatrices9();
			matrix.rellenar();
			matrix.operar();
	}
}
