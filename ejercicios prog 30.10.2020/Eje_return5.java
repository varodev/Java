import java.util.*;
public class Eje_return5{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
    
		final double IVA = 0.21;
		System.out.println("Introduce precio producto");
		double Precio = sc.nextDouble();
	
		double resultado = Precio_final (Precio, IVA);
		System.out.println("el resultado es: " + resultado);
	}
	
    public static double Precio_final(double Precio, double IVA){
		double Precio_finl = Precio + (Precio * IVA);
		return Precio_finl;
	}
		
}