package matrices;
import java.util.*;
public class ejeMatrices7 {
	Random rnd = new Random();
	int f;
	int c;
	int NUM[][];
	int ventas[];//ventas de cada vendedor
	int ventasDiarias[];//ventas por dia
	String vendedores[];
	String diaSemana[];
	int sumVendedor=0;
	int sumVendedorDiario=0;
	//int sumTienda;
			
	public void rellenar(){
		System.out.println("Autorellenado...");
		NUM= new int[3][7];
		for(int f=0; f< NUM.length;f++) {
				for (int c=0; c<NUM[f].length;c++) {
					NUM[f][c]=rnd.nextInt(9)+1;
				}
			}
	}//rellenar
	
	public void imprimir() {
		System.out.println("\nLa matriz queda asi impresa");
		for(int f=0; f<NUM.length;f++) {
			System.out.println();
			for (int c=0; c<NUM[f].length;c++) {
				System.out.print(NUM[f][c] + " ");
			}
		}
	}//imprimir
	
	public void operar() {
		ventas=new int[NUM.length];
		ventasDiarias=new int[NUM[f].length];
		System.out.println();
		System.out.println("\nOperando...");
		System.out.println();
		for(int f=0; f< NUM.length;f++) {//ventas totales semanales de cada vendedor(f)
			for (int c=0; c<NUM[f].length;c++) {
				sumVendedor=sumVendedor+NUM[f][c];
			}
			ventas[f]=sumVendedor;
			sumVendedor=0;
		}
		
		for (int c=0; c<NUM[f].length;c++) {// totales de las ventas diarias(c)
			for(int f=0; f< NUM.length;f++) {
				sumVendedorDiario=sumVendedorDiario+NUM[f][c];
			}
			ventasDiarias[c]=sumVendedorDiario;
			sumVendedorDiario=0;
		}
		
		vendedores=new String[3];//vector de vendedores
            vendedores[0]="alvaro";
			vendedores[1]="ana";
			vendedores[2]="miguel";
		
		diaSemana=new String[7];// vector de dia sememana
		    diaSemana[0]="lunes";
			diaSemana[1]="martes";
			diaSemana[2]="miercoles";
			diaSemana[3]="jueves";
			diaSemana[4]="viernes ";
			diaSemana[5]="sabado";
			diaSemana[6]="domingo";
					
		for (f=0;f<3;f++) {//este for recorre el vector de vendedores añadiendo el valor de ventas totales semanales de cada vendedor(f)
			System.out.println("el vendedor " + vendedores[f] + " ha vendido " + ventas[f] );
		}
		System.out.println();
		for (f=0; f<7; f++) {//es for recorre el vector de día de la semana  añadiendo el valor de totales de las ventas diarias(c)
			System.out.println(" el dia " + diaSemana[f] + " se ha vendido en la tienda " + ventasDiarias[f] );	
		}
	}//operar	
			
	public static void main(String[] args) {
		ejeMatrices7 matrix = new ejeMatrices7();
			matrix.rellenar();
			matrix.imprimir();
		    matrix.operar();
	}
}
