package condicionalesIFSwitch;
import java.util.*;
public class eje_swE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("introduzca el monto");
		double monto = scanner.nextDouble();
		System.out.println("introduzca dia de la semana");
		String diaSemana = scanner.next();

		int descuento = (int) ((int) monto * (0.15));

		switch (diaSemana) {
		case "lunes":
		System.out.println("no hay descuento");
		System.out.println(monto);
			break;
		case "martes":
		System.out.println(descuento + "%");
		System.out.println(monto - descuento + "€");
			break;
		case "miercoles":
			System.out.println("no hay descuento");
			System.out.println(monto);
			break;
		case "jueves":
			System.out.println(descuento + "%");
			System.out.println(monto - descuento + "€");
			break;
		case "viernes":
			System.out.println("no hay descuento");
			System.out.println(monto);
			break;
		case "sabado":
			System.out.println("no hay descuento");
			System.out.println(monto);
			break;
		case "domingo":
			System.out.println("no hay descuento");
			System.out.println(monto);
			break;
		       default:
	    	   System.out.println("algo mal estas haciendo");
	       }
scanner.close();
    }//main
}//eje_swE
