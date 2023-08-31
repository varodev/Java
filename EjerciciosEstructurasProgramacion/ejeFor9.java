package BucleFor;
import java.util.*;
public class ejeFor9 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	double importe_factura;
	double facturacion_total=0;
	int litros_cod1=0;
	int mas600=0;
	
		for (i=1; i<=5; i++) {
			System.out.println("Factura nº " + i);
			System.out.println("Código de productos: ");
			int codigo = scanner.nextInt();
			System.out.println("Cantidad litros: ");
			int litros = scanner.nextInt();
			System.out.println("Precio litros: ");
			double precio = scanner.nextDouble();
			
			importe_factura = litros*precio;
			
			facturacion_total = facturacion_total + importe_factura;
			
				if (codigo == 1) {
					litros_cod1 = litros_cod1 + litros;
				}
				if (importe_factura >= 600) {
					mas600++;
				}
			}//for
				System.out.println("Resumen");
				System.out.println("Facturacion total es de: " + facturacion_total + "€");
				System.out.println("Ventas de productos 1: " + litros_cod1 + "litros");
				System.out.println("Cantidad facturas superiores a 600€: " + mas600);
}//try
    }//main
}//ejeFor9
