package condicionalesIFSwitch;
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
        int cantidad = scanner.nextInt();
      
        if (cantidad > 1000) {
        System.out.println(Nombcli + " ha comprado " + producto + ", " + getPrize(precioProducto*cantidad, 20, true) + " euros");
        }
        else {
        System.out.println(Nombcli + " ha comprado " + producto + ", " + getPrize(precioProducto*cantidad, 20, false) + " euros");
        }
                
scanner.close();
	}//main
	public static double getPrize(double precioTotal, double descuento, boolean hayDescuento) {
		if (hayDescuento ==  true) {
			precioTotal = (precioTotal * descuento/100);
		}
		return precioTotal;
	}//getPrize
}//Testing15
