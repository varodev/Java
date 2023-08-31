import java.util.*;
public class Eje_return1{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("el numero1 es: ");
		int n1 = sc.nextInt();
		
		System.out.println("el numero2 es: ");
		int n2 = sc.nextInt();
		
		
		int resultado = suma(n1, n2);
		int resultado1 = resta(n1, n2);
		int resultado2 = multiplicacion(n1, n2);
		int resultado3 = division(n1, n2);
		int resultado4 = modulo(n1, n2);
		
		System.out.println("el valor de la suma es la siguiente: " + resultado);
		System.out.println("el valor de la resta es la siguiente: " + resultado1);
		System.out.println("el valor de la multiplicacion es la siguiente: " + resultado2);
		System.out.println("el valor de la division es la siguiente: " + resultado3);
		System.out.println("el valor de la modulo es la siguiente: " + resultado4);
		}
		
	public static int suma(int n1, int n2){
		int sum = n1 + n2;
		return sum;
			
	}

	public static int resta(int n1, int n2){
		int rest = n1 - n2;
		return rest;
			
	}
	public static int multiplicacion(int n1, int n2){
		int multiplicacin = n1 * n2;
		return multiplicacin;
			
	}
    public static int division(int n1, int n2){
		int divisin = n1 / n2;
		return divisin;
			
	}
    public static int modulo(int n1, int n2){
		int modul = n1 % n2;
		return modul;
			
	}
}