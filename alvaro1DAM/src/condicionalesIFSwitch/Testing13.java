package condicionalesIFSwitch;
import java.util.*;
public class Testing13 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("introduce el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("introduce el segundo numero");
        int numero2 = scanner.nextInt();
		
		int result = calcularSuma (numero1, numero2);   
		double resultado = calcularPotencia (numero1, numero2);
     
        if (result > 10) {
        	System.out.println("el resultado de la suma es: " + result);
		}
		else {
			System.out.println("el resultado de la potencia es: " + resultado);
		}
        
scanner.close();
	}//main
	public static int calcularSuma (int numero1, int numero2) {
		return numero1 + numero2;
	}
	public static double calcularPotencia (int numero1, int numero2) {
		return (int) Math.pow(numero1, numero2);
	}
}//Testing13
