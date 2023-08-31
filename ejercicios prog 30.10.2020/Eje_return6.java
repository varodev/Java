import java.util.*;
public class Eje_return6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce los grados centigrados");
		double grados = sc.nextDouble();
				
		double resultado = formula (grados);
        System.out.println("el valor de grados a F es: " + resultado);	
		}
	
	public static double formula (double grados){
		double formul = 32 + (9 * grados / 5);
		return formul;
		}
		
}