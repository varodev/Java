import java.util.*;
public class Eje_Angulo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el angulo");
		int angulo = sc.nextInt();
		
		double valorSeno = seno(angulo);
		double valorCoseno = coseno(angulo);
		double valorTangente = tangente(angulo);
	System.out.println("el valor del seno es: " + valorSeno +
	", " + "el valor del coseno es: " + valorCoseno +
	", " + "el valor de la tangente es: " + valorTangente);
					
	}
	public static double seno(int angulo){
		double sen = Math.sin(angulo);
		return sen;
	}

    public static double coseno(int angulo){
		double cosen = Math.cos(angulo);
		return cosen;
	}
	public static double tangente(int angulo){
		double tangent = Math.tan(angulo);
		return tangent;
	}
	
}