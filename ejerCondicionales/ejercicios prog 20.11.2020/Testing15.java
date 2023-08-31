package alvaro;
import java.util.*;
public class Testing15 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce nombre cliente");
        String Nombcli = scanner.nextLine();
        System.out.println("introduce producto");
        String producto = scanner.nextLine();
        System.out.println("introduce precio del producto");
        double precioProducto = scanner.nextDouble();
        System.out.println("introduce cantidad");
        double cantidad = scanner.nextDouble();
        
        
        if (cantidad > 1000) {
        	double resultado = getPrize(precioProducto*cantidad, 20, true );
        	System.out.println("el precio total de la compra es: " + resultado);
        }
        else {
        	double resultado = getPrize(precioProducto*cantidad, 20, false );
        	System.out.println("el precio total de la compra es: " + resultado);
        }
                
scanner.close();
	}//main
	public static double getPrize (double precioTotal, double descuento, boolean hayDescuento) {
		if (hayDescuento ==  true) {
			precioTotal = (precioTotal * descuento/100);
		}
		return precioTotal;
		
	}//getPrize
}//Testing15
