package BucleFor;
import java.util.*;
public class ejeFor10 {
	public static void main(String[] args) {
try(Scanner scanner = new Scanner (System.in);){
	
	int i;
	double importe_factura;
	double facturacion_total=0;
	double precio;
	int litros_cod1=0;
	int mas600=0;
	
		for (i=1; i<=5; i++) {
			System.out.println("Factura nº " + i);
			System.out.println("Código de productos: ");
			int codigo = scanner.nextInt();
			System.out.println("Cantidad litros: ");
			int litros = scanner.nextInt();
						
				switch (codigo) {
				case 1:
					precio = 0.6f;
					break;
				case 2:
					precio = 3f;
					break;
				case 3:
					precio = 1.25f;
					break;
				default:
					precio = 0;
				}//switch
				
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
}//ejeFor10
